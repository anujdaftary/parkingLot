package com.scaler.parkinglot.strategies.feesCalculationStrategy;

import com.scaler.parkinglot.models.Ticket;

public class IncrementalFeeCalculationStrategy implements FeeCalculationStrategy {

    @Override
    public double calculateFee(Ticket ticket) {
        return 0;
    }
}
