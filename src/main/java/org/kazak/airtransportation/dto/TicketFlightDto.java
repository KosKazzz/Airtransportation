package org.kazak.airtransportation.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class TicketFlightDto {
    private String ticket_no;
    private int flight_id;
    private String fare_conditions;
    private BigDecimal amount;
}
