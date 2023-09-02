package com.scaler.parkinglot.strategies.feesCalculationStrategy;

import com.scaler.parkinglot.models.Ticket;

public class HourBasedFeeCalculationStrategy implements FeeCalculationStrategy {

    @Override
    public double calculateFee(Ticket ticket) {
        long currentTime = System.currentTimeMillis();
        long entryTime = ticket.getEntryTime().getTime();

        long duration = (currentTime - entryTime)/(1000*60*60);
        return 50 * duration;
    }
}
