package co.edu.uniquindio.poo;

public class Deportivo extends Vehiculo{
    private int pasajeros;
    private int puertas;
    private int airbags;
    private int caballosFuerza;
    private int cienkm;

    public Deportivo(String marca, String uso, String modelo, String cambios, String velocidadMaxima, String cilindraje, int pasajeros, int puertas, int airbags, int caballosFuerza, int cienkm){
        super(marca, uso, modelo, cambios, cambios, cilindraje);
        this.pasajeros = pasajeros;
        this.puertas = puertas;
        this.airbags = airbags;
        this.caballosFuerza = caballosFuerza;
        this.cienkm = cienkm;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getAirbags() {
        return airbags;
    }

    public void setAirbags(int airbags) {
        this.airbags = airbags;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public int getCienkm() {
        return cienkm;
    }

    public void setCienkm(int cienkm) {
        this.cienkm = cienkm;
    }

    @Override
    public String toString() {
        return "Deportivo [pasajeros=" + pasajeros + ", puertas=" + puertas + ", airbags=" + airbags
                + ", caballosFuerza=" + caballosFuerza + ", cienkm=" + cienkm + "]"+super.toString();
    }
    
    
}
