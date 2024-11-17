package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class RevisionTecnica {
    private LocalDate fechaRevision;
    private int numeroRevision;
    private LocalDate fechaCaduca;
    private String codigo;
    private boolean aprobado;

    public RevisionTecnica(LocalDate fechaRevision, int numeroRevision, LocalDate fechaCaduca, String codigo,
            boolean aprobado) {
        this.fechaRevision = fechaRevision;
        this.numeroRevision = numeroRevision;
        this.fechaCaduca = fechaCaduca;
        this.codigo = codigo;
        this.aprobado = aprobado;
    }

    public LocalDate getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(LocalDate fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    public int getNumeroRevision() {
        return numeroRevision;
    }

    public void setNumeroRevision(int numeroRevision) {
        this.numeroRevision = numeroRevision;
    }

    public LocalDate getFechaCaduca() {
        return fechaCaduca;
    }

    public void setFechaCaduca(LocalDate fechaCaduca) {
        this.fechaCaduca = fechaCaduca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    
    
}
