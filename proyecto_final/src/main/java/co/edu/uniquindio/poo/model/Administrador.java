package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.List;

public class Administrador extends Persona {
    private String  telfono;
    private SistemaConcesionario sistemaConcesionario;

    public Administrador(String nombre, String id, String usuario, String palabraSecreta, String contraseña,
            String correo, String telfono) {
        super(nombre, id, usuario, palabraSecreta, contraseña, correo);
        this.telfono = telfono;
    }
    public String getTelfono() {
        return telfono;
    }
    public void setTelfono(String telfono) {
        this.telfono = telfono;
    }
    public SistemaConcesionario getSistemaConcesionario() {
        return sistemaConcesionario;
    }
    public void setSistemaConcesionario(SistemaConcesionario sistemaConcesionario) {
        this.sistemaConcesionario = sistemaConcesionario;
    }

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

    /**
     * Elimina un cliente del sistema del concesionario basado en su identificador
     * único.
     *
     * @param id El identificador único del cliente a eliminar.
     */
    public void eliminarCliente(String id) {
        for (Cliente cliente : sistemaConcesionario.getClientes()) {
            if (cliente.getId().equals(id)) {
                sistemaConcesionario.getClientes().remove(cliente);
                System.out.println("Cliente eliminado exitosamente.");
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }

    /**
     * Crea un nuevo cliente y lo añade al sistema del concesionario.
     *
     * @param nombre          El nombre del cliente.
     * @param id              El identificador único del cliente.
     * @param nombreDeUsuario El nombre de usuario del cliente.
     * @param contraseña      La contraseña del cliente.
     * @param palabraSecreta  La palabra secreta del cliente para recuperación de
     *                        cuenta.
     * @param email           El correo electrónico del cliente.
     * @param direccion       La dirección del cliente.
     * @param telefono        El número de teléfono del cliente.
     */
    public void crearCliente(String nombre, String id, String Usuario, String contraseña,
            String palabraSecreta, String correp, String direccion, String telefono) {
        Cliente nuevoCliente = new Cliente(nombre, id, Usuario, palabraSecreta, contraseña,correo, direccion,telefono);
        sistemaConcesionario.agregarCliente(nuevoCliente);
        System.out.println("Cliente creado exitosamente.");
    }

    /**
     * Crea y añade un vehículo al sistema del concesionario.
     *
     * @param tipoVehiculo El tipo de vehículo a crear.
     * @param vehiculo     El objeto Vehiculo que se va a añadir.
     */
    public void crearVehiculo(Vehiculo vehiculo) {
        sistemaConcesionario.getVehiculos().add(vehiculo);
        System.out.println("Vehículo " + vehiculo.getClass().getSimpleName() + " creado exitosamente");
    }


     public void crearReporte(Empleado empleado) {
        // Generar un código único para el reporte
        String codigo = "REP-" + (sistemaConcesionario.getReportes().size() + 1);


        Reporte nuevoReporte = new Reporte(LocalDate.now(),empleado,codigo);


        List<Transaccion> transaccionesEmpleado = sistemaConcesionario.obtenerTransaccionesPorEmpleado(empleado);
        for (Transaccion transaccion : transaccionesEmpleado) {
            nuevoReporte.agregarTransaccion(transaccion);
        }


        sistemaConcesionario.getReportes().add(nuevoReporte);


        System.out.println("Reporte creado exitosamente:" + nuevoReporte.generarResumen());
    }

    

   

    
    
}
