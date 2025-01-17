package org.kazak.airtransportation.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AircraftDto {
    private String aircraft_code;
    private String model; //jsonb in db
    private int range;
}
