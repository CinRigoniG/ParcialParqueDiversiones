package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reporte {
    private int id;
    private String detalles;
    private Date fechaEmision;
    private List<Incidente> incidentes = new ArrayList<>();

    public Reporte() {
    }

    public Reporte(int id, String detalles, Date fechaEmision) {
        this.id = id;
        this.detalles = detalles;
        this.fechaEmision = fechaEmision;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public List<Incidente> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(List<Incidente> incidentes) {
        this.incidentes = incidentes;
    }

    @Override
    public String toString() {
        return "Reporte{" +
                "id=" + id +
                ", detalles='" + detalles + '\'' +
                ", fechaEmision=" + fechaEmision +
                ", incidentes=" + incidentes +
                '}';
    }
}
