package Entities;

import java.util.Date;

public class TicketGeneral  extends Ticket {

    public TicketGeneral() {
    }

    public TicketGeneral(String codigo, double precio, Date fechaEmision) {
        super(codigo, precio, fechaEmision);
    }

    @Override
    public String toString() {
        return "TicketVIP{" +
                "codigo='" + getCodigo() + '\'' +
                ", precio='" + getPrecio() + '\'' +
                ", fechaEmision='" + getFechaEmision() + '\'' +
                '}';
    }
}
