package co.edu.uniquindio.poo;

public class PickUp extends Vehiculo {
    private int pasajeros;
    private int puertas;
    private String aireAcondicionado;
    private String camaraReversa;
    private int airbags;
    private String abs;
    private String cuatroxcuatro;
    private int capacidadCajaCarga;

    public PickUp(String abs, int airbags, String aireAcondicionado, String camaraReversa, int capacidadCajaCarga,
                  String cuatroxcuatro, int pasajeros, int puertas, String marca, String uso, String modelo,
                  String cambios, String velocidadMaxima, String cilindraje) {
        super(marca, uso, modelo, cambios, velocidadMaxima, cilindraje);
        this.abs = abs;
        this.airbags = airbags;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.capacidadCajaCarga = capacidadCajaCarga;
        this.cuatroxcuatro = cuatroxcuatro;
        this.pasajeros = pasajeros;
        this.puertas = puertas;
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

    public String getCuatroxcuatro() {
        return cuatroxcuatro;
    }

    public void setCuatroxcuatro(String cuatroxcuatro) {
        this.cuatroxcuatro = cuatroxcuatro;
    }

    public int getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }

    public void setCapacidadCajaCarga(int capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    @Override
    public String toString() {
        return "PickUp [pasajeros=" + pasajeros + ", puertas=" + puertas + ", aireAcondicionado=" + aireAcondicionado
                + ", camaraReversa=" + camaraReversa + ", airbags=" + airbags + ", abs=" + abs + ", cuatroxcuatro="
                + cuatroxcuatro + ", capacidadCajaCarga=" + capacidadCajaCarga + "]" + super.toString();
    }
}
