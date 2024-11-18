package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class TAlquiler extends Transaccion {

    // Fecha en la que se inicia el alquiler
    private LocalDate fechaAlquiler;

    // Fecha en la que se debe devolver el vehículo
    private LocalDate fechaDevolucion;

    // Monto total del alquiler
    private double monto;

    // Número de días que dura el alquiler
    private int dias;

    /**
     * Constructor de la clase TAlquiler.
     *
     * @param codigo Código único que identifica la transacción de alquiler.
     * @param dias   Número de días que dura el alquiler.
     */
    public TAlquiler(String codigo, int dias) {
        super(codigo);
        this.dias = dias;
        this.monto = calcularMontoAlquiler();
    }

    /**
     * Procesa la transacción de alquiler.
     * 
     * Si el vehículo está disponible, se actualizan los detalles de la transacción
     * y se registra en el sistema. Si no está disponible, el alquiler no se
     * realiza.
     *
     * @param sistema  Sistema de concesionario involucrado.
     * @param cliente  Cliente que alquila el vehículo.
     * @param vehiculo Vehículo que se alquila.
     * @param empleado Empleado que procesa la transacción.
     */
    @Override
    public void procesar(SistemaConcesionario sistema, Cliente cliente, Vehiculo vehiculo, Empleado empleado) {
        setSistema(sistema);
        if (vehiculo.isDisponible()) {
            setCliente(cliente);
            setEmpleado(empleado);
            setVehiculo(vehiculo);
            setFechaAlquiler(LocalDate.now());
            setFechaDevolucion(LocalDate.now().plusDays(dias));
            vehiculo.setDisponible(false);
            this.monto = calcularMontoAlquiler();
            getSistema().getRegistro().registrarTransaccion(this);
    
            // Verifica si la lista de transacciones es null antes de agregar
            if (empleado != null && empleado.getTransacciones() != null) {
                empleado.getTransacciones().add(this);
                System.out.println("Transacción de alquiler procesada exitosamente para el vehículo: " 
                        + vehiculo.getMarca() + " (" + vehiculo.getModelo() + ")");
            } else {
                System.out.println("Error: El empleado no tiene una lista de transacciones inicializada.");
            }
        } else {
            System.out.println("El vehículo no está disponible para alquiler.");
        }
    }
    

    /**
     * Calcula el monto total del alquiler del vehículo.
     * 
     * El cálculo se basa en una tarifa base por día. Si el alquiler es por más de 7
     * días,
     * se aplica un descuento del 10%.
     *
     * @return Monto total del alquiler.
     */
    private double calcularMontoAlquiler() {
        double tarifaBasePorDia = 50.0;
        double costoTotal = tarifaBasePorDia * dias;
        if (dias > 7) {
            costoTotal *= 0.9; // Aplicar un descuento del 10%
        }
        return costoTotal;
    }

    /**
     * Obtiene el tipo de transacción.
     *
     * @return Nombre de la clase como tipo de transacción.
     */
    public String getTipo() {
        return getClass().getSimpleName();
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Transaccion geTransaccion() {
        return this;
    }

}
