package co.edu.uniquindio.poo.model;

public class Moto extends Vehiculo {

    public Moto (String marca, String modelo, String matricula, int cambios, double velocidadMaxima, int cilindraje,
        boolean esNuevo, Trasmision trasmision, double precio, boolean disponible, RevisionTecnica revisionTecnica,
        double capacidadCombustible, double consumoPorKm, Combustible combustible){
        super(marca, modelo, matricula, cambios, velocidadMaxima, cilindraje, esNuevo, trasmision, precio, disponible, revisionTecnica);
    }
}
