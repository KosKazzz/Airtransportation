package org.kazak.airtransportation.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.util.List;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "routes")
public class Route {
    @Size(max = 6)
    @Column(name = "flight_no", length = 6)
    private String flightNo;

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

    @Size(max = 3)
    @Column(name = "aircraft_code", length = 3)
    private String aircraftCode;

    @Column(name = "days_of_week")
    private List<Integer> daysOfWeek;

/*
 TODO [Reverse Engineering] create field to map the 'duration' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "duration", columnDefinition = "interval")
    private Object duration;
*/
}