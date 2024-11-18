
package co.edu.uniquindio.poo.model;

import java.time.LocalDate;


public class TCompra extends Transaccion {

    // Fecha en la que se realiza la compra
    private LocalDate fechaCompra;

    // Monto total de la compra
    private double monto;

    /**
     * Constructor de la clase TCompra.
     *
     * @param codigo Código único que identifica la transacción de compra.
     */
    public TCompra(String codigo) {
        super(codigo);
        this.monto = calcularMontoCompra();
    }

    /**
     * Procesa la transacción de compra.
     * 
     * Si el vehículo pasa la revisión técnica, se actualizan los detalles de la
     * transacción
     * y se registra en el sistema. Si no pasa la revisión, la compra no se realiza.
     *
     * @param sistema  Sistema de concesionario involucrado.
     * @param cliente  Cliente que adquiere el vehículo.
     * @param vehiculo Vehículo que se compra.
     * @param empleado Empleado que procesa la transacción.
     */
    @Override
    public void procesar(SistemaConcesionario sistema, Cliente cliente, Vehiculo vehiculo, Empleado empleado) {
        setSistema(sistema);
        if (vehiculo.pasaRevisionTecnica()) {
            setCliente(cliente);
            setEmpleado(empleado);
            setVehiculo(vehiculo);
            setFechaCompra(LocalDate.now());
            this.monto = calcularMontoCompra();
            cliente.vehiculoAdquirido(vehiculo);
            sistema.getRegistro().registrarTransaccion(this);
            empleado.getTransacciones().add(this);
            sistema.getVehiculos().remove(vehiculo);
            System.out.println("Transacción de compra procesada exitosamente para el vehículo: " + vehiculo.getMarca()
                    + " (" + vehiculo.getModelo() + ")");
        } else {
            System.out.println("El vehículo no pasó la revisión técnica y no se puede comprar.");
        }
    }

    /**
     * Calcula el monto total de la compra del vehículo.
     * 
     * El cálculo se basa en el precio base del vehículo más un porcentaje de
     * ganancia.
     *
     * @return Monto total de la compra.
     */
    private double calcularMontoCompra() {
        Vehiculo vehiculo = getVehiculo();
        if (vehiculo == null) {
            System.out.println("No se puede calcular el monto de compra: el vehículo es nulo.");
            return 0.0;
        }
        double precioBase = vehiculo.getPrecio();
        double porcentajeGanancia = 0.10;
        double precioFinal = precioBase * (1 + porcentajeGanancia);
        return precioFinal;
    }

    /**
     * Obtiene el tipo de transacción.
     *
     * @return Nombre de la clase como tipo de transacción.
     */
    public String getTipo() {
        return getClass().getSimpleName();
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

}
