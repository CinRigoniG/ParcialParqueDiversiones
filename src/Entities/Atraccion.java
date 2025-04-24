package Entities;

import Enums.TipoAtraccion;

import java.util.List;

public class Atraccion {
    private String nombre;
    private int capacidad;
    private int tiempoDuracion;
    private TipoAtraccion tipoAtraccion;
    private int visitantesEnCola;
    private List<Horario> horariosDisponibles;
    private List<AtraccionTecnico> tecnicosAtraccion;
    private List<Mantenimiento> mantenimientos;

    public Atraccion(int capacidad, int tiempoDuracion, TipoAtraccion tipoAtraccion, int visitantesEnCola) {
        this.capacidad = capacidad;
        this.tiempoDuracion = tiempoDuracion;
        this.tipoAtraccion = tipoAtraccion;
        this.visitantesEnCola = visitantesEnCola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getTiempoDuracion() {
        return tiempoDuracion;
    }

    public void setTiempoDuracion(int tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
    }

    public TipoAtraccion getTipoAtraccion() {
        return tipoAtraccion;
    }

    public void setTipoAtraccion(TipoAtraccion tipoAtraccion) {
        this.tipoAtraccion = tipoAtraccion;
    }

    public int getVisitantesEnCola() {
        return visitantesEnCola;
    }

    public void setVisitantesEnCola(int visitantesEnCola) {
        this.visitantesEnCola = visitantesEnCola;
    }

    public List<Horario> getHorariosDisponibles() {
        return horariosDisponibles;
    }

    public void setHorariosDisponibles(List<Horario> horariosDisponibles) {
        this.horariosDisponibles = horariosDisponibles;
    }

    public List<AtraccionTecnico> getTecnicosAtraccion() {
        return tecnicosAtraccion;
    }

    public void setTecnicosAtraccion(List<AtraccionTecnico> tecnicosAtraccion) {
        this.tecnicosAtraccion = tecnicosAtraccion;
    }

    public List<Mantenimiento> getMantenimientos() {
        return mantenimientos;
    }

    public void setMantenimientos(List<Mantenimiento> mantenimientos) {
        this.mantenimientos = mantenimientos;
    }

    public int calcularTiempoDeEspera() {
        return tiempoDuracion * visitantesEnCola;
    }

}
