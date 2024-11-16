package co.edu.uniquindio.poo;

public class Moto extends Vehiculo {
    private String tipoMotor;
    private boolean tieneMaletero;
    private int peso;

    public Moto(String tipoMotor, boolean tieneMaletero, int peso, String marca, String uso, String modelo,
                       String cambios, String velocidadMaxima, String cilindraje) {
        super(marca, uso, modelo, cambios, velocidadMaxima, cilindraje);
        this.tipoMotor = tipoMotor;
        this.tieneMaletero = tieneMaletero;
        this.peso = peso;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public boolean isTieneMaletero() {
        return tieneMaletero;
    }

    public void setTieneMaletero(boolean tieneMaletero) {
        this.tieneMaletero = tieneMaletero;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Motocicleta [Tipo Motor: " + tipoMotor + ", Tiene Maletero: " + tieneMaletero + ", Peso: " + peso + "] " 
                + super.toString();
    }
}
