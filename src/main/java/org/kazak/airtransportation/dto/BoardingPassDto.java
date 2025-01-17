package org.kazak.airtransportation.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BoardingPassDto {
    private String ticket_no;
    private int flight_id;
    private int boarding_no;
    private String seat_no;
}
