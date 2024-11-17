package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.SistemaConcesionario;
import co.edu.uniquindio.poo.viewController.LoginAdministradorViewController;
import javafx.scene.control.Label;

public class LoginAdministradorController {
    
    private SistemaConcesionario sistemaConcesionario;
    private LoginAdministradorViewController LoginAdministradorViewController;
    
    public LoginAdministradorController(SistemaConcesionario sistemaConcesionario, LoginAdministradorViewController LoginAdministradorViewController) {
        this.sistemaConcesionario = sistemaConcesionario;
        this.LoginAdministradorViewController = LoginAdministradorViewController;
    }

    public Administrador verificarCredenciales(String usuario, String contraseña) {
        if (sistemaConcesionario.verificarAdministradorCuenta(usuario, contraseña)) {
            return sistemaConcesionario.obtenerAdministradorPorCredenciales(usuario, contraseña);
        }
        return null;
    }

    public SistemaConcesionario getSistemaConcesionario() {
        return sistemaConcesionario;
    }

    public void setSistemaConcesionario(SistemaConcesionario sistemaConcesionario) {
        this.sistemaConcesionario = sistemaConcesionario;
    }

    public LoginAdministradorViewController getLoginAdministradorViewController() {
        return LoginAdministradorViewController;
    }

    public void setLoginAdministradorViewController(LoginAdministradorViewController loginAdministradorViewController) {
        LoginAdministradorViewController = loginAdministradorViewController;
    }
}
