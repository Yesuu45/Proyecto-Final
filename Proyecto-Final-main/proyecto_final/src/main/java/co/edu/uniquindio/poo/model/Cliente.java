package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private List<Vehiculo> vehiculosAlquilados;
    private List<Vehiculo> vehiculosComprados;

    public Cliente(String nombre, String cedula, String telefono, String correo) {
        super(nombre, cedula, telefono, correo);
        this.vehiculosAlquilados = new ArrayList<>();
        this.vehiculosComprados = new ArrayList<>();
    }

    // Métodos para gestionar los vehículos alquilados y comprados

    public void agregarVehiculoAlquilado(Vehiculo vehiculo) {
        vehiculosAlquilados.add(vehiculo);
    }

    public void agregarVehiculoComprado(Vehiculo vehiculo) {
        vehiculosComprados.add(vehiculo);
    }

    public void removerVehiculo(Vehiculo vehiculo) {
        vehiculosAlquilados.remove(vehiculo);
        vehiculosComprados.remove(vehiculo);
    }

    public List<Vehiculo> getVehiculosAlquilados() {
        return vehiculosAlquilados;
    }

    public List<Vehiculo> getVehiculosComprados() {
        return vehiculosComprados;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + getNombre() + '\'' +
                ", cedula='" + getCedula() + '\'' +
                '}';
    }
}
