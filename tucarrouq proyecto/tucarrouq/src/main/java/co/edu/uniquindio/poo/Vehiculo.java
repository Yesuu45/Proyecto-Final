package co.edu.uniquindio.poo;

public abstract class Vehiculo {
    private String marca;
    private String uso;
    private String modelo;
    private String cambios;
    private String velocidadMaxima;
    private String cilindraje;

    public Vehiculo(String marca, String uso, String modelo, String cambios, String velocidadMaxima, String cilindraje) {
        this.marca = marca;
        this.uso = uso;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }

    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(String velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public boolean pasoRevisionTecnica() {
        return true; // Aquí se podría agregar lógica adicional para verificar la revisión técnica.
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", uso=" + uso + ", modelo=" + modelo + ", cambios=" + cambios
                + ", velocidadMaxima=" + velocidadMaxima + ", cilindraje=" + cilindraje + "]";
    }
}
