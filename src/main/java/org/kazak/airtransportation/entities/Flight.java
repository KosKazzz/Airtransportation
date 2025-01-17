package org.kazak.airtransportation.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @ColumnDefault("nextval('flights_flight_id_seq')")
    @Column(name = "flight_id", nullable = false)
    private Integer id;

    @Size(max = 6)
    @NotNull
    @Column(name = "flight_no", nullable = false, length = 6)
    private String flightNo;

    @NotNull
    @Column(name = "scheduled_departure", nullable = false)
    private OffsetDateTime scheduledDeparture;

    @NotNull
    @Column(name = "scheduled_arrival", nullable = false)
    private OffsetDateTime scheduledArrival;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "departure_airport", nullable = false)
    private AirportsDatum departureAirport;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "arrival_airport", nullable = false)
    private AirportsDatum arrivalAirport;

    @Size(max = 20)
    @NotNull
    @Column(name = "status", nullable = false, length = 20)
    private String status;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "aircraft_code", nullable = false)
    private AircraftsDatum aircraftCode;

    @Column(name = "actual_departure")
    private OffsetDateTime actualDeparture;

    @Column(name = "actual_arrival")
    private OffsetDateTime actualArrival;

}