package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Concesionario {
    private List<Vehiculo> vehiculosDisponibles;
    private List<Cliente> clientes;

    public Concesionario() {
        this.vehiculosDisponibles = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculosDisponibles.add(vehiculo);
    }

    public void removerVehiculo(Vehiculo vehiculo) {
        vehiculosDisponibles.remove(vehiculo);
    }

    public List<Vehiculo> getVehiculosDisponibles() {
        return vehiculosDisponibles;
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
