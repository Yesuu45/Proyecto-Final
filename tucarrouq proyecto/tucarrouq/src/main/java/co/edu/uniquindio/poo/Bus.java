package co.edu.uniquindio.poo;

public class Bus extends Vehiculo{
    private int pasajeros;
    private int puertas;
    private int capacidadMaletero;
    private String aireAcondicionado;
    private String camaraReversa;
    private int airbags;
    private String abs;
    private int ejes;
    private int salidasEmergencia;

    public Bus(String abs, int airbags, String aireAcondicionado, String camaraReversa, int capacidadMaletero, int ejes, int pasajeros, int puertas, int salidasEmergencia, String marca, String uso, String modelo, String cambios, String velocidadMaxima, String cilindraje) {
        super(marca, uso, modelo, cambios, velocidadMaxima, cilindraje);
        this.abs = abs;
        this.airbags = airbags;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.capacidadMaletero = capacidadMaletero;
        this.ejes = ejes;
        this.pasajeros = pasajeros;
        this.puertas = puertas;
        this.salidasEmergencia = salidasEmergencia;
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

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public int getSalidasEmergencia() {
        return salidasEmergencia;
    }

    public void setSalidasEmergencia(int salidasEmergencia) {
        this.salidasEmergencia = salidasEmergencia;
    }

    @Override
    public String toString() {
        return "Bus [pasajeros=" + pasajeros + ", puertas=" + puertas + ", capacidadMaletero=" + capacidadMaletero
                + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa + ", airbags="
                + airbags + ", abs=" + abs + ", ejes=" + ejes + ", salidasEmergencia=" + salidasEmergencia + "]"+super.toString();
    }




    
}
