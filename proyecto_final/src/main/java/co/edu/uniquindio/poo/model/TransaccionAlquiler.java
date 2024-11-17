package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class TransaccionAlquiler extends Transaccion{

    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private double monto;
    private int dias;
    
    public TransaccionAlquiler(String codigo, LocalDate fechaAlquiler, LocalDate fechaDevolucion, double monto,
            int dias) {
        super(codigo);
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.monto = monto;
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

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    protected String getTipo() {
        return getClass().getSimpleName();
    }

    @Override
    public void procesar(SistemaConcesionario sitema, Cliente cliente, Vehiculo vehiculo, Empleado empleado) {
        setSistema(sitema);
        if (vehiculo.isDisponible()) {
            setCliente(cliente);
            setEmpleado(empleado);
            setVehiculo(vehiculo);
            setFechaAlquiler(LocalDate.now());
            setFechaAlquiler(LocalDate.now().plusDays(dias));
            vehiculo.setDisponible(false);
            this.monto = calcularMontoAlquiler();

            getSistema().getRegistro().registrarTransaccion(this);
            getEmpleado().getTransacciones().add(this);

            System.out.println("Transacción de alquiler procesada exitosamente para el vehículo: "
                    + vehiculo.getMarca() + " (" + vehiculo.getModelo() + ")");
        } else {
            System.out.println("El vehículo no está disponible para alquiler.");
        }
    }

    private double calcularMontoAlquiler() {
        return 100.0;
    }

    
    
    
}
