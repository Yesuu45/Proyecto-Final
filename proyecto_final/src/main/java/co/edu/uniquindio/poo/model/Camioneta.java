package co.edu.uniquindio.poo.model;

public class Camioneta extends VehiculoElectrico {
    private int numeroPasajeros;
    private int numeroPuertas;
    private int CapacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReserva;
    private boolean velocidadCrucero;
    private int numeroBolsasAire;
    private boolean abs;
    private boolean sensorColision;
    private boolean sensorTraaficoCruzado;
    private boolean asistenciaPermanenciaCarril;
    private boolean vehiculo4x4;

    public Camioneta(String marca, String modelo, String matricula, int cambios, double velocidadMaxima, int cilindraje,
            boolean esNuevo, Trasmision trasmision, double precio, boolean disponible, RevisionTecnica revisionTecnica,
            double autonomiaCarga, double tiemploPromedioCarga, int numeroPasajeros, int numeroPuertas,
            int capacidadMaletero, boolean aireAcondicionado, boolean camaraReserva, boolean velocidadCrucero,
            int numeroBolsasAire, boolean abs, boolean sensorColision, boolean sensorTraaficoCruzado,
            boolean asistenciaPermanenciaCarril, boolean vehiculo4x4) {
        super(marca, modelo, matricula, cambios, velocidadMaxima, cilindraje, esNuevo, trasmision, precio, disponible,
                revisionTecnica, autonomiaCarga, tiemploPromedioCarga);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        CapacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReserva = camaraReserva;
        this.velocidadCrucero = velocidadCrucero;
        this.numeroBolsasAire = numeroBolsasAire;
        this.abs = abs;
        this.sensorColision = sensorColision;
        this.sensorTraaficoCruzado = sensorTraaficoCruzado;
        this.asistenciaPermanenciaCarril = asistenciaPermanenciaCarril;
        this.vehiculo4x4 = vehiculo4x4;
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
        return CapacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        CapacidadMaletero = capacidadMaletero;
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
        return sensorTraaficoCruzado;
    }

    public void setSensorTraaficoCruzado(boolean sensorTraaficoCruzado) {
        this.sensorTraaficoCruzado = sensorTraaficoCruzado;
    }

    public boolean isAsistenciaPermanenciaCarril() {
        return asistenciaPermanenciaCarril;
    }

    public void setAsistenciaPermanenciaCarril(boolean asistenciaPermanenciaCarril) {
        this.asistenciaPermanenciaCarril = asistenciaPermanenciaCarril;
    }

    public boolean isVehiculo4x4() {
        return vehiculo4x4;
    }

    public void setVehiculo4x4(boolean vehiculo4x4) {
        this.vehiculo4x4 = vehiculo4x4;
    }

    
    
   
    
}
