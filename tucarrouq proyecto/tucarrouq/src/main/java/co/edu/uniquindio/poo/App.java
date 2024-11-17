package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        // Crear el concesionario
        Concesionario concesionario = new Concesionario();

        // Crear algunos empleados
        Empleado empleado1 = new Empleado("Carlos Pérez", "123456789", "123456789", "carlos@empresa.com", "Vendedor");
        Administrador admin = new Administrador("Luis Gómez", "987654321", "987654321", "luis@empresa.com", "Administrador");

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan Martínez", "111222333", "111222333", "juan@cliente.com");
        Cliente cliente2 = new Cliente("Ana López", "444555666", "444555666", "ana@cliente.com");

        // Crear vehículos
        Vehiculo vehiculo1 = new Sedan(4, 4, true, "Toyota", "Particular", "2023", "Automático", "180 km/h", "2.0L");
        Vehiculo vehiculo2 = new PickUp("Sí", 6, "Sí", "Sí", 1000, "Sí", 4, 5, "Ford", "Comercial", "2022", "Manual", "160 km/h", "3.5L");

        // Registrar vehículos y clientes
        empleado1.registrarVehiculo(concesionario, vehiculo1);
        empleado1.registrarVehiculo(concesionario, vehiculo2);
        empleado1.registrarCliente(concesionario, cliente1);
        empleado1.registrarCliente(concesionario, cliente2);

        // Realizar una transacción de alquiler
        empleado1.alquilarVehiculo(concesionario, cliente1, vehiculo1, "2024-01-01", "2024-01-07");

        // Realizar una venta
        empleado1.venderVehiculo(concesionario, cliente2, vehiculo2);

        // Administrador elimina un vehículo
        admin.eliminarVehiculo(concesionario, vehiculo2);

        // Ver transacciones realizadas
        admin.verTransacciones();
    }
}
