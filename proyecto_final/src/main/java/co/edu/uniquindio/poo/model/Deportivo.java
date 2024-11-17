package co.edu.uniquindio.poo.model;

public class Deportivo extends VehiculoHibrido{
    private int numeroPasajeros;
    private int numeroPuertas;
    private int numeroBolsasAire;
    private double numeroCaballosFuerza;
    private double tiempoAlcazar100Km;
    private String datosPropiedadesVehiculo;
    
    public Deportivo(String marca, String modelo, String matricula, int cambios, double velocidadMaxima, int cilindraje,
            boolean esNuevo, Trasmision trasmision, double precio, boolean disponible, RevisionTecnica revisionTecnica,
            boolean esEnchufable, boolean esLigero, int numeroPasajeros, int numeroPuertas, int numeroBolsasAire,
            double numeroCaballosFuerza, double tiempoAlcazar100Km, String datosPropiedadesVehiculo) {
        super(marca, modelo, matricula, cambios, velocidadMaxima, cilindraje, esNuevo, trasmision, precio, disponible,
                revisionTecnica, esEnchufable, esLigero);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsasAire = numeroBolsasAire;
        this.numeroCaballosFuerza = numeroCaballosFuerza;
        this.tiempoAlcazar100Km = tiempoAlcazar100Km;
        this.datosPropiedadesVehiculo = datosPropiedadesVehiculo;
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
    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }
    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }
    public double getNumeroCaballosFuerza() {
        return numeroCaballosFuerza;
    }
    public void setNumeroCaballosFuerza(double numeroCaballosFuerza) {
        this.numeroCaballosFuerza = numeroCaballosFuerza;
    }
    public double getTiempoAlcazar100Km() {
        return tiempoAlcazar100Km;
    }
    public void setTiempoAlcazar100Km(double tiempoAlcazar100Km) {
        this.tiempoAlcazar100Km = tiempoAlcazar100Km;
    }
    public String getDatosPropiedadesVehiculo() {
        return datosPropiedadesVehiculo;
    }
    public void setDatosPropiedadesVehiculo(String datosPropiedadesVehiculo) {
        this.datosPropiedadesVehiculo = datosPropiedadesVehiculo;
    }
    
    
}
