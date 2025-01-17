package org.kazak.airtransportation.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SeatDto {
    private String aircraft_code;
    private String seat_no;
    private String fare_conditions;
}
