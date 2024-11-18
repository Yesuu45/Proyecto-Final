package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Reporte;
import co.edu.uniquindio.poo.model.SistemaConcesionario;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class SecondaryAdmController {

    // Administrador asociado al controlador
    private Administrador administrador;
    
    // Sistema de concesionario asociado al controlador
    private SistemaConcesionario sistema;

    /**
     * Constructor de la clase SecondaryAdmController.
     *
     * @param adm Administrador asociado.
     * @param sistema Sistema de concesionario asociado.
     */
    public SecondaryAdmController(Administrador adm, SistemaConcesionario sistema) {
        this.administrador = adm;
        this.sistema = sistema;
    }

    /**
     * Obtiene el administrador asociado al controlador.
     *
     * @return Administrador asociado.
     */
    public Administrador getAdministrador() {
        return administrador;
    }

    /**
     * Establece el administrador asociado al controlador.
     *
     * @param administrador Administrador a asociar.
     */
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    /**
     * Obtiene el sistema de concesionario asociado al controlador.
     *
     * @return Sistema de concesionario.
     */
    public SistemaConcesionario getSistema() {
        return sistema;
    }

    /**
     * Establece el sistema de concesionario asociado al controlador.
     *
     * @param sistema Sistema de concesionario.
     */
    public void setSistema(SistemaConcesionario sistema) {
        this.sistema = sistema;
    }

    /**
     * Obtiene el número total de transacciones registradas en el sistema.
     *
     * @return Número de transacciones.
     */
    public int obtenerNumeroTransacciones() {
        return sistema != null ? sistema.getRegistro().getTransacciones().size() : 0;
    }

    /**
     * Obtiene una lista observable de clientes registrados en el sistema.
     *
     * @return Lista observable de clientes.
     */
    public ObservableList<Cliente> obtenerClientes() {
        return FXCollections.observableArrayList(sistema.getClientes());
    }

    /**
     * Elimina un cliente del sistema por su identificación.
     *
     * @param id Identificación del cliente a eliminar.
     */
    public void eliminarCliente(String id) {
        administrador.eliminarCliente(id);
    }

    /**
     * Elimina un vehículo del sistema.
     *
     * @param vehiculo Vehículo a eliminar.
     */
    public void eliminarVehiculo(Vehiculo vehiculo) {
        administrador.eliminarVehiculo(vehiculo.getMatricula());
    }

    /**
     * Elimina un empleado del sistema.
     *
     * @param empleado Empleado a eliminar.
     */
    public void eliminarEmpleado(Empleado empleado) {
        administrador.eliminarEmpleado(empleado);
    }

    /**
     * Registra un nuevo empleado en el sistema.
     *
     * @param empleado Empleado a registrar.
     */
    public void registrarEmpleado(Empleado empleado) {
        sistema.agregarEmpleado(empleado);
    }

    /**
     * Elimina una transacción del sistema por su código.
     *
     * @param codigo Código de la transacción a eliminar.
     */
    public void eliminarTransaccion(String codigo) {
        sistema.getRegistro().eliminarTransaccion(codigo);
    }

    /**
     * Actualiza la información de un empleado basado en su identificación.
     *
     * @param id Identificación del empleado a actualizar.
     * @param nuevosDatos Nuevos datos del empleado.
     * @return true si el empleado fue actualizado exitosamente, de lo contrario, false.
     */
    public boolean actualizarEmpleadoPorID(String id, Empleado nuevosDatos) {
        for (Empleado e : sistema.getEmpleados()) {
            if (e.getId().equals(id)) {
                e.setNombre(nuevosDatos.getNombre());
                e.setCorreo(nuevosDatos.getCorreo());
                e.setPalabraSecreta(nuevosDatos.getPalabraSecreta());
                e.setContraseña(nuevosDatos.getContraseña());
                e.setUsuario(nuevosDatos.getUsuario());
                e.setPuesto(nuevosDatos.getPuesto());

                System.out.println("Empleado con ID " + id + " actualizado exitosamente.");
                return true;
            }
        }
        System.out.println("Empleado con ID " + id + " no encontrado.");
        return false;
    }

    /**
     * Crea un reporte para un empleado basado en su identificación.
     *
     * @param idempleado Identificación del empleado para el cual se crea el reporte.
     */
    public void crearReporte(String idempleado) {
        for (Empleado ieEmpleado : sistema.getEmpleados()) {
            if (ieEmpleado.getId().equals(idempleado)) {
                administrador.crearReporte(ieEmpleado);
                return;
            }
        }
        System.out.println("No se pudo encontrar el Empleado");
    }

    /**
     * Elimina un reporte del sistema.
     *
     * @param reporte Reporte a eliminar.
     */
    public void eliminarReporte(Reporte reporte) {
        administrador.eliminarReporte(reporte);
    }
}