package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Empleado extends Persona implements IGestionar{

    private String puesto;
    private String codigoEmpleado;
    private SistemaConcesionario sistemaConcesionario;
    private LinkedList<Transaccion> transacciones;

   
    public Empleado(String nombre, String id, String usuario, String palabraSecreta, String contraseña, String correo,
            String puesto, String codigoEmpleado) {
        super(nombre, id, usuario, palabraSecreta, contraseña, correo);
        this.puesto = puesto;
        this.codigoEmpleado = codigoEmpleado;
    }

    

    public String getPuesto() {
        return puesto;
    }



    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }



    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }



    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }



    public SistemaConcesionario getSistemaConcesionario() {
        return sistemaConcesionario;
    }



    public void setSistemaConcesionario(SistemaConcesionario sistemaConcesionario) {
        this.sistemaConcesionario = sistemaConcesionario;
    }



    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }



    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }


    @Override
    public void crearCliente(String nombre, String id, String Usuario, String contraseña,
            String palabraSecreta, String correo, String direccion, String telefono) {

        Cliente nuevoCliente = new Cliente(nombre, id, Usuario, contraseña, correo, direccion, telefono,
                telefono);

        sistemaConcesionario.agregarCliente(nuevoCliente);
        System.out.println("Cliente creado exitosamente.");
    }
    @Override
    public void crearVehiculo(Vehiculo vehiculo) {
        sistemaConcesionario.getVehiculos().add(vehiculo);
        System.out.println("Vehículo " + vehiculo.getClass().getSimpleName() + " creado exitosamente");        
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
   

    
  
}
