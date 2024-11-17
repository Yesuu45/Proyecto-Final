package co.edu.uniquindio.poo.model;


public class Sedan extends VehiculoElectrico{
    private int numeroPasajeros;
    private int numeroPuertas;
    private int capacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReserva;
    private boolean velocidadCrucero;
    private int numeroBolsasAire;
    private boolean abs; // supencion adaptivisa
    private boolean sensorColision;
    private boolean SensorTraaficoCruzado;
    private boolean asistenciaPermanenciaCarril;
    
    public Sedan(String marca, String modelo, String matricula, int cambios, double velocidadMaxima, int cilindraje,
            boolean esNuevo, Trasmision trasmision, double precio, boolean disponible, RevisionTecnica revisionTecnica,
            double autonomiaCarga, double tiemploPromedioCarga, int numeroPasajeros, int numeroPuertas,
            int capacidadMaletero, boolean aireAcondicionado, boolean camaraReserva, boolean velocidadCrucero,
            int numeroBolsasAire, boolean abs, boolean sensorColision, boolean sensorTraaficoCruzado,
            boolean asistenciaPermanenciaCarril) {
        super(marca, modelo, matricula, cambios, velocidadMaxima, cilindraje, esNuevo, trasmision, precio, disponible,
                revisionTecnica, autonomiaCarga, tiemploPromedioCarga);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReserva = camaraReserva;
        this.velocidadCrucero = velocidadCrucero;
        this.numeroBolsasAire = numeroBolsasAire;
        this.abs = abs;
        this.sensorColision = sensorColision;
        SensorTraaficoCruzado = sensorTraaficoCruzado;
        this.asistenciaPermanenciaCarril = asistenciaPermanenciaCarril;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isCamaraReserva() {
        return camaraReserva;
    }

    public void setCamaraReserva(boolean camaraReserva) {
        this.camaraReserva = camaraReserva;
    }

    public boolean isVelocidadCrucero() {
        return velocidadCrucero;
    }

    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isSensorColision() {
        return sensorColision;
    }

    public void setSensorColision(boolean sensorColision) {
        this.sensorColision = sensorColision;
    }

    public boolean isSensorTraaficoCruzado() {
        return SensorTraaficoCruzado;
    }

    public void setSensorTraaficoCruzado(boolean sensorTraaficoCruzado) {
        SensorTraaficoCruzado = sensorTraaficoCruzado;
    }

    public boolean isAsistenciaPermanenciaCarril() {
        return asistenciaPermanenciaCarril;
    }

    public void setAsistenciaPermanenciaCarril(boolean asistenciaPermanenciaCarril) {
        this.asistenciaPermanenciaCarril = asistenciaPermanenciaCarril;
    }

    
    

}
