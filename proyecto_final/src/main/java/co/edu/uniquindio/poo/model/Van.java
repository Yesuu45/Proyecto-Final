package co.edu.uniquindio.poo.model;

public class Van extends VehiculoCombustible{
    private int numeroPasajero;
    private int numeroPuerta;
    private int capacidadMaletero;
    private boolean tieneAireAcondicionado;
    private boolean tieneCamaraReserva;
    private boolean tieneVelocidadCrucero;
    private boolean tieneABS;
    private int numeroBolsasAire;
    
    public Van(String marca, String modelo, String matricula, int cambios, double velocidadMaxima, int cilindraje,
            boolean esNuevo, Trasmision trasmision, double precio, boolean disponible, RevisionTecnica revisionTecnica,
            double capacidadCombustible, double consumoPorKm, Combustible combustible, int numeroPasajero,
            int numeroPuerta, int capacidadMaletero, boolean tieneAireAcondicionado, boolean tieneCamaraReserva,
            boolean tieneVelocidadCrucero, boolean tieneABS, int numeroBolsasAire) {
        super(marca, modelo, matricula, cambios, velocidadMaxima, cilindraje, esNuevo, trasmision, precio, disponible,
                revisionTecnica, capacidadCombustible, consumoPorKm, combustible);
        this.numeroPasajero = numeroPasajero;
        this.numeroPuerta = numeroPuerta;
        this.capacidadMaletero = capacidadMaletero;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReserva = tieneCamaraReserva;
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
        this.tieneABS = tieneABS;
        this.numeroBolsasAire = numeroBolsasAire;
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
    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }
    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
    public boolean isTieneCamaraReserva() {
        return tieneCamaraReserva;
    }
    public void setTieneCamaraReserva(boolean tieneCamaraReserva) {
        this.tieneCamaraReserva = tieneCamaraReserva;
    }
    public boolean isTieneVelocidadCrucero() {
        return tieneVelocidadCrucero;
    }
    public void setTieneVelocidadCrucero(boolean tieneVelocidadCrucero) {
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
    }
    public boolean isTieneABS() {
        return tieneABS;
    }
    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }
    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }
    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }


    
    
}
