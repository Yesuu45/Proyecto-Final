package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class TransaccionCompra extends Transaccion {
    private LocalDate fechaCompra;
    private double monto;

    public TransaccionCompra(String codigo, LocalDate fechaCompra, double monto) {
        super(codigo);
        this.fechaCompra = fechaCompra;
        this.monto = monto;
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

    @Override
    protected String getTipo() {
        return getClass().getSimpleName();
    }

    @Override
    public void procesar(SistemaConcesionario sistema, Cliente cliente, Vehiculo vehiculo, Empleado empleado) {
        setSistema(sistema);
        if (vehiculo.pasaRevisionTecnica()) {
            setCliente(cliente);
            setEmpleado(empleado);
            setVehiculo(vehiculo);
            setFechaCompra(LocalDate.now());
            vehiculo.setDisponible(false);
            this.monto = calcularMontoCompra();

            cliente.vehiculoAdquirido(vehiculo);
            sistema.getRegistro().registrarTransaccion(this);
            empleado.getTransacciones().add(this);

            System.out.println("Transacción de compra procesada exitosamente para el vehículo: "
                    + vehiculo.getMarca() + " (" + vehiculo.getModelo() + ")");
        } else {
            System.out.println("El vehículo no pasó la revisión técnica y no se puede comprar.");
        }
    }

    private double calcularMontoCompra() {
        return 20000.0;
    }
}
