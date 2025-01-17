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
@Table(name = "aircrafts")
public class Aircraft {
    @Size(max = 3)
    @Column(name = "aircraft_code", length = 3)
    private String aircraftCode;

    @Column(name = "model", length = Integer.MAX_VALUE)
    private String model;

    @Column(name = "range")
    private Integer range;

}