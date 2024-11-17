package co.edu.uniquindio.poo.model;

public class Vehiculo   {
    public  String marca;
    public String modelo;
    public String matricula;
    public int cambios;
    public double velocidadMaxima;
    public int cilindraje;
    public boolean esNuevo;
    public Trasmision trasmision;
    public double precio;
    public boolean disponible;
    public RevisionTecnica revisionTecnica;

    public Vehiculo(String marca, String modelo, String matricula, int cambios, double velocidadMaxima, int cilindraje,
            boolean esNuevo, Trasmision trasmision, double precio, boolean disponible,
            RevisionTecnica revisionTecnica) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
        this.esNuevo = esNuevo;
        this.trasmision = trasmision;
        this.precio = precio;
        this.disponible = disponible;
        this.revisionTecnica = revisionTecnica;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
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

    public boolean isEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }

    public Trasmision getTrasmision() {
        return trasmision;
    }

    public void setTrasmision(Trasmision trasmision) {
        this.trasmision = trasmision;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public RevisionTecnica getRevisionTecnica() {
        return revisionTecnica;
    }

    public void setRevisionTecnica(RevisionTecnica revisionTecnica) {
        this.revisionTecnica = revisionTecnica;
    }

    public boolean pasaRevisionTecnica(){
        boolean sentinela = false;
        if(revisionTecnica.isAprobado()){
           sentinela = true;
        } return sentinela;

    }
    public void revisionTecnica(RevisionTecnica revision) {
        setRevisionTecnica(revision);
        setDisponible(true);
        System.out.println("Se ha completado la revision Tecnica");

    }


    
  

    
    
}
