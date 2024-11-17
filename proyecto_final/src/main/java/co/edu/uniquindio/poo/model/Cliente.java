package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Cliente extends Persona {
    private String direccion ;
    private String telefono;
    private LinkedList<Vehiculo> vehiculos;

    public Cliente(String nombre, String id, String usuario, String palabraSecreta, String contraseña, String correo,
            String direccion, String telefono) {
        super(nombre, id, usuario, palabraSecreta, contraseña, correo);
        this.direccion = direccion;
        this.telefono = telefono;
        vehiculos = new LinkedList<>() ;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void vehiculoAdquirido(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    

    
    
}
