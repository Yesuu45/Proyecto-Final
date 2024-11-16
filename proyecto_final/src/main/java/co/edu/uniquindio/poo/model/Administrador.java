package co.edu.uniquindio.poo.model;

public class Administrador extends Persona {
    private int añosAtiguedad;

    public Administrador(String nombre, String id, int añosAtiguedad) {
        super(nombre, id);
        this.añosAtiguedad = añosAtiguedad;
    }

    public int getAñosAtiguedad() {
        return añosAtiguedad;
    }

    public void setAñosAtiguedad(int añosAtiguedad) {
        this.añosAtiguedad = añosAtiguedad;
    }

    
    
}
