package Entities;

import java.util.Date;

public class Mantenimiento {
    private Date fecha;
    private String observaciones;

    public Mantenimiento() {
    }

    public Mantenimiento(Date fecha, String observaciones) {
        this.fecha = fecha;
        this.observaciones = observaciones;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Mantenimiento{" +
                "fecha=" + fecha +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}
