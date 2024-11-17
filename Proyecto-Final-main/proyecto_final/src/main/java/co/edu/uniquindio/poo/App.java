package co.edu.uniquindio.poo;

import java.io.IOException;

import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Consecionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.PickUp;
import co.edu.uniquindio.poo.model.Sedan;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    public static void main(String[] args) {
        // Crear el concesionario
        Consecionario concesionario = new Consecionario();

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




    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }


}