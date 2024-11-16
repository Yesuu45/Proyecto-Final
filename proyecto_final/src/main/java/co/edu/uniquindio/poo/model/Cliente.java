package co.edu.uniquindio.poo.model;

public class Cliente extends Persona {
    private String correo;

    public Cliente(String nombre, String id, String correo) {
        super(nombre, id);
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    
}
