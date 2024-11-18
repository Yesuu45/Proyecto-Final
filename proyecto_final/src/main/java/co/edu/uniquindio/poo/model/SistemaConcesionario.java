package co.edu.uniquindio.poo.model;

import java.util.LinkedList;


public class SistemaConcesionario {

    // Nombre del concesionario
    private String nombre;

    // Administrador del sistema
    private Administrador administrador;

    // Lista de vehículos disponibles en el concesionario
    private LinkedList<Vehiculo> vehiculos;

    // Lista de clientes registrados en el sistema
    private LinkedList<Cliente> clientes;

    // Lista de empleados del concesionario
    private LinkedList<Empleado> empleados;

    // Registro de transacciones realizadas en el sistema
    private RegistroTransacciones registro;

    // Lista de reportes generados en el sistema
    private LinkedList<Reporte> reportes;

    /**
     * Constructor de la clase SistemaConcesionario.
     *
     * @param nombre        Nombre del concesionario.
     * @param administrador Administrador del sistema.
     * @param registro      Registro de transacciones del sistema.
     */
    public SistemaConcesionario(String nombre, Administrador administrador, RegistroTransacciones registro) {
        this.nombre = nombre;
        this.administrador = administrador;
        vehiculos = new LinkedList<>();
        clientes = new LinkedList<>();
        empleados = new LinkedList<>();
        reportes = new LinkedList<>();
        this.registro = registro;
        this.administrador.setSistemaConcesionario(this);
    }

    /**
     * Obtiene el administrador del sistema por sus credenciales.
     *
     * @param usuario  Nombre de usuario del administrador.
     * @param password Contraseña del administrador.
     * @return El administrador si las credenciales son correctas, de lo contrario,
     *         null.
     */
    public Administrador obtenerAdministradorPorCredenciales(String usuario, String contraseña) {
        if (administrador != null && administrador.getUsuario().equals(usuario)
                && administrador.getContraseña().equals(contraseña)) {
            return administrador;
        }
        return null;
    }

    /**
     * Verifica si las credenciales del administrador son correctas.
     *
     * @param usuario  Nombre de usuario del administrador.
     * @param password Contraseña del administrador.
     * @return true si las credenciales son correctas, de lo contrario, false.
     */
    public boolean verificarAdministradorCuenta(String usuario, String contraseña) {
        return administrador != null && administrador.getUsuario().equals(usuario)
                && administrador.getContraseña().equals(contraseña);
    }

    /**
     * Obtiene un empleado del sistema por sus credenciales.
     *
     * @param usuario  Nombre de usuario del empleado.
     * @param password Contraseña del empleado.
     * @return El empleado si las credenciales son correctas, de lo contrario, null.
     */
    public Empleado obtenerEmpleadoPorCredenciales(String usuario, String password) {
        for (Empleado empleado : empleados) {
            if (empleado.getUsuario().equals(usuario) && empleado.getContraseña().equals(password)) {
                return empleado;
            }
        }
        return null;
    }

    /**
     * Agrega un vehículo al sistema si no existe ya.
     *
     * @param vehiculoParam Vehículo a agregar.
     */
    public void agregarVehiculo(Vehiculo vehiculoParam) {
        if (verificarVehiculo(vehiculoParam)) {
            System.out.println("El vehículo no se puede agregar porque ya existe");
        } else {
            vehiculos.add(vehiculoParam);
        }
    }

