package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.SistemaConcesionario;
import co.edu.uniquindio.poo.view.LoginEmpleadoView;
import javafx.scene.control.Label;

public class LoginEmpleadoController {
    private SistemaConcesionario sistemaConcesionario;
    private LoginEmpleadoView view;

    public LoginEmpleadoController(SistemaConcesionario sistemaConcesionario, LoginEmpleadoView view) {
        this.sistemaConcesionario = sistemaConcesionario;
        this.view = view;
    }

    public boolean verificarEmpleadoCuenta(String nombreUsuario, String contraseña) {
        return sistemaConcesionario.verificarEmpleadoCuenta(nombreUsuario, contraseña);
    }

    public void handleIngresar(String nombreUsuario, String password, Label labelError) {
        if (nombreUsuario.isEmpty() || password.isEmpty()) {
            labelError.setText("Por favor, ingrese todos los datos.");
        } else {
            if (verificarEmpleadoCuenta(nombreUsuario, password)) {
                labelError.setText("");
                view.openSecondaryEmpleado();
            } else {
                labelError.setText("Credenciales incorrectas.");
            }
        }
    }

    public SistemaConcesionario getSistemaConcesionario() {
        return sistemaConcesionario;
    }

    public void setSistemaConcesionario(SistemaConcesionario sistemaConcesionario) {
        this.sistemaConcesionario = sistemaConcesionario;
    }

    public LoginEmpleadoView getView() {
        return view;
    }

    public void setView(LoginEmpleadoView view) {
        this.view = view;
    }

}
