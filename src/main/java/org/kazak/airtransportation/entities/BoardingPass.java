package org.kazak.airtransportation.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "boarding_passes")
public class BoardingPass {
    @EmbeddedId
    private BoardingPassId id;

    @MapsId("id")
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private TicketFlight ticketFlights;

    @NotNull
    @Column(name = "boarding_no", nullable = false)
    private Integer boardingNo;

    @Size(max = 4)
    @NotNull
    @Column(name = "seat_no", nullable = false, length = 4)
    private String seatNo;

}