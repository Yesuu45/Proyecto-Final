package co.edu.uniquindio.poo.model;

public class VehiculoElectrico extends Vehiculo {
    private double autonomiaCarga;
    private double tiemploPromedioCarga;
    public VehiculoElectrico(String marca, String modelo, String matricula, int cambios, double velocidadMaxima,
            int cilindraje, boolean esNuevo, Trasmision trasmision, double precio, boolean disponible,
            RevisionTecnica revisionTecnica, double autonomiaCarga, double tiemploPromedioCarga) {
        super(marca, modelo, matricula, cambios, velocidadMaxima, cilindraje, esNuevo, trasmision, precio, disponible,
                revisionTecnica);
        this.autonomiaCarga = autonomiaCarga;
        this.tiemploPromedioCarga = tiemploPromedioCarga;
    }
    public double getAutonomiaCarga() {
        return autonomiaCarga;
    }
    public void setAutonomiaCarga(double autonomiaCarga) {
        this.autonomiaCarga = autonomiaCarga;
    }
    public double getTiemploPromedioCarga() {
        return tiemploPromedioCarga;
    }
    public void setTiemploPromedioCarga(double tiemploPromedioCarga) {
        this.tiemploPromedioCarga = tiemploPromedioCarga;
    }

    
    
}
