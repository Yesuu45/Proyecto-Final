package co.edu.uniquindio.poo.viewController;

/**
 * Sample Skeleton for 'Primary.fxml' Controller Class
 */

 import java.net.URL;
 import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
 import javafx.scene.control.Button;
 
 public class PrimaryViewController {

    private App app;

    public void setApp(App app) {
        this.app = app;
    }

 
     @FXML // ResourceBundle that was given to the FXMLLoader
     private ResourceBundle resources;
 
     @FXML // URL location of the FXML file that was given to the FXMLLoader
     private URL location;
 
     @FXML // fx:id="buttonEmpleado"
     private Button buttonEmpleado; // Value injected by FXMLLoader
 
     @FXML // fx:id="buttonAdministrador"
     private Button buttonAdministrador; // Value injected by FXMLLoader
 
     @FXML
     void cargarAdministrador(ActionEvent event) {
         app.openLoginEmpleadoViewController();  // Acción directa al hacer clic en el botón "Administrador"
     }
     
     @FXML
     void cargarEmpleado(ActionEvent event) {
         app.openLoginEmpleadoViewController();  // Acción directa al hacer clic en el botón "Empleado"
     }
     
     @FXML // This method is called by the FXMLLoader when initialization is complete
     void initialize() {
         assert buttonEmpleado != null : "fx:id=\"buttonEmpleado\" was not injected: check your FXML file 'Primary.fxml'.";
         assert buttonAdministrador != null : "fx:id=\"buttonAdministrador\" was not injected: check your FXML file 'Primary.fxml'.";
 
     }
 }
 