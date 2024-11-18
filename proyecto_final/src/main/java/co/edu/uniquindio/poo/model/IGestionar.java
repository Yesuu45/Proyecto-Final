package co.edu.uniquindio.poo.model;

public interface IGestionar {
    
    public void crearVehiculo(Vehiculo vehiculo);
    public void crearCliente(String nombre, String id, String Usuario, String contraseña, String palabraSecreta,
    String correo, String direccion, String telefono);
    public void eliminarVehiculo(String matricula);
    public void eliminarCliente(String id);

    public void eliminarTransaccion(Transaccion transaccion);


}
