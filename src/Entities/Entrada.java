package Entities;

import java.time.LocalTime;
import java.util.Date;

public class Entrada {
    private Date fecha;
    private LocalTime hora;

    public Entrada(Date fecha, LocalTime hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
