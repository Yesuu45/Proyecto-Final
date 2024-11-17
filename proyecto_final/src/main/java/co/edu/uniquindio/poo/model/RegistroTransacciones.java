package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.LinkedList;

public class RegistroTransacciones {
    private LocalDate fecha;
    private LinkedList<Transaccion> transacciones;

        public RegistroTransacciones(LocalDate fecha) {
        this.fecha = fecha;
        transacciones = new LinkedList<>();

    }

    /*
     * Metodos principales
     */

    public void registrarTransaccion(Transaccion transaccion){
        if(verificarTransaccion(transaccion)){
            System.out.println("No se puede registrar la transaccion");

        } else{
            transacciones.add(transaccion);
            System.out.println("La transacción fue registrada de forma exitosa");
        }

    }

    public boolean verificarTransaccion(Transaccion transaccion ){
        boolean sentinela = false;
        for (Transaccion transaccionIterar : transacciones) {
            if(transaccionIterar.getCodigo().equals(transaccion.getCodigo())){
                sentinela = true;
                break;
            }
            
        } return sentinela;

    }

    /*
     * Metodos Get  y Set
     */

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    
}
