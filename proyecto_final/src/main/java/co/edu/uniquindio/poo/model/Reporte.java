package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.LinkedList;

public class Reporte {
    private LocalDate fechaReporte;
    private Empleado empleado;
    private LinkedList <Transaccion> transacciones;
    private String codigo;

    private int totalVentas;
    private int totalAlquileres;
    private int totalCompras;
    private double montoTotal;
    public Reporte( LocalDate fechaReporte , Empleado empleado ,String codigo) {
        this.fechaReporte = fechaReporte;
        this.empleado = empleado;
        transacciones = new LinkedList<>();
        this.codigo = codigo;

    }
    public LocalDate getFechaReporte() {
        return fechaReporte;
    }
    public void setFechaReporte(LocalDate fechaReporte) {
        this.fechaReporte = fechaReporte;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }
    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public int getTotalVentas() {
        return totalVentas;
    }
    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }
    public int getTotalAlquileres() {
        return totalAlquileres;
    }
    public void setTotalAlquileres(int totalAlquileres) {
        this.totalAlquileres = totalAlquileres;
    }
    public int getTotalCompras() {
        return totalCompras;
    }
    public void setTotalCompras(int totalCompras) {
        this.totalCompras = totalCompras;
    }
    public double getMontoTotal() {
        return montoTotal;
    }
    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public void agregarTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
        actualizarTotales(transaccion);
    }

    private void actualizarTotales(Transaccion transaccion) {
        switch (transaccion.getTipo()) {
            case "TransaccionVenta":
                totalVentas++;
                break;
            case "TransaccionAlquiler":
                totalAlquileres++;
                break;
            case "TransaccionCompra":
                totalCompras++;
                break;
        }
        montoTotal += transaccion.getMonto();
    }

    public String generarResumen() {
        return "Resumen del Reporte:\n" +
                "Total Ventas: " + totalVentas + "\n" +
                "Total Alquileres: " + totalAlquileres + "\n" +
                "Total Compras: " + totalCompras + "\n" +
                "Monto Total: $" + montoTotal;
    }
    
    
}
