package co.edu.uniquindio.poo.model;

public class Empleado extends Persona{

    private String codigoEmpleado;

    public Empleado(String nombre, String id, String codigoEmpleado) {
        super(nombre, id);
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
    
    
}
