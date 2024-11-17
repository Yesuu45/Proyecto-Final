package co.edu.uniquindio.poo.viewController;
/**
 * Sample Skeleton for 'LoginAdministrador.fxml' Controller Class
 */

 import java.net.URL;
 import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.LoginAdministradorController;
import co.edu.uniquindio.poo.model.Administrador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
 import javafx.scene.control.Button;
 import javafx.scene.control.Label;
 import javafx.scene.control.PasswordField;
 import javafx.scene.control.TextField;
 
 public class LoginAdministradorViewController{
 
    private App app;
    private LoginAdministradorViewController controller;

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
 
    public void setApp(App app) {
        this.app = app;
        this.controller = new LoginAdministradorController(app.getSistemaConcesionario(), this);
        txterror.setVisible(false);
    }
     @FXML
     void ingresarAdministrador(ActionEvent event) {
        String usuario = usuarioTXT.getText();
        String contraseña = contraseñaTXT.getText();
        txterror.setVisible(false);

        if (usuario.isEmpty() || contraseña.isEmpty()) {
            txterror.setText("Por favor, ingrese todos los datos.");
            txterror.setVisible(true);
        } else {
            Administrador administrador = controller.verificarCredenciales(usuario, contraseña);
            if (administrador != null) {
                app.setAdministradorAutenticado(administrador);
                app.openSecondaryAdmView();
            } else {
                txterror.setText("Credenciales incorrectas.");
                txterror.setVisible(true);
            }
        }
    }
 
     @FXML
     void recuperarContraseña(ActionEvent event) {
 
     }
 
     @FXML // This method is called by the FXMLLoader when initialization is complete
     void initialize() {
         assert txterror != null : "fx:id=\"txterror\" was not injected: check your FXML file 'LoginAdministrador.fxml'.";
         assert usuarioTXT != null : "fx:id=\"usuarioTXT\" was not injected: check your FXML file 'LoginAdministrador.fxml'.";
         assert recuperarContraseña != null : "fx:id=\"recuperarContraseña\" was not injected: check your FXML file 'LoginAdministrador.fxml'.";
         assert contraseñaTXT != null : "fx:id=\"contraseñaTXT\" was not injected: check your FXML file 'LoginAdministrador.fxml'.";
         assert ingresarButton != null : "fx:id=\"ingresarButton\" was not injected: check your FXML file 'LoginAdministrador.fxml'.";
 
     }
 }
 