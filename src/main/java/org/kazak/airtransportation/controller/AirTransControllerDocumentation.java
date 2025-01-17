package org.kazak.airtransportation.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.kazak.airtransportation.dto.AirportDto;
import org.kazak.airtransportation.dto.AircraftDto;
import org.kazak.airtransportation.dto.BoardingPassDto;
import org.kazak.airtransportation.dto.BookingDto;
import org.kazak.airtransportation.dto.FlightDto;
import org.kazak.airtransportation.dto.SeatDto;
import org.kazak.airtransportation.dto.TicketFlightDto;
import org.kazak.airtransportation.dto.TicketDto;

import java.util.List;

@Tag(name = "Air Transportation Controller", description = "Контроллер - проба пера!")
public interface AirTransControllerDocumentation {

    @Operation(summary = "Get all aircrafts")
    @ApiResponse()
    List<AircraftDto> getAllAircrafts();

    @Operation(summary = "Get all airports")
    @ApiResponse()
    List<AirportDto> getAllAirports();

    @Operation(summary = "Get all boarding passes")
    @ApiResponse()
    List<BoardingPassDto> getAllBoardingPasses();

    @Operation(summary = "Get all bookings")
    @ApiResponse()
    List<BookingDto> getAllBookings();

    @Operation(summary = "Get all flights")
    @ApiResponse()
    List<FlightDto> getAllFlights();

    @Operation(summary = "Get all seats")
    @ApiResponse()
    List<SeatDto> getAllSeats();

    @Operation(summary = "Get all tiket flights")
    @ApiResponse()
    List<TicketFlightDto> getAllTicketFlights();

    @Operation(summary = "Get all tickets")
    @ApiResponse()
    List<TicketDto> getAllTickets();

}
