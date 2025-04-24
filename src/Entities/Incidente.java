package Entities;

import Enums.EstadoIncidente;

import java.util.Date;

public class Incidente {
    private Date fecha;
    private String descripcion;
    private EstadoIncidente estado;
    private Atraccion atraccion;
    private Visitante visitante;

    public Incidente(Date fecha, String descripcion, EstadoIncidente estado) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public String toString(){
        return("Atraccion: "+atraccion
                +"\nFecha: "+fecha
                +"\nDescripcion: "+descripcion
                +"\nEstado: "+estado);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public EstadoIncidente getEstado() {
        return estado;
    }

    public void setEstado(EstadoIncidente estado) {
        this.estado = estado;
    }

    public Atraccion getAtraccion() {
        return atraccion;
    }

    public void setAtraccion(Atraccion atraccion) {
        this.atraccion = atraccion;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }
}
