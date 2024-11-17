package co.edu.uniquindio.poo.model;

public class VehiculoCombustible extends Vehiculo {
    private double capacidadCombustible;
    private double consumoPorKm;
    private Combustible combustible;
    
    public VehiculoCombustible(String marca, String modelo, String matricula, int cambios, double velocidadMaxima,
            int cilindraje, boolean esNuevo, Trasmision trasmision, double precio, boolean disponible,
            RevisionTecnica revisionTecnica, double capacidadCombustible, double consumoPorKm,
            Combustible combustible) {
        super(marca, modelo, matricula, cambios, velocidadMaxima, cilindraje, esNuevo, trasmision, precio, disponible,
                revisionTecnica);
        this.capacidadCombustible = capacidadCombustible;
        this.consumoPorKm = consumoPorKm;
        this.combustible = combustible;
    }
    public double getCapacidadCombustible() {
        return capacidadCombustible;
    }
    public void setCapacidadCombustible(double capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }
    public double getConsumoPorKm() {
        return consumoPorKm;
    }
    public void setConsumoPorKm(double consumoPorKm) {
        this.consumoPorKm = consumoPorKm;
    }
    public Combustible getCombustible() {
        return combustible;
    }
    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    
}
