package org.kazak.airtransportation.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FlightDto {
    private int flight_Id;
    private String flight_no;
    private String scheduled_departure; // timestamp with time zone in db
    private String scheduled_arrival; // timestamp with time zone in db
    private String departure_airport;
    private String arrival_airport;
    private String status;
    private String aircraft_code;
    private String actual_departure; // timestamp with time zone in db
    private String actual_arrival; // timestamp with time zone in db
}
