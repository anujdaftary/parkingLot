package com.scaler.parkinglot.controllers;

import com.scaler.parkinglot.dto.GenerateTicketRequestDto;
import com.scaler.parkinglot.dto.GenerateTicketResponseDto;
import com.scaler.parkinglot.exceptions.InvalidGateException;
import com.scaler.parkinglot.models.Gate;
import com.scaler.parkinglot.models.GenerateTicketResponseStatus;
import com.scaler.parkinglot.models.Ticket;
import com.scaler.parkinglot.models.Vehicle;
import com.scaler.parkinglot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto requestDto) {
        /*
        Steps :-
        Input - vehicle number, gate Id.

        1. Get the vehicle details using the vehicleNumber.
                - If the vehicle is there in the DB then return the object.
                - If not (Vehicle is coming for the first time), then create the Vehicle Object
                and store to DB.
        2. Get the gate details using the gate Id.


        -> Controllers should be as light as possible.
        The logic of Ticket generation should go in the TicketService.

         */
        Ticket ticket = null;
        try {
            ticket = ticketService.generateTicket(requestDto.getVehicleNumber(), requestDto.getVehicleType(),
                    requestDto.getGateId());
        } catch (InvalidGateException e) {
            throw new RuntimeException(e);
        }

        GenerateTicketResponseDto responseDto = new GenerateTicketResponseDto();
        responseDto.setTicket(ticket);
        responseDto.setStatus(GenerateTicketResponseStatus.SUCCESS);

        return responseDto;
    }

//    public UpdateTicketResponseDto updateTicket(UpdateTicketRequestDto dto) {
//
//    }
}


/*

DTO - Data Transfer Objects.

 */