    /**
     * Verifica si un vehículo ya existe en el sistema.
     *
     * @param vehiculo Vehículo a verificar.
     * @return true si el vehículo ya existe, de lo contrario, false.
     */
    public boolean verificarVehiculo(Vehiculo vehiculo) {
        boolean centinela = false;
        for (Vehiculo c : vehiculos) {
            if (c.getMatricula().equals(vehiculo.getMatricula())) {
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    /**
     * Agrega un cliente al sistema si no existe ya.
     *
     * @param cliente Cliente a agregar.
     */
    public void agregarCliente(Cliente cliente) {
        if (verificarCliente(cliente)) {
            System.out.println("El cliente no se puede agregar porque ya existe");
        } else {
            clientes.add(cliente);
        }
    }

    /**
     * Verifica si un cliente ya existe en el sistema.
     *
     * @param clienteParam Cliente a verificar.
     * @return true si el cliente ya existe, de lo contrario, false.
     */
    public boolean verificarCliente(Cliente clienteParam) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(clienteParam.getId())) {
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    /**
     * Agrega un empleado al sistema si no existe ya.
     *
     * @param empleado Empleado a agregar.
     */
    public void agregarEmpleado(Empleado empleado) {
        if (verificarEmpleado(empleado)) {
            System.out.println("El empleado no se puede agregar porque ya existe");
        } else {
            empleado.setSistemaConcesionario(this);
            empleados.add(empleado);
            System.out.println("Empleado Agregado");
        }
    }

    /**
     * Verifica si un empleado ya existe en el sistema.
     *
     * @param empleadoParam Empleado a verificar.
     * @return true si el empleado ya existe, de lo contrario, false.
     */
    public boolean verificarEmpleado(Empleado empleadoParam) {
        boolean centinela = false;
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(empleadoParam.getId())) {
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    /**
     * Verifica si las credenciales de un empleado son correctas.
     *
     * @param nombreUsuario Nombre de usuario del empleado.
     * @param contraseña    Contraseña del empleado.
     * @return true si las credenciales son correctas, de lo contrario, false.
     */
    public boolean verificarEmpleadoCuenta(String nombreUsuario, String contraseña) {
        for (Empleado empleado : empleados) {
            if (empleado.getUsuario().equals(nombreUsuario) && empleado.getContraseña().equals(contraseña)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Agrega un reporte al sistema si no existe ya.
     *
     * @param reporte Reporte a agregar.
     */
    public void agregarReporte(Reporte reporte) {
        if (verificarReporte(reporte)) {
            System.out.println("El reporte ya existe en el sistema");
        } else {
            reportes.add(reporte);
            System.out.println("El reporte fue registrado de forma exitosa");
        }
    }

    /**
     * Verifica si un reporte ya existe en el sistema.
     *
     * @param reporteParam Reporte a verificar.
     * @return true si el reporte ya existe, de lo contrario, false.
     */
    public boolean verificarReporte(Reporte reporteParam) {
        boolean sentinela = false;
        for (Reporte reporte : reportes) {
            if (reporte.getCodigo().equals(reporteParam.getCodigo())) {
                sentinela = true;
                break;
            }
        }
        return sentinela;
    }

    /**
     * Obtiene las transacciones realizadas por un empleado.
     *
     * @param empleado Empleado cuyas transacciones se desean obtener.
     * @return Lista de transacciones realizadas por el empleado.
     */
    public LinkedList<Transaccion> obtenerTransaccionesPorEmpleado(Empleado empleado) {
        LinkedList<Transaccion> transaccions = new LinkedList<>();
        for (int i = 0; i < empleado.getTransacciones().size(); i++) {
            transaccions.add(empleado.getTransacciones().get(i));
        }
        return transaccions;
    }

    /**
     * Obtiene los vehículos pertenecientes a un cliente.
     *
     * @param cliente Cliente cuyos vehículos se desean obtener.
     * @return Lista de vehículos pertenecientes al cliente.
     */
    public LinkedList<Vehiculo> getVehiculosCliente(Cliente cliente) {
        LinkedList<Vehiculo> lista = new LinkedList<>();
        for (int i = 0; i < cliente.getVehiculos().size(); i++) {
            lista.add(cliente.getVehiculos().get(i));
        }
        return lista;
    }

    /*
     * Metodos Get y Set
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public LinkedList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(LinkedList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public LinkedList<Reporte> getReportes() {
        return reportes;
    }

    public void setReportes(LinkedList<Reporte> reportes) {
        this.reportes = reportes;
    }

    public RegistroTransacciones getRegistro() {
        return registro;
    }

    public void setRegistro(RegistroTransacciones registro) {
        this.registro = registro;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

}
