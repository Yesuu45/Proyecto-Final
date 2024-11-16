package co.edu.uniquindio.poo.model;

public class Camion extends Vehiculo{
    private int capacidadCarga;
    private String airbag;
    private String frenos;
    private String abs;
    private int numeroEjes;
    private String camion;

    public Camion(String abs, String airbag, String camion, int capacidadCarga, String frenos, int numeroEjes, String marca, String uso, String modelo, String cambios, String velocidadMaxima, String cilindraje) {
        super(marca, uso, modelo, cambios, velocidadMaxima, cilindraje);
        this.abs = abs;
        this.airbag = airbag;
        this.camion = camion;
        this.capacidadCarga = capacidadCarga;
        this.frenos = frenos;
        this.numeroEjes = numeroEjes;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getAirbag() {
        return airbag;
    }

    public void setAirbag(String airbag) {
        this.airbag = airbag;
    }

    public String getFrenos() {
        return frenos;
    }

    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public String getCamion() {
        return camion;
    }

    public void setCamion(String camion) {
        this.camion = camion;
    }

    @Override
    public String toString() {
        return "Camion [capacidadCarga=" + capacidadCarga + ", airbag=" + airbag + ", frenos=" + frenos + ", abs=" + abs
                + ", numeroEjes=" + numeroEjes + ", camion=" + camion + "]";
    }

    
    
}
