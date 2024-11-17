package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Persona {
    public String cargo;
    private List<Transaccion> transacciones;

    public Empleado(String nombre, String cedula, String telefono, String correo, String cargo) {
        super(nombre, cedula, telefono, correo);
        this.cargo = cargo;
        this.transacciones = new ArrayList<>();
    }

    public void registrarVehiculo(Concesionario concesionario, Vehiculo vehiculo) {
        concesionario.agregarVehiculo(vehiculo);
        System.out.println("Vehículo registrado exitosamente por el empleado: " + getNombre());
    }

    public void registrarCliente(Concesionario concesionario, Cliente cliente) {
        concesionario.agregarCliente(cliente);
        System.out.println("Cliente registrado exitosamente: " + cliente.getNombre());
    }

    public void alquilarVehiculo(Concesionario concesionario, Cliente cliente, Vehiculo vehiculo, String fechaInicio, String fechaFin) {
        if (concesionario.getVehiculosDisponibles().contains(vehiculo)) {
            concesionario.removerVehiculo(vehiculo);
            cliente.agregarVehiculoAlquilado(vehiculo);
            transacciones.add(new Transaccion("Alquiler", vehiculo, this, cliente));
            System.out.println("Vehículo alquilado exitosamente a: " + cliente.getNombre());
        } else {
            System.out.println("El vehículo no está disponible.");
        }
    }

    public void venderVehiculo(Concesionario concesionario, Cliente cliente, Vehiculo vehiculo) {
        if (concesionario.getVehiculosDisponibles().contains(vehiculo)) {
            concesionario.removerVehiculo(vehiculo);
            cliente.agregarVehiculoComprado(vehiculo);
            transacciones.add(new Transaccion("Venta", vehiculo, this, cliente));
            System.out.println("Vehículo vendido exitosamente a: " + cliente.getNombre());
        } else {
            System.out.println("El vehículo no está disponible.");
        }
    }

    public void comprarVehiculo(Concesionario concesionario, Cliente cliente, Vehiculo vehiculo) {
        if (vehiculo.pasoRevisionTecnica()) {
            concesionario.agregarVehiculo(vehiculo);
            cliente.removerVehiculo(vehiculo);
            transacciones.add(new Transaccion("Compra", vehiculo, this, cliente));
            System.out.println("Vehículo comprado exitosamente a: " + cliente.getNombre());
        } else {
            System.out.println("El vehículo no pasó la revisión técnica.");
        }
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "cargo='" + cargo + '\'' +
                ", transacciones=" + transacciones.size() +
                "} " + super.toString();
    }
}
