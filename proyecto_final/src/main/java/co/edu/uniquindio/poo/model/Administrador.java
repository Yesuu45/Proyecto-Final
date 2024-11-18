package co.edu.uniquindio.poo.model;



public class Administrador extends Persona implements IGestionar {
    private String telefono;
    private SistemaConcesionario sistemaConcesionario;

    public Administrador(String nombre, String id, String nombreDeUsuario, String contraseña, String palabraSecreta,
            String email, String telefono) {
        super(nombre, id, nombreDeUsuario, contraseña, palabraSecreta, email);
        this.telefono = telefono;
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

    /**
     * Elimina un cliente del sistema del concesionario basado en su identificador
     * único.
     *
     * @param id El identificador único del cliente a eliminar.
     */
    @Override
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
    @Override
    public void crearCliente(String nombre, String id, String nombreDeUsuario, String contraseña,
            String palabraSecreta, String email, String direccion, String telefono) {
        Cliente nuevoCliente = new Cliente(nombre, id, nombreDeUsuario, contraseña, palabraSecreta, email, direccion,
                telefono);
        sistemaConcesionario.agregarCliente(nuevoCliente);
        System.out.println("Cliente creado exitosamente.");
    }

    /**
     * Crea y añade un vehículo al sistema del concesionario.
     *
     * @param tipoVehiculo El tipo de vehículo a crear.
     * @param vehiculo     El objeto Vehiculo que se va a añadir.
     */
    @Override
    public void crearVehiculo(Vehiculo vehiculo) {
        sistemaConcesionario.getVehiculos().add(vehiculo);
        System.out.println("Vehículo " + vehiculo.getClass().getSimpleName() + " creado exitosamente");
    }

    public void crearReporte(Empleado empleado) {
        // Generar un código único para el reporte
        String codigo = "REP-" + (sistemaConcesionario.getReportes().size() + 1);

        Reporte nuevoReporte = new Reporte(codigo, empleado);

        sistemaConcesionario.getReportes().add(nuevoReporte);

        System.out.println("Reporte creado exitosamente:" + nuevoReporte.generarResumen());
    }

    public void eliminarReporte(Reporte reporte) {
        sistemaConcesionario.getReportes().remove(reporte);

    }



    @Override
    public void eliminarTransaccion(Transaccion transaccion) {
        if (sistemaConcesionario.getRegistro().eliminarTransaccion(transaccion.getCodigo())) {

        }
    }

    public void crearEmpleado(String nombre, String id, String nombreDeUsuario, String contraseña,
            String palabraSecreta, String email, String puesto, String telefono) {
        Empleado nuevoEmpleado = new Empleado(nombre, id, nombreDeUsuario, contraseña, palabraSecreta, email, puesto,
                telefono);
        sistemaConcesionario.agregarEmpleado(nuevoEmpleado);
        System.out.println("Empleado creado exitosamente.");
    }

    public void eliminarEmpleado(Empleado empleado) {
        for (Empleado iEmpleado : sistemaConcesionario.getEmpleados()) {
            if (iEmpleado.getId().equals(empleado.getId())) {
                sistemaConcesionario.getEmpleados().remove(empleado);
                System.out.println("Empleado eliminado");
                return;
            }

        }
        System.out.println("El empleado no pudo ser eliminado");
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public SistemaConcesionario getSistemaConcesionario() {
        return sistemaConcesionario;
    }

    public void setSistemaConcesionario(SistemaConcesionario sistemaConcesionario) {
        this.sistemaConcesionario = sistemaConcesionario;
    }

}
