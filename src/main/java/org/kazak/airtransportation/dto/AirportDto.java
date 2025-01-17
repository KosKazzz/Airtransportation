package org.kazak.airtransportation.dto;

import lombok.Builder;
import lombok.Data;
import org.postgresql.geometric.PGpoint;

@Data
@Builder
public class AirportDto {
    private String airport_code;
    private String airport_name; //jsonb in db
    private String city; //jsonb in db
    private PGpoint coordinates;
    private String timezone;
}
