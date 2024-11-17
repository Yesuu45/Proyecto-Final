package co.edu.uniquindio.poo.viewController;

/**
 * Sample Skeleton for 'LoginEmpleado.fxml' Controller Class
 */

 import java.net.URL;
 import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.LoginEmpleadoController;
import co.edu.uniquindio.poo.model.Empleado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
 import javafx.scene.control.Button;
 import javafx.scene.control.Label;
 import javafx.scene.control.PasswordField;
 import javafx.scene.control.TextField;
 
 public class LoginEmpleadoViewController {
 
     @FXML // ResourceBundle that was given to the FXMLLoader
     private ResourceBundle resources;
 
     @FXML // URL location of the FXML file that was given to the FXMLLoader
     private URL location;
 
     @FXML // fx:id="txterror"
     private Label txterror; // Value injected by FXMLLoader
 
     @FXML // fx:id="usuarioTXT"
     private TextField usuarioTXT; // Value injected by FXMLLoader
 
     @FXML // fx:id="recuperarContraseña"
     private Button recuperarContraseña; // Value injected by FXMLLoader
 
     @FXML // fx:id="contraseñaTXT"
     private PasswordField contraseñaTXT; // Value injected by FXMLLoader
 
     @FXML // fx:id="ingresarButton"
     private Button ingresarButton; // Value injected by FXMLLoader
 
         /*
     * Metodo App que conceta las clases entre si
     */
    public void setApp(App app) {
        this.app = app;
        this.controller = new LoginEmpleadoController(this.app.getSistemaConcesionario(), this);

        txterror.setVisible(false);
    }
     @FXML
     void ingresarAdministrador(ActionEvent event) {
         String Usuario = usuarioTXT.getText();
        String contraseña = contraseñaTXT.getText();

        txterror.setVisible(false);

        if (Usuario.isEmpty() || contraseña.isEmpty()) {
            txterror.setText("Por favor, ingrese todos los datos.");
            txterror.setVisible(true);
        } else {
            Empleado empleado = controller.getSistemaConcesionario().obtenerEmpleadoPorCredenciales(Usuario,
                    contraseña);
            if (empleado != null) {
                app.setEmpleadoAutenticado(empleado);
                openSecondaryEmpleado();
            } else {
                txterror.setText("Empleado no encontrado.");
                txterror.setVisible(true);
            }
        }
     }
 
     @FXML
     void recuperarContraseña(ActionEvent event) {
 
     }

     public void openSecondaryEmpleado() {
        app.openSecondaryEmpleadoView();
    }
    
 
     @FXML // This method is called by the FXMLLoader when initialization is complete
     void initialize() {
         assert txterror != null : "fx:id=\"txterror\" was not injected: check your FXML file 'LoginEmpleado.fxml'.";
         assert usuarioTXT != null : "fx:id=\"usuarioTXT\" was not injected: check your FXML file 'LoginEmpleado.fxml'.";
         assert recuperarContraseña != null : "fx:id=\"recuperarContraseña\" was not injected: check your FXML file 'LoginEmpleado.fxml'.";
         assert contraseñaTXT != null : "fx:id=\"contraseñaTXT\" was not injected: check your FXML file 'LoginEmpleado.fxml'.";
         assert ingresarButton != null : "fx:id=\"ingresarButton\" was not injected: check your FXML file 'LoginEmpleado.fxml'.";
 
     }
 }
 