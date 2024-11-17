package co.edu.uniquindio.poo.model;

public class Camion extends VehiculoHibrido {
    private int capacidadCarga;
    private boolean aireAcondicionado;
    private boolean frenosAire;
    private boolean abs;
    private int numeroEjes;
    private TipoCamion tipoCamion;

    public Camion(String marca, String modelo, String matricula, int cambios, double velocidadMaxima, int cilindraje,
            boolean esNuevo, Trasmision trasmision, double precio, boolean disponible, RevisionTecnica revisionTecnica,
            boolean esEnchufable, boolean esLigero, int capacidadCarga, boolean aireAcondicionado, boolean frenosAire,
            boolean abs, int numeroEjes, TipoCamion tipoCamion) {
        super(marca, modelo, matricula, cambios, velocidadMaxima, cilindraje, esNuevo, trasmision, precio, disponible,
                revisionTecnica, esEnchufable, esLigero);
        this.capacidadCarga = capacidadCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.frenosAire = frenosAire;
        this.abs = abs;
        this.numeroEjes = numeroEjes;
        this.tipoCamion = tipoCamion;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isFrenosAire() {
        return frenosAire;
    }

    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire;
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

    public TipoCamion getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(TipoCamion tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    

   
    

    
    

}
