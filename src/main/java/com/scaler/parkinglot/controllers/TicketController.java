package com.scaler.parkinglot.controllers;

import com.scaler.parkinglot.dto.GenerateTicketRequestDto;
import com.scaler.parkinglot.dto.GenerateTicketResponseDto;
import com.scaler.parkinglot.models.Gate;
import com.scaler.parkinglot.models.Ticket;
import com.scaler.parkinglot.models.Vehicle;

public class TicketController {
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
        return null;
    }

//    public UpdateTicketResponseDto updateTicket(UpdateTicketRequestDto dto) {
//
//    }
}


/*

DTO - Data Transfer Objects.

 */
