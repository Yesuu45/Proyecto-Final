package co.edu.uniquindio.poo.model;

public class Persona {
    public String nombre;
    public String id;
    public String usuario;
    public String palabraSecreta;
    public String contraseña ;
    public String correo;

    public Persona(String nombre, String id, String usuario, String palabraSecreta, String contraseña, String correo) {
        this.nombre = nombre;
        this.id = id;
        this.usuario = usuario;
        this.palabraSecreta = palabraSecreta;
        this.contraseña = contraseña;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    
    

    

    
}
