package org.kazak.airtransportation.controller;

import org.kazak.airtransportation.dto.Airporst;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AirTransController implements AirTransControllerDocumentation {
    @Override
    public List<Airporst> getAllAirports() {
        return List.of();
    }
}
