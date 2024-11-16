package co.edu.uniquindio.poo;

public class Administrador extends Empleado {

    public Administrador(String nombre, String cedula, String telefono, String correo, String cargo) {
        super(nombre, cedula, telefono, correo, cargo);
    }

    public void eliminarVehiculo(Concesionario concesionario, Vehiculo vehiculo) {
        concesionario.removerVehiculo(vehiculo);
        System.out.println("Vehículo eliminado exitosamente.");
    }

    public void eliminarCliente(Concesionario concesionario, Cliente cliente) {
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
