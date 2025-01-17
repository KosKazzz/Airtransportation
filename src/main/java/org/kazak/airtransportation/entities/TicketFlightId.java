package org.kazak.airtransportation.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class TicketFlightId implements java.io.Serializable {
    private static final long serialVersionUID = 5816911000606552106L;
    @Size(max = 13)
    @NotNull
    @Column(name = "ticket_no", nullable = false, length = 13)
    private String ticketNo;

    @NotNull
    @Column(name = "flight_id", nullable = false)
    private Integer flightId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TicketFlightId entity = (TicketFlightId) o;
        return Objects.equals(this.ticketNo, entity.ticketNo) &&
                Objects.equals(this.flightId, entity.flightId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketNo, flightId);
    }

}