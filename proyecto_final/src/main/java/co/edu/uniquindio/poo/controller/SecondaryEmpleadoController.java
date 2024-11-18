package co.edu.uniquindio.poo.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.SistemaConcesionario;
import co.edu.uniquindio.poo.model.TAlquiler;
import co.edu.uniquindio.poo.model.TCompra;
import co.edu.uniquindio.poo.model.TVenta;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class SecondaryEmpleadoController {

    private Empleado empleado;
    private SistemaConcesionario sistema;
    private ObservableList<Cliente> clientesObservable;
    private ObservableList<Vehiculo> vehiculosObservable;
    private ObservableList<Vehiculo> vehiculosClienteObservable;
    private List<Transaccion> transacciones;

    /**
     * Constructor que inicializa el controlador con un sistema y un empleado.
     */
    public SecondaryEmpleadoController(SistemaConcesionario sistema, Empleado empleado) {
        this.transacciones = new ArrayList<>();
        this.sistema = sistema;
        this.empleado = empleado;
        this.clientesObservable = FXCollections.observableArrayList(sistema.getClientes());
        this.vehiculosObservable = FXCollections.observableArrayList(sistema.getVehiculos());
        this.vehiculosClienteObservable = FXCollections.observableArrayList();
    }

    /**
     * Asigna el empleado al controlador.
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * Obtiene las transacciones asociadas al empleado.
     */
    public ObservableList<Transaccion> obtenerTransacciones() {
        if (empleado != null) {
            System.out.println("Transacciones del empleado: " + empleado.getTransacciones());
            return FXCollections.observableArrayList(empleado.getTransacciones());
        }
        return FXCollections.observableArrayList();
    }

    /**
     * Cuenta el número de transacciones del empleado.
     */
    public int obtenerNumeroTransacciones() {
        return empleado != null ? empleado.getTransacciones().size() : 0;
    }

    /**
     * Obtiene la lista de clientes del sistema.
     */
    public ObservableList<Cliente> obtenerClientes() {
        return FXCollections.observableArrayList(sistema.getClientes());
    }

    /**
     * Crea un nuevo cliente y lo asocia al empleado.
     */
    public void crearCliente(String nombre, String id, String nombreDeUsuario, String contraseña, String palabraSecreta,
            String email, String direccion, String telefono) {
        empleado.crearCliente(nombre, id, nombreDeUsuario, contraseña, palabraSecreta, email, direccion, telefono);
    }

    /**
     * Actualiza la información de un cliente basado en su ID.
     */
    public boolean actualizarClientePorID(String id, Cliente nuevosDatos) {
        for (Cliente c : sistema.getClientes()) {
            if (c.getId().equals(id)) {
                c.setNombre(nuevosDatos.getNombre());
                c.setDireccion(nuevosDatos.getDireccion());
                c.setCorreo(nuevosDatos.getCorreo());
                c.setTelefono(nuevosDatos.getTelefono());
                c.setPalabraSecreta(nuevosDatos.getPalabraSecreta());
                c.setContraseña(nuevosDatos.getContraseña());
                c.setUsuario(nuevosDatos.getUsuario());

                System.out.println("Cliente con ID " + id + " actualizado exitosamente.");
                return true;
            }
        }
        System.out.println("Cliente con ID " + id + " no encontrado.");
        return false;
    }

    /**
     * Elimina un cliente basado en su ID.
     */
    public void eliminarCliente(String id) {
        empleado.eliminarCliente(id);
    }

    /**
     * Elimina un vehículo basado en su matrícula.
     */
    public void eliminarVehiculo(Vehiculo vehiculo) {
        empleado.eliminarVehiculo(vehiculo.getMatricula());
    }

    /**
     * Obtiene la lista de vehículos registrados en el sistema.
     */
    public ObservableList<Vehiculo> obtenerVehiculosRegistrados() {
        return FXCollections.observableArrayList(sistema.getVehiculos());
    }

    /**
     * Registra un vehículo desde la lista de espera.
     */
    public void registrarVehiculoDesdeEspera(Vehiculo vehiculo) {
        sistema.agregarVehiculo(vehiculo);
    }

    /**
     * Obtiene la lista observable de clientes.
     */
    public ObservableList<Cliente> getClientesObservable() {
        return clientesObservable;
    }

    /**
     * Obtiene la lista observable de vehículos.
     */
    public ObservableList<Vehiculo> getVehiculosObservable() {
        return vehiculosObservable;
    }

    /**
     * Obtiene la lista de vehículos asociados a un cliente específico.
     */
    public ObservableList<Vehiculo> getVehiculosPorCliente(Cliente cliente) {
        vehiculosClienteObservable.setAll(sistema.getVehiculosCliente(cliente));
        return vehiculosClienteObservable;
    }

    /**
     * Procesa una transacción basada en su tipo.
     */
    public void procesarTransaccion(String codigo, Cliente cliente, Vehiculo vehiculo, Empleado empleado, String tipo) {
        switch (tipo) {
            case "Compra":
                sistema.getRegistro().getTransacciones().add(new TCompra(codigo));
                break;
            case "Alquiler":
                sistema.getRegistro().getTransacciones().add(new TAlquiler(codigo, 7)); // Ejemplo con 7 días.
                break;
            case "Venta":
                // Implementar lógica para venta si es necesario.
                break;
        }
    }

    /**
     * Elimina una transacción basada en su código.
     */
    public void eliminarTransaccion(String codigo) {
        sistema.getRegistro().eliminarTransaccion(codigo);
    }

    /**
     * Obtiene la lista de clientes del sistema.
     */
    public ObservableList<Cliente> getClientesList() {
        return FXCollections.observableArrayList(sistema.getClientes());
    }

    /**
     * Obtiene el empleado asociado al controlador.
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * Obtiene el sistema asociado al controlador.
     */
    public SistemaConcesionario getSistema() {
        return sistema;
    }

    /**
     * Asigna el sistema al controlador.
     */
    public void setSistema(SistemaConcesionario sistema) {
        this.sistema = sistema;
    }

    /**
     * Asigna la lista observable de clientes.
     */
    public void setClientesObservable(ObservableList<Cliente> clientesObservable) {
        this.clientesObservable = clientesObservable;
    }

    /**
     * Asigna la lista observable de vehículos.
     */
    public void setVehiculosObservable(ObservableList<Vehiculo> vehiculosObservable) {
        this.vehiculosObservable = vehiculosObservable;
    }

    /**
     * Obtiene la lista observable de vehículos asociados a un cliente.
     */
    public ObservableList<Vehiculo> getVehiculosClienteObservable() {
        return vehiculosClienteObservable;
    }

    /**
     * Asigna la lista observable de vehículos asociados a un cliente.
     */
    public void setVehiculosClienteObservable(ObservableList<Vehiculo> vehiculosClienteObservable) {
        this.vehiculosClienteObservable = vehiculosClienteObservable;
    }

    /**
     * Obtiene la lista de transacciones.
     */
    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    /**
     * Asigna la lista de transacciones.
     */
    public void setTransacciones(List<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    /**
     * Obtiene la lista de transacciones del sistema.
     */
    public ObservableList<Transaccion> getTransaccionesSistema() {
        return FXCollections.observableArrayList(sistema.getRegistro().getTransacciones());
    }

    /**
     * Procesa una transacción basada en su tipo y duración.
     */
    public void procesarTransaccion(Cliente cliente, Vehiculo vehiculo, String codigo, String tipoTransaccion,
            int dias) {

        switch (tipoTransaccion) {
            case "Alquiler":
                Transaccion transaccion = new TAlquiler(codigo, dias);
                transaccion.procesar(sistema, cliente, vehiculo, empleado);
                break;
            case "Compra":
                Transaccion transaccion2 = new TCompra(codigo);
                transaccion2.procesar(sistema, cliente, vehiculo, empleado);
                break;
            case "Venta":
                Transaccion transaccion3 = new TVenta(codigo);
                transaccion3.procesar(sistema, cliente, vehiculo, empleado);
                break;
            default:
                System.out.println("Tipo de transacción no reconocido.");
                return;
        }
    }

    /**
     * Elimina una transacción.
     */
    public void eliminarTransaccion(Transaccion transaccion) {
        if (transaccion != null) {
            empleado.eliminarTransaccion(transaccion);
            System.out.println("Transacción eliminada con éxito.");
        } else {
            System.out.println("Transacción no válida.");
        }
    }
}