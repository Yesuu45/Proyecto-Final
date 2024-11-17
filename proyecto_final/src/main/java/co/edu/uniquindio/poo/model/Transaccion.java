package co.edu.uniquindio.poo.model;

/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */

public abstract class Transaccion {
    private Empleado empleado;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private SistemaConcesionario sistema;
    private String codigo;

    public Transaccion(
        String codigo) {
        this.codigo = codigo;
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

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public SistemaConcesionario getSistema() {
        return sistema;
    }

    public void setSistema(SistemaConcesionario sistema) {
        this.sistema = sistema;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    protected abstract double getMonto();

    protected abstract String getTipo();

    /**
     * Procesa la transacción.
     *
     * @param cliente  Cliente involucrado.
     * @param vehiculo Vehículo involucrado.
     * @param empleado Empleado que procesa.
     */
    public abstract void procesar(SistemaConcesionario sitema, Cliente cliente, Vehiculo vehiculo, Empleado empleado);


}