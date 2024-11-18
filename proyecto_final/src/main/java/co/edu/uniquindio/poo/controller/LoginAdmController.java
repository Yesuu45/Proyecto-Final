package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.SistemaConcesionario;
import co.edu.uniquindio.poo.view.LoginAdmView;

public class LoginAdmController {

    private SistemaConcesionario sistemaConcesionario;
    private LoginAdmView view;

    public LoginAdmController(SistemaConcesionario sistemaConcesionario, LoginAdmView view) {
        this.sistemaConcesionario = sistemaConcesionario;
        this.view = view;
    }

    public Administrador verificarCredenciales(String usuario, String password) {
        if (sistemaConcesionario.verificarAdministradorCuenta(usuario, password)) {
            return sistemaConcesionario.obtenerAdministradorPorCredenciales(usuario, password);
        }
        return null;
    }

    public SistemaConcesionario getSistemaConcesionario() {
        return sistemaConcesionario;
    }

    public void setSistemaConcesionario(SistemaConcesionario sistemaConcesionario) {
        this.sistemaConcesionario = sistemaConcesionario;
    }

    public LoginAdmView getView() {
        return view;
    }

    public void setView(LoginAdmView view) {
        this.view = view;
    }
}