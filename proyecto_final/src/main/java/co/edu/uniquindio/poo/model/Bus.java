package co.edu.uniquindio.poo.model;

public class Bus extends VehiculoElectrico {
    private int numeroPasajero;
    private int numeroPuerta;
    private int capacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReserva;
    private int numeroBolsasAire;
    private boolean abs;
    private int numeroEjes;
    private int numeroEmergencia;

    public Bus(String marca, String modelo, String matricula, int cambios, double velocidadMaxima, int cilindraje,
            boolean esNuevo, Trasmision trasmision, double precio, boolean disponible, RevisionTecnica revisionTecnica,
            double autonomiaCarga, double tiemploPromedioCarga, int numeroPasajero, int numeroPuerta,
            int capacidadMaletero, boolean aireAcondicionado, boolean camaraReserva, int numeroBolsasAire, boolean abs,
            int numeroEjes, int numeroEmergencia) {
        super(marca, modelo, matricula, cambios, velocidadMaxima, cilindraje, esNuevo, trasmision, precio, disponible,
                revisionTecnica, autonomiaCarga, tiemploPromedioCarga);
        this.numeroPasajero = numeroPasajero;
        this.numeroPuerta = numeroPuerta;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReserva = camaraReserva;
        this.numeroBolsasAire = numeroBolsasAire;
        this.abs = abs;
        this.numeroEjes = numeroEjes;
        this.numeroEmergencia = numeroEmergencia;
    }

    public int getNumeroPasajero() {
        return numeroPasajero;
    }

    public void setNumeroPasajero(int numeroPasajero) {
        this.numeroPasajero = numeroPasajero;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public void setNumeroPuerta(int numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
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

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public int getNumeroEmergencia() {
        return numeroEmergencia;
    }

    public void setNumeroEmergencia(int numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    
    
}
