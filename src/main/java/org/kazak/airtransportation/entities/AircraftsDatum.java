package org.kazak.airtransportation.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Map;

@Getter
@Setter
@Entity
@Table(name = "aircrafts_data")
public class AircraftsDatum {
    @Id
    @Size(max = 3)
    @Column(name = "aircraft_code", nullable = false, length = 3)
    private String aircraftCode;

    @NotNull
    @Column(name = "model", nullable = false)
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> model;

    @NotNull
    @Column(name = "range", nullable = false)
    private Integer range;

}