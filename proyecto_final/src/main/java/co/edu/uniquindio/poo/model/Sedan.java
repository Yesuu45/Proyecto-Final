package co.edu.uniquindio.poo.model;

public class Sedan extends Vehiculo {

    private int numeroPasajero;
    private int numeroPuerta;
    private int capacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReserva;
    private boolean velocidadCrucero;
    private int numeroBolsasAire;
    private boolean suspencionAdaptiva; // suspencion adaptiva son las siglas ADS
    private boolean sensoresColision;
    private boolean sensoresTraficoCruzado;
    private boolean asistentePermanenciaCaril;
    
    public Sedan(String marca, boolean nuevo, String modelo, Trasmision trasmision, String velocidadMaxima,
            String cilindraje, int numeroCambios, Combustible combustible, double autonomiaCargaCompleta,
            double tiempoCargaPromedio, boolean esEnchufable, boolean esHibridoLigero, int numeroPasajero,
            int numeroPuerta, int capacidadMaletero, boolean aireAcondicionado, boolean camaraReserva,
            boolean velocidadCrucero, int numeroBolsasAire, boolean suspencionAdaptiva, boolean sensoresColision,
            boolean sensoresTraficoCruzado, boolean asistentePermanenciaCaril) {
        super(marca, nuevo, modelo, trasmision, velocidadMaxima, cilindraje, numeroCambios, combustible,
                autonomiaCargaCompleta, tiempoCargaPromedio, esEnchufable, esHibridoLigero);
        this.numeroPasajero = numeroPasajero;
        this.numeroPuerta = numeroPuerta;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReserva = camaraReserva;
        this.velocidadCrucero = velocidadCrucero;
        this.numeroBolsasAire = numeroBolsasAire;
        this.suspencionAdaptiva = suspencionAdaptiva;
        this.sensoresColision = sensoresColision;
        this.sensoresTraficoCruzado = sensoresTraficoCruzado;
        this.asistentePermanenciaCaril = asistentePermanenciaCaril;
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

    public boolean isSuspencionAdaptiva() {
        return suspencionAdaptiva;
    }

    public void setSuspencionAdaptiva(boolean suspencionAdaptiva) {
        this.suspencionAdaptiva = suspencionAdaptiva;
    }

    public boolean isSensoresColision() {
        return sensoresColision;
    }

    public void setSensoresColision(boolean sensoresColision) {
        this.sensoresColision = sensoresColision;
    }

    public boolean isSensoresTraficoCruzado() {
        return sensoresTraficoCruzado;
    }

    public void setSensoresTraficoCruzado(boolean sensoresTraficoCruzado) {
        this.sensoresTraficoCruzado = sensoresTraficoCruzado;
    }

    public boolean isAsistentePermanenciaCaril() {
        return asistentePermanenciaCaril;
    }

    public void setAsistentePermanenciaCaril(boolean asistentePermanenciaCaril) {
        this.asistentePermanenciaCaril = asistentePermanenciaCaril;
    }

    
}
