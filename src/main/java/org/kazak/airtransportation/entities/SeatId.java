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
public class SeatId implements java.io.Serializable {
    private static final long serialVersionUID = -6241448498458257602L;
    @Size(max = 3)
    @NotNull
    @Column(name = "aircraft_code", nullable = false, length = 3)
    private String aircraftCode;

    @Size(max = 4)
    @NotNull
    @Column(name = "seat_no", nullable = false, length = 4)
    private String seatNo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SeatId entity = (SeatId) o;
        return Objects.equals(this.aircraftCode, entity.aircraftCode) &&
                Objects.equals(this.seatNo, entity.seatNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aircraftCode, seatNo);
    }

}