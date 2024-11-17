package co.edu.uniquindio.poo.model;

public interface IGestionar {
    
    public void crearVehiculo(Vehiculo vehiculo);
    public void crearCliente(String nombre, String id, String nombreDeUsuario, String contraseña, String palabraSecreta,
    
    String email, String direccion, String telefono);
    public void eliminarVehiculo(String matricula);
    public void eliminarCliente(String id);
}
