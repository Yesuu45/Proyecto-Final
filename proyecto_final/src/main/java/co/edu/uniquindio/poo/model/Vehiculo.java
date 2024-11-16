package co.edu.uniquindio.poo.model;

public class Vehiculo {
    public String marca;
    public String nuevoUsado;
    public String modelo;
    public double velocidadMaxima;
    public int cilindraje;
    public Trasmision trasmision;
    public Combustible combustible;


    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getNuevoUsado() {
        return nuevoUsado;
    }
    public void setNuevoUsado(String nuevoUsado) {
        this.nuevoUsado = nuevoUsado;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public int getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    public int getTrasmision() {
        return trasmision;
    }
    public void setTrasmision(int trasmision) {
        this.trasmision = trasmision;
    }
    public double getCombustible() {
        return combustible;
    }
    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    

    
}
