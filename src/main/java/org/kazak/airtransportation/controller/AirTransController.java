package org.kazak.airtransportation.controller;

import org.kazak.airtransportation.dto.AircraftDto;
import org.kazak.airtransportation.dto.AirportDto;
import org.kazak.airtransportation.dto.BoardingPassDto;
import org.kazak.airtransportation.dto.BookingDto;
import org.kazak.airtransportation.dto.FlightDto;
import org.kazak.airtransportation.dto.SeatDto;
import org.kazak.airtransportation.dto.TicketDto;
import org.kazak.airtransportation.dto.TicketFlightDto;
import org.kazak.airtransportation.facade.AirTransFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bookings")
public class AirTransController implements AirTransControllerDocumentation {


    private final AirTransFacade airTransFacade;

    private AirTransController(AirTransFacade airTransFacade) {
        this.airTransFacade = airTransFacade;
    }

    @GetMapping("/Aricrafts")
    @Override
    public List<AircraftDto> getAllAircrafts() {
        return airTransFacade.findAllAircrafts();
    }

    @Override
    public List<AirportDto> getAllAirports() {
        return List.of();
    }

    @Override
    public List<BoardingPassDto> getAllBoardingPasses() {
        return List.of();
    }

    @Override
    public List<BookingDto> getAllBookings() {
        return List.of();
    }

    @Override
    public List<FlightDto> getAllFlights() {
        return List.of();
    }

    @Override
    public List<SeatDto> getAllSeats() {
        return List.of();
    }

    @Override
    public List<TicketFlightDto> getAllTicketFlights() {
        return List.of();
    }

    @Override
    public List<TicketDto> getAllTickets() {
        return List.of();
    }
}
