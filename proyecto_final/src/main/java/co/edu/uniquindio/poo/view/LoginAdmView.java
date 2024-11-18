package co.edu.uniquindio.poo.view;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.LoginAdmController;
import co.edu.uniquindio.poo.model.Administrador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginAdmView {
    /*
     * Atributos y FXML
     */
    private App app;
    private LoginAdmController controller;

    @FXML
    private Button ingresarButton;
    @FXML
    private Label labelError;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField usuarioField;

    /**
     * Establece el contexto de la aplicación para la vista `LoginAdmView`.
     * 
     * @param app La instancia principal de la aplicación de tipo `App`.
     * 
     *            Este método inicializa el `LoginAdmController` con el sistema
     *            concesionario
     *            obtenido de la instancia `App` y la vista actual (`this`). También
     *            asegura
     *            que la etiqueta de error (`labelError`) esté inicialmente oculta
     *            al establecer
     *            su visibilidad en falso.
     */
    public void setApp(App app) {
        this.app = app;
        this.controller = new LoginAdmController(app.getSistemaConcesionario(), this);
        labelError.setVisible(false);
    }

    /*
     * Acciones de boton ingresar
     */
    @FXML
    void handleIngresar(ActionEvent event) {
        String usuario = usuarioField.getText();
        String password = passwordField.getText();
        labelError.setVisible(false);

        if (usuario.isEmpty() || password.isEmpty()) {
            labelError.setText("Por favor, ingrese todos los datos.");
            labelError.setVisible(true);
        } else {
            Administrador administrador = controller.verificarCredenciales(usuario, password);
            if (administrador != null) {
                app.setAdministradorAutenticado(administrador);
                app.openSecondaryAdmView();
            } else {
                labelError.setText("Credenciales incorrectas.");
                labelError.setVisible(true);
            }
        }
    }
}
