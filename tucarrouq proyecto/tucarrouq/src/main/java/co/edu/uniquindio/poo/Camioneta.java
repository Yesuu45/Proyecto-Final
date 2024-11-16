package co.edu.uniquindio.poo;

public class Camioneta extends Vehiculo{
    private int pasajeros;
    private int puertas;
    private int capacidadMaletero;
    private String aireAcondicionado;
    private String camaraReversa;
    private String velocidadCrucero;
    private int airbags;
    private String abs;
    private String sensoresColision;
    private String sensorTraficoCruzado;
    private String asistentePermanenciaCarril;
    private String cuatroxcuatro;

    public Camioneta(String abs, int airbags, String aireAcondicionado, String asistentePermanenciaCarril, String camaraReversa, int capacidadMaletero, String cuatroxcuatro, int pasajeros, int puertas, String sensorTraficoCruzado, String sensoresColision, String velocidadCrucero, String marca, String uso, String modelo, String cambios, String velocidadMaxima, String cilindraje) {
        super(marca, uso, modelo, cambios, velocidadMaxima, cilindraje);
        this.abs = abs;
        this.airbags = airbags;
        this.aireAcondicionado = aireAcondicionado;
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
        this.camaraReversa = camaraReversa;
        this.capacidadMaletero = capacidadMaletero;
        this.cuatroxcuatro = cuatroxcuatro;
        this.pasajeros = pasajeros;
        this.puertas = puertas;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.sensoresColision = sensoresColision;
        this.velocidadCrucero = velocidadCrucero;
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

    public String getVelocidadCrucero() {
        return velocidadCrucero;
    }

    public void setVelocidadCrucero(String velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
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

    public String getSensoresColision() {
        return sensoresColision;
    }

    public void setSensoresColision(String sensoresColision) {
        this.sensoresColision = sensoresColision;
    }

    public String getSensorTraficoCruzado() {
        return sensorTraficoCruzado;
    }

    public void setSensorTraficoCruzado(String sensorTraficoCruzado) {
        this.sensorTraficoCruzado = sensorTraficoCruzado;
    }

    public String getAsistentePermanenciaCarril() {
        return asistentePermanenciaCarril;
    }

    public void setAsistentePermanenciaCarril(String asistentePermanenciaCarril) {
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
    }

    public String getCuatroxcuatro() {
        return cuatroxcuatro;
    }

    public void setCuatroxcuatro(String cuatroxcuatro) {
        this.cuatroxcuatro = cuatroxcuatro;
    }

    @Override
    public String toString() {
        return "Camionetas [pasajeros=" + pasajeros + ", puertas=" + puertas + ", capacidadMaletero="
                + capacidadMaletero + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa
                + ", velocidadCrucero=" + velocidadCrucero + ", airbags=" + airbags + ", abs=" + abs
                + ", sensoresColision=" + sensoresColision + ", sensorTraficoCruzado=" + sensorTraficoCruzado
                + ", asistentePermanenciaCarril=" + asistentePermanenciaCarril + ", cuatroxcuatro=" + cuatroxcuatro
                + "]"+super.toString();
    }



    
}
