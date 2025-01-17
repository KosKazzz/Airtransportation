package org.kazak.airtransportation.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.time.Instant;
import java.time.OffsetDateTime;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "flights_v")
public class FlightsV {
    @Column(name = "flight_id")
    private Integer flightId;

    @Size(max = 6)
    @Column(name = "flight_no", length = 6)
    private String flightNo;

    @Column(name = "scheduled_departure")
    private OffsetDateTime scheduledDeparture;

    @Column(name = "scheduled_departure_local")
    private Instant scheduledDepartureLocal;

    @Column(name = "scheduled_arrival")
    private OffsetDateTime scheduledArrival;

    @Column(name = "scheduled_arrival_local")
    private Instant scheduledArrivalLocal;

    @Size(max = 3)
    @Column(name = "departure_airport", length = 3)
    private String departureAirport;

    @Column(name = "departure_airport_name", length = Integer.MAX_VALUE)
    private String departureAirportName;

    @Column(name = "departure_city", length = Integer.MAX_VALUE)
    private String departureCity;

    @Size(max = 3)
    @Column(name = "arrival_airport", length = 3)
    private String arrivalAirport;

    @Column(name = "arrival_airport_name", length = Integer.MAX_VALUE)
    private String arrivalAirportName;

    @Column(name = "arrival_city", length = Integer.MAX_VALUE)
    private String arrivalCity;

    @Size(max = 20)
    @Column(name = "status", length = 20)
    private String status;

    @Size(max = 3)
    @Column(name = "aircraft_code", length = 3)
    private String aircraftCode;

    @Column(name = "actual_departure")
    private OffsetDateTime actualDeparture;

    @Column(name = "actual_departure_local")
    private Instant actualDepartureLocal;

    @Column(name = "actual_arrival")
    private OffsetDateTime actualArrival;
    @Column(name = "actual_arrival_local")
    private Instant actualArrivalLocal;

/*
 TODO [Reverse Engineering] create field to map the 'scheduled_duration' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "scheduled_duration", columnDefinition = "interval")
    private Object scheduledDuration;
*/
/*
 TODO [Reverse Engineering] create field to map the 'actual_duration' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "actual_duration", columnDefinition = "interval")
    private Object actualDuration;
*/
}