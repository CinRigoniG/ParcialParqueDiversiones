package Entities;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoSeguridad {
    private int id;
    private String nombre;
    private List<String> especialidades = new ArrayList<>();
    private List<Incidente> incidentes = new ArrayList<>();

    public EmpleadoSeguridad() {
    }

    public EmpleadoSeguridad(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public EmpleadoSeguridad(int id, String nombre, List<String> especialidades) {
        this.id = id;
        this.nombre = nombre;
        this.especialidades = especialidades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<String> especialidades) {
        this.especialidades = especialidades;
    }

    public List<Incidente> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(List<Incidente> incidentes) {
        this.incidentes = incidentes;
    }

    @Override
    public String toString() {
        return "EmpleadoSeguridad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", especialidades=" + especialidades +
                ", incidentes=" + incidentes +
                '}';
    }

    public void agregarEspecialidad(String especialidad) {
        if (!especialidades.contains(especialidad)) {
            especialidades.add(especialidad);
        }
    }

    public void mostrarIncidentesReportados(){
        for (Incidente incidente : incidentes) {
            System.out.println(incidente);
        }
    }
}
