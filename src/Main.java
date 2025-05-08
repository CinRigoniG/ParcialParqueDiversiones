import Entities.*;
import Enums.EstadoIncidente;
import Enums.TipoAtraccion;

import java.time.LocalTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Visitante visitante = new Visitante("Cinthia", "36613333", 32);

        visitante.agregarEntrada(new Date(2025,04,25), LocalTime.of(20,30));
        visitante.agregarEntrada(new Date(2025,04,25), LocalTime.of(20,00));

        TicketGeneral ticketGeneral = new TicketGeneral("01", 5500.00, new Date(2025,04,25));

        visitante.setTicket(ticketGeneral);

        Atraccion at1 = new Atraccion("Atraccion 1", 50, 30, TipoAtraccion.ACUATICA, 30);
        Atraccion at2 = new Atraccion("Atraccion 2", 150, 10, TipoAtraccion.MECANICA, 15);
        Atraccion at3 = new Atraccion("Atraccion 3", 100, 25, TipoAtraccion.INFANTIL, 3);

        Horario hr = new Horario("Lunes", "16:00", "21:00");
        Horario hr2 = new Horario("Martes", "18:00", "20:00");
        Horario hr3 = new Horario("Viernes", "16:00", "21:00");
        Horario hr4 = new Horario("Jueves", "17:00", "19:00");

        at1.getHorariosDisponibles().add(hr);
        at1.getHorariosDisponibles().add(hr2);
        at2.getHorariosDisponibles().add(hr3);
        at2.getHorariosDisponibles().add(hr4);
        at3.getHorariosDisponibles().add(hr3);
        at3.getHorariosDisponibles().add(hr);

        EmpleadoSeguridad emp = new EmpleadoSeguridad(1, "Pablo");

        emp.agregarEspecialidad("Mecánico");
        emp.agregarEspecialidad("Guardia se seguridad");

        Incidente inc1 = new Incidente(new Date(2025,04,01), "Incidente 1", EstadoIncidente.EN_INVESTIGACION);

        inc1.setAtraccion(at1);
        inc1.setVisitante(visitante);

        emp.getIncidentes().add(inc1);

        Incidente inc2 = new Incidente(new Date(2025,03,21), "Incidente 2", EstadoIncidente.RESUELTO);

        inc2.setAtraccion(at3);
        inc2.setVisitante(visitante);

        emp.getIncidentes().add(inc2);

        Reporte reporte = new Reporte(3, "Detalles reporte.", new Date(2025,04,30));

        reporte.getIncidentes().add(inc1);
        reporte.getIncidentes().add(inc2);

        Mantenimiento mant = new Mantenimiento(new Date(2025, 06,01), "Mantenimiento atracción 1.");

        at1.getMantenimientos().add(mant);

        AtraccionTecnico tecnico = new AtraccionTecnico("Carlos", "Técnico electricista");

        at1.getTecnicosAtraccion().add(tecnico);

    }
}