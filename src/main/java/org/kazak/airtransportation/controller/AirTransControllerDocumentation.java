package org.kazak.airtransportation.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.kazak.airtransportation.dto.Airporst;

import java.util.List;

@Tag(name = "Air Transportation Controller", description = "Контроллер - проба пера!")
public interface AirTransControllerDocumentation {

    @Operation(summary = "Get all airports")
    @ApiResponse()
    List<Airporst> getAllAirports();

}
