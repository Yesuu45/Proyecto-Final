package co.edu.uniquindio.poo.model;

public class PickUps extends VehiculoHibrido {

    private int numeroPasajero;
    private int numeroPuertas;
    private int CapacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReserva;
    private int numeroBolsasAire;
    private boolean abs ;
    private boolean vehiculo4x4;
    private int capacidadCajaCarga;
    
    public PickUps(String marca, String modelo, String matricula, int cambios, double velocidadMaxima, int cilindraje,
            boolean esNuevo, Trasmision trasmision, double precio, boolean disponible, RevisionTecnica revisionTecnica,
            boolean esEnchufable, boolean esLigero, int numeroPasajero, int numeroPuertas, int capacidadMaletero,
            boolean aireAcondicionado, boolean camaraReserva, int numeroBolsasAire, boolean abs, boolean vehiculo4x4,
            int capacidadCajaCarga) {
        super(marca, modelo, matricula, cambios, velocidadMaxima, cilindraje, esNuevo, trasmision, precio, disponible,
                revisionTecnica, esEnchufable, esLigero);
        this.numeroPasajero = numeroPasajero;
        this.numeroPuertas = numeroPuertas;
        CapacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReserva = camaraReserva;
        this.numeroBolsasAire = numeroBolsasAire;
        this.abs = abs;
        this.vehiculo4x4 = vehiculo4x4;
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    public int getNumeroPasajero() {
        return numeroPasajero;
    }

    public void setNumeroPasajero(int numeroPasajero) {
        this.numeroPasajero = numeroPasajero;
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

    public boolean isVehiculo4x4() {
        return vehiculo4x4;
    }

    public void setVehiculo4x4(boolean vehiculo4x4) {
        this.vehiculo4x4 = vehiculo4x4;
    }

    public int getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }

    public void setCapacidadCajaCarga(int capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }
   

    
    

    
    
}
