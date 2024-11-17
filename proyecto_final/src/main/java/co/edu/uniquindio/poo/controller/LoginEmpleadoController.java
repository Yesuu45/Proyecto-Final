package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.SistemaConcesionario;
import javafx.scene.control.Label;

public class LoginEmpleadoController {
    private SistemaConcesionario sistemaConcesionario;
    private LoginEmpleadoViewController LoginEmpleadoViewController ;

    public boolean verificarEmpleadoCuenta(String Usuario, String contraseña) {
        return sistemaConcesionario.verificarEmpleadoCuenta(Usuario, contraseña);
    }

    public void handleIngresar(String Usuario, String contraseña, Label txterror) {
        if (Usuario.isEmpty() || contraseña.isEmpty()) {
            txterror.setText("Por favor, ingrese todos los datos.");
        } else {
            if (verificarEmpleadoCuenta(Usuario, contraseña)) {
                txterror.setText("");
                view.openSecondaryEmpleado();
            } else {
                txterror.setText("Credenciales incorrectas.");
            }
        }
    }

    public SistemaConcesionario getSistemaConcesionario() {
        return sistemaConcesionario;
    }

    
}
