package co.edu.uniquindio.poo.model;

public class Van extends Vehiculo {
    private int pasajeros;
    private int puertas;
    private int capacidadMaletero;
    private String aireAcondicionado;
    private String camaraReversa;
    private int airbags;
    private String abs;

    public Van(String marca, String uso, String modelo, String cambios, String velocidadMaxima, String cilindraje,
            int pasajeros, int puertas, int capacidadMaletero, String aireAcondicionado, String camaraReversa,
            int airbags, String abs) {
        super(marca, uso, modelo, cambios, velocidadMaxima, cilindraje);
        this.pasajeros = pasajeros;
        this.puertas = puertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.airbags = airbags;
        this.abs = abs;
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

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public String getAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(String aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public String getCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(String camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public int getAirbags() {
        return airbags;
    }

    public void setAirbags(int airbags) {
        this.airbags = airbags;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    @Override
    public String toString() {
        return "Vans [pasajeros=" + pasajeros + ", puertas=" + puertas + ", capacidadMaletero=" + capacidadMaletero
                + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa + ", airbags="
                + airbags + ", abs=" + abs + "]" + super.toString();
    }
}
