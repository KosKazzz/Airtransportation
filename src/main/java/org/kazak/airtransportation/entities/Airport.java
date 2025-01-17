package org.kazak.airtransportation.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "airports")
public class Airport {
    @Size(max = 3)
    @Column(name = "airport_code", length = 3)
    private String airportCode;

    @Column(name = "airport_name", length = Integer.MAX_VALUE)
    private String airportName;

    @Column(name = "city", length = Integer.MAX_VALUE)
    private String city;

    @Column(name = "timezone", length = Integer.MAX_VALUE)
    private String timezone;

/*
 TODO [Reverse Engineering] create field to map the 'coordinates' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "coordinates", columnDefinition = "point")
    private Object coordinates;
*/
}