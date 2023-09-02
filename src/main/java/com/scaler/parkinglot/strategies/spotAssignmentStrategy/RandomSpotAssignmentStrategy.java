package com.scaler.parkinglot.strategies.spotAssignmentStrategy;

import com.scaler.parkinglot.models.*;
import com.scaler.parkinglot.services.ParkingLotService;
import com.scaler.parkinglot.services.ParkingSpotService;

import java.util.List;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy {
    private ParkingLotService parkingLotService;

    public RandomSpotAssignmentStrategy(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }
    @Override
    public ParkingSpot assignParkingSpot(VehicleType vehicleType, Gate gate) {

        ParkingLot parkingLot = parkingLotService.getParkingLot(gate.getId());

        List<ParkingSpot> parkingSpots = parkingLotService.getParkingSpots(parkingLot.getId());

        for (ParkingSpot parkingSpot : parkingSpots) {
            if (parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE) &&
            parkingSpot.getSupportedVehicleTypes().contains(vehicleType)) {
                return parkingSpot;
            }
        }

        return null;
    }
}
