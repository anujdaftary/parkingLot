package com.scaler.parkinglot.strategies.feesCalculationStrategy;

import com.scaler.parkinglot.models.Ticket;

public interface FeeCalculationStrategy {
    double calculateFee(Ticket ticket);
}
