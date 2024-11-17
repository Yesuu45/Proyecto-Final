package co.edu.uniquindio.poo.model;

public class VehiculoHibrido extends Vehiculo {
    private boolean esEnchufable;
    private boolean esLigero;
    
    public VehiculoHibrido(String marca, String modelo, String matricula, int cambios, double velocidadMaxima,
            int cilindraje, boolean esNuevo, Trasmision trasmision, double precio, boolean disponible,
            RevisionTecnica revisionTecnica, boolean esEnchufable, boolean esLigero) {
        super(marca, modelo, matricula, cambios, velocidadMaxima, cilindraje, esNuevo, trasmision, precio, disponible,
                revisionTecnica);
        this.esEnchufable = esEnchufable;
        this.esLigero = esLigero;
    }
    public boolean isEsEnchufable() {
        return esEnchufable;
    }
    public void setEsEnchufable(boolean esEnchufable) {
        this.esEnchufable = esEnchufable;
    }
    public boolean isEsLigero() {
        return esLigero;
    }
    public void setEsLigero(boolean esLigero) {
        this.esLigero = esLigero;
    }

    
    
}
