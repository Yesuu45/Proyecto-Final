package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.LinkedList;


public class Reporte {

    // Fecha en la que se genera el reporte
    private LocalDate fechaDeReporte;

    // Empleado que genera el reporte
    private Empleado empleado;

    // Lista de transacciones realizadas por el empleado
    private LinkedList<Transaccion> transacciones;

    // Código único que identifica el reporte
    private String codigo;

    // Total de ventas realizadas
    private int totalVentas;

    // Total de alquileres realizados
    private int totalAlquileres;

    // Total de compras realizadas
    private int totalCompras;

    // Monto total de todas las transacciones
    private double montoTotal;

    // Total de transacciones realizadas
    private int totalTransacciones;

    /**
     * Constructor de la clase Reporte.
     *
     * @param codigo   Código único que identifica el reporte.
     * @param empleado Empleado que genera el reporte.
     */
    public Reporte(String codigo, Empleado empleado) {
        this.codigo = codigo;
        this.fechaDeReporte = LocalDate.now();
        this.empleado = empleado;
        transacciones = empleado.getTransacciones();
        calcularValores();
        totalTransacciones = totalCompras + totalAlquileres + totalVentas;
    }

    /**
     * Calcula los valores totales de las transacciones realizadas por el empleado.
     * Actualiza los totales de ventas, alquileres, compras y el monto total.
     */
    public void calcularValores() {
        for (Transaccion transaccion : transacciones) {
            actualizarTotales(transaccion);
        }
        System.out.println(generarResumen());
    }

    /**
     * Actualiza los totales de ventas, alquileres, compras y el monto total
     * basándose en el tipo de transacción.
     *
     * @param transaccion Transacción a evaluar y sumar a los totales.
     */
    private void actualizarTotales(Transaccion transaccion) {
        switch (transaccion.getTipo()) {
            case "TVenta":
                totalVentas++;
                break;
            case "TAlquiler":
                totalAlquileres++;
                break;
            case "TCompra":
                totalCompras++;
                break;
        }
        montoTotal += transaccion.getMonto();
    }

    /**
     * Obtiene el total de transacciones realizadas.
     *
     * @return Total de transacciones.
     */
    public int getTotalTransacciones() {
        return totalTransacciones;
    }

    /**
     * Establece el total de transacciones realizadas.
     *
     * @param totalTransacciones Total de transacciones.
     */
    public void setTotalTransacciones(int totalTransacciones) {
        this.totalTransacciones = totalTransacciones;
    }

    /**
     * Genera un resumen del reporte con los totales de ventas, alquileres, compras
     * y el monto total.
     *
     * @return Cadena de texto con el resumen del reporte.
     */
    public String generarResumen() {
        return "Resumen del Reporte:\n" +
                "Total Ventas: " + totalVentas + "\n" +
                "Total Alquileres: " + totalAlquileres + "\n" +
                "Total Compras: " + totalCompras + "\n" +
                "Monto Total: $" + montoTotal;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaDeReporte() {
        return fechaDeReporte;
    }

    public void setFechaDeReporte(LocalDate fechaDeReporte) {
        this.fechaDeReporte = fechaDeReporte;
    }

}