package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class TransaccionVenta extends Transaccion {
    private String codigo;
    private Cliente cliente ;
    private Empleado empleado;
    private Vehiculo vehiculo;
    private LocalDate fechaVenta;
    private double monto;
    private SistemaConcesionario sistemaConcesionario;
    
    public TransaccionVenta(String codigo, String codigo2, Cliente cliente, Empleado empleado, Vehiculo vehiculo,
            LocalDate fechaVenta, double monto, SistemaConcesionario sistemaConcesionario) {
        super(codigo);
        codigo = codigo2;
        this.cliente = cliente;
        this.empleado = empleado;
        this.vehiculo = vehiculo;
        this.fechaVenta = fechaVenta;
        this.monto = monto;
        this.sistemaConcesionario = sistemaConcesionario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
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

    public SistemaConcesionario getSistemaConcesionario() {
        return sistemaConcesionario;
    }

    public void setSistemaConcesionario(SistemaConcesionario sistemaConcesionario) {
        this.sistemaConcesionario = sistemaConcesionario;
    }

    @Override
    protected String getTipo() {
        return getClass().getSimpleName();
    }

    @Override
    public void procesar(SistemaConcesionario sitema, Cliente cliente, Vehiculo vehiculo, Empleado empleado) {
        setSistema(sitema);
        if (vehiculo.isDisponible()) {
            setFechaVenta(LocalDate.now());
            setCliente(cliente);
            setEmpleado(empleado);
            setVehiculo(vehiculo);
            vehiculo.setDisponible(true);
            this.monto = calcularMontoVenta();

            this.sistemaConcesionario.agregarVehiculo(vehiculo);
            this.sistemaConcesionario.getRegistro().registrarTransaccion(this);
            this.empleado.getTransacciones().add(this);

            System.out.println("Transacción de venta procesada exitosamente para el vehículo: "
                    + vehiculo.getMarca() + " (" + vehiculo.getModelo() + ")");
        } else {
            System.out.println("El vehículo no está disponible para la venta.");
        }
        
    }

    private double calcularMontoVenta() {

        return 25000.0;
    }

    @Override
    public String toString() {
        return "Transaccion de Venta codigo " + codigo + ", cliente " + cliente + ", empleado " + empleado + ", vehiculo "
                + vehiculo + ", fechaVenta " + fechaVenta + ", monto " + monto + ", sistema de Concesionario "
                + sistemaConcesionario  ;
    }

    

    
    
}
