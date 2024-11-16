package co.edu.uniquindio.poo.model;

import java.util.Date;

public class Transaccion {
    private String tipo;  // "Alquiler", "Venta", "Compra"
    private Vehiculo vehiculo;
    private Empleado empleado;
    private Cliente cliente;
    private Date fecha;

    // Constructor para crear una nueva transacción
    public Transaccion(String tipo, Vehiculo vehiculo, Empleado empleado, Cliente cliente) {
        this.tipo = tipo;
        this.vehiculo = vehiculo;
        this.empleado = empleado;
        this.cliente = cliente;
        this.fecha = new Date(); // Fecha actual de la transacción
    }

    // Métodos getter y setter

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "tipo='" + tipo + '\'' +
                ", vehiculo=" + vehiculo +
                ", empleado=" + empleado +
                ", cliente=" + cliente +
                ", fecha=" + fecha +
                '}';
    }
}
