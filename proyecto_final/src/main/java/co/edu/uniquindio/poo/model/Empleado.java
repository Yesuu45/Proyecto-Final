package co.edu.uniquindio.poo.model;

import java.util.LinkedList;


public class Empleado extends Persona implements IGestionar {
    private SistemaConcesionario sistemaConcesionario;
    private String puesto;
    private String telefono;
    private LinkedList<Transaccion> transacciones;

    public Empleado(String nombre, String id, String nombreDeUsuario, String contraseña, String palabraSecreta,
            String email, String puesto, String telefono) {
        super(nombre, id, nombreDeUsuario, contraseña, palabraSecreta, email);
        this.puesto = puesto;
        this.telefono = telefono;
        transacciones = new LinkedList<>();
    }

    @Override
    public void crearCliente(String nombre, String id, String nombreDeUsuario, String contraseña,
            String palabraSecreta, String email, String direccion, String telefono) {

        Cliente nuevoCliente = new Cliente(nombre, id, nombreDeUsuario, contraseña, palabraSecreta, email, direccion,
                telefono);

        sistemaConcesionario.agregarCliente(nuevoCliente);
        System.out.println("Cliente creado exitosamente.");
    }

    public void actualizarCliente(Cliente cliente) {
        for (Cliente c : sistemaConcesionario.getClientes()) {
            if (c.getId().equals(cliente.getId())) {
                c.setNombre(cliente.getNombre());
                c.setDireccion(cliente.getDireccion());
                c.setCorreo(cliente.getCorreo());
                c.setTelefono(cliente.getTelefono());
                System.out.println("Cliente actualizado exitosamente.");
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }

    @Override
    public void crearVehiculo(Vehiculo vehiculo) {

        sistemaConcesionario.getVehiculos().add(vehiculo);
        System.out.println("Vehículo " + vehiculo.getClass().getSimpleName() + " creado exitosamente");
    }

    @Override
    public void eliminarVehiculo(String matricula) {
        for (Vehiculo vehiculo : sistemaConcesionario.getVehiculos()) {
            if (vehiculo.getMatricula().equals(matricula)) {
                sistemaConcesionario.getVehiculos().remove(vehiculo);
                System.out.println("Vehículo Eliminado exitosamente");
                return;
            }
        }
        System.out.println("Vehículo no encontrado.");
    }

    @Override
    public void eliminarCliente(String id) {
        for (Cliente cliente : sistemaConcesionario.getClientes()) {
            if (cliente.getId().equals(id)) {
                sistemaConcesionario.getClientes().remove(cliente);
                System.out.println("Cliente Eliminado exitosamente");
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }

    @Override 
    public void eliminarTransaccion(Transaccion transaccion){
        if(sistemaConcesionario.getRegistro().eliminarTransaccion(transaccion.getCodigo())){
            transacciones.remove(transaccion);
        }
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public SistemaConcesionario getSistemaConcesionario() {
        return sistemaConcesionario;
    }

    public void setSistemaConcesionario(SistemaConcesionario sistemaConcesionario) {
        this.sistemaConcesionario = sistemaConcesionario;
    }

}
