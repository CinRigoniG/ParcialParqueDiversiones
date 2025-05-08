package Entities;

import java.util.ArrayList;
import java.util.List;

public class Parque {
    private String nombre;
    private String direccion;
    private String horarioApertura;
    private String horaCierre;
    private List<Atraccion> atracciones = new ArrayList<>();

    public Parque() {
    }

    public Parque(String nombre, String direccion, String horarioApertura, String horaCierre) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horarioApertura = horarioApertura;
        this.horaCierre = horaCierre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    public List<Atraccion> getAtracciones() {
        return atracciones;
    }

    public void setAtracciones(List<Atraccion> atracciones) {
        this.atracciones = atracciones;
    }

    @Override
    public String toString() {
        return "Parque{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", horarioApertura='" + horarioApertura + '\'' +
                ", horaCierre='" + horaCierre + '\'' +
                ", atracciones=" + atracciones +
                '}';
    }

    public Atraccion obtenerAtraccionMasVisitada() {
        if (atracciones == null || atracciones.isEmpty()) {
            return null;
        }

        Atraccion masVisitada = atracciones.get(0);

        for (Atraccion atraccion : atracciones) {
            if (atraccion.getVisitantesEnCola() > masVisitada.getVisitantesEnCola()) {
                masVisitada = atraccion;
            }
        }

        return masVisitada;
    }

}
