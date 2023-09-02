package com.scaler.parkinglot.services;

import com.scaler.parkinglot.exceptions.InvalidGateException;
import com.scaler.parkinglot.models.Gate;
import com.scaler.parkinglot.models.Ticket;
import com.scaler.parkinglot.models.Vehicle;
import com.scaler.parkinglot.models.VehicleType;

import java.util.Date;

public class TicketService {
    private VehicleService vehicleService;
    private GateService gateService;

    public TicketService(VehicleService vehicleServic, GateService gateService) {
        this.vehicleService = vehicleService;
        this.gateService = gateService;
    }

    public Ticket generateTicket(String vehicleNumber,
                                 VehicleType vehicleType, Long gateId) throws InvalidGateException {
        //Logic
        //Check if the Vehicle is already there in the DB
        // - getVehicleByVehicleNumber(String)
        //If vehicle isn't there in the Db then create the vehicle and store in the DB.

        //Way-1 : Directly call the Vehicle Repository.
        //Way-2 : Call the VehicleService and vehicleService will internally call the repository.

        Vehicle vehicle = vehicleService.getVehicle(vehicleNumber);

        if (vehicle == null) {
            vehicle = vehicleService.registerVehicle(vehicleNumber, vehicleType);
        }

        Gate gate = gateService.getGate(gateId);

        if (gate == null) {
            //Throw an exception
            throw new InvalidGateException("The gate details are not correct!");
        }

        Ticket ticket = new Ticket();

        ticket.setGate(gate);
        ticket.setVehicle(vehicle);
        ticket.setEntryTime(new Date());
        ticket.setOperator(gate.getOperator());

        //Assign the Parking Spot.


        return null;
    }
}
