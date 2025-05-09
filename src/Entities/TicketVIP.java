package Entities;

import java.util.Date;

public class TicketVIP extends Ticket {
    private String beneficios;

    public TicketVIP() {
    }

    public TicketVIP(String codigo, double precio, Date fechaEmision, String beneficios) {
        super(codigo, precio, fechaEmision);
        this.beneficios = beneficios;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public String toString() {
        return "TicketVIP{" +
                "codigo='" + getCodigo() + '\'' +
                ", precio='" + getPrecio() + '\'' +
                ", fechaEmision='" + getFechaEmision() + '\'' +
                ", beneficios='" + beneficios + '\'' +
                '}';
    }
}
