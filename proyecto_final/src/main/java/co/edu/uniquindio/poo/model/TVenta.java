package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class TVenta extends Transaccion {

    private Cliente cliente;
    private Empleado empleado;
    private Vehiculo vehiculo;
    private LocalDate fechaVenta;
    private double monto;
    private SistemaConcesionario sistema;

    /**
     * Constructor de la clase TVenta.
     * 
     * @param codigo el código de la transacción.
     */
    public TVenta(String codigo) {
        super(codigo);
        this.monto = calcularMontoVenta();
    }

    /**
     * Procesa una transacción de venta de un vehículo actualizando la fecha de venta,
     * el cliente, el empleado y los detalles del vehículo.
     * Marca el vehículo como no disponible y calcula el monto de la venta.
     * Registra la transacción en el sistema y la añade a la lista de transacciones del empleado.
     * Muestra un mensaje de éxito si el vehículo está disponible, de lo contrario indica que
     * el vehículo no está disponible para la venta.
     *
     * @param sistema  el sistema de concesionario donde se registra la transacción.
     * @param cliente  el cliente involucrado en la transacción.
     * @param vehiculo el vehículo que se está vendiendo.
     * @param empleado el empleado que maneja la transacción.
     */
    @Override
    public void procesar(SistemaConcesionario sistema, Cliente cliente, Vehiculo vehiculo, Empleado empleado) {
        setSistema(sistema);
        if (vehiculo.isDisponible()) {
            setFechaVenta(LocalDate.now());
            setCliente(cliente);
            setEmpleado(empleado);
            setVehiculo(vehiculo);
            vehiculo.setDisponible(false); // Cambiado a false para marcar como no disponible
            this.monto = calcularMontoVenta();

            this.sistema.getRegistro().registrarTransaccion(this);
            this.empleado.getTransacciones().add(this);

            System.out.println("Transacción de venta procesada exitosamente para el vehículo: "
                    + vehiculo.getMarca() + " (" + vehiculo.getModelo() + ")");
        } else {
            System.out.println("El vehículo no está disponible para la venta.");
        }
    }

    /**
     * Calcula el monto de venta de un vehículo.
     * 
     * @return el precio final del vehículo con un margen de ganancia del 15%.
     *         Retorna 0.0 si el vehículo es nulo.
     */
    private double calcularMontoVenta() {
        Vehiculo vehiculo = getVehiculo();

        if (vehiculo == null) {
            System.out.println("No se puede calcular el monto de venta: el vehículo es nulo.");
            return 0.0;
        }

        double precioBase = vehiculo.getPrecio();
        double porcentajeGanancia = 0.15;
        double precioFinal = precioBase * (1 + porcentajeGanancia);

        return precioFinal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public SistemaConcesionario getSistema() {
        return sistema;
    }

    public void setSistema(SistemaConcesionario sistema) {
        this.sistema = sistema;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
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

    @Override
    public String getTipo() {
        return getClass().getSimpleName();
    }
}