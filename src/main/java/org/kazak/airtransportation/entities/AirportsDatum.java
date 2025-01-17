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
@Table(name = "airports_data")
public class AirportsDatum {
    @Id
    @Size(max = 3)
    @Column(name = "airport_code", nullable = false, length = 3)
    private String airportCode;

    @NotNull
    @Column(name = "airport_name", nullable = false)
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> airportName;

    @NotNull
    @Column(name = "city", nullable = false)
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> city;

    @NotNull
    @Column(name = "timezone", nullable = false, length = Integer.MAX_VALUE)
    private String timezone;

/*
 TODO [Reverse Engineering] create field to map the 'coordinates' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "coordinates", columnDefinition = "point not null")
    private Object coordinates;
*/
}