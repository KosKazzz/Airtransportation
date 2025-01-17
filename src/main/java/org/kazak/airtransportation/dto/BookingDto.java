package org.kazak.airtransportation.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class BookingDto {
    private String book_ref;
    private String book_date; // timestamp with time zone in db
    private BigDecimal total_amount; // numeric(10,2) in db
}
