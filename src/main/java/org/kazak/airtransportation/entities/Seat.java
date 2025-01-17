package org.kazak.airtransportation.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "seats")
public class Seat {
    @EmbeddedId
    private SeatId id;

    @MapsId("aircraftCode")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "aircraft_code", nullable = false)
    private AircraftsDatum aircraftCode;

    @Size(max = 10)
    @NotNull
    @Column(name = "fare_conditions", nullable = false, length = 10)
    private String fareConditions;

}