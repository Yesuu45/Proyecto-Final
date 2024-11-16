package co.edu.uniquindio.poo.model;

public class Administrador extends Empleado {

    public Administrador(String nombre, String cedula, String telefono, String correo, String cargo) {
        super(nombre, cedula, telefono, correo, cargo);
    }

    public void eliminarVehiculo(Consecionario concesionario, Vehiculo vehiculo) {
        concesionario.removerVehiculo(vehiculo);
        System.out.println("Vehículo eliminado exitosamente.");
    }

    public void eliminarCliente(Consecionario concesionario, Cliente cliente) {
        concesionario.eliminarCliente(cliente);
        System.out.println("Cliente eliminado exitosamente.");
    }

    public void verTransacciones() {
        for (Transaccion transaccion : getTransacciones()) {
            System.out.println(transaccion);
        }
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "cargo='" + cargo + '\'' +
                "} " + super.toString();
    }
}
