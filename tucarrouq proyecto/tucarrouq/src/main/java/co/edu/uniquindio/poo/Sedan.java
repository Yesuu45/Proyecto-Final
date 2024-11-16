package co.edu.uniquindio.poo;

public class Sedan extends Vehiculo {
    private int capacidadPasajeros;
    private int numeroPuertas;
    private boolean tieneAireAcondicionado;

    public Sedan(int capacidadPasajeros, int numeroPuertas, boolean tieneAireAcondicionado, String marca, String uso,
                 String modelo, String cambios, String velocidadMaxima, String cilindraje) {
        super(marca, uso, modelo, cambios, velocidadMaxima, cilindraje);
        this.capacidadPasajeros = capacidadPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    @Override
    public String toString() {
        return "Sedan [Capacidad Pasajeros: " + capacidadPasajeros + ", Número de Puertas: " + numeroPuertas
                + ", Aire Acondicionado: " + tieneAireAcondicionado + "] " + super.toString();
    }
}
