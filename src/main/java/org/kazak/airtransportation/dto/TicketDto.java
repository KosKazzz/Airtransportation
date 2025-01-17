package org.kazak.airtransportation.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TicketDto {
    private String ticket_no;
    private String book_ref;
    private String passenger_id;
    private String passenger_name;
    private String contact_data; // jsonb in db
}
