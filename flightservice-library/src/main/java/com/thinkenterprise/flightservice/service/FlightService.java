package com.thinkenterprise.flightservice.service;

import java.util.List;

import com.thinkenterprise.flightservice.model.FlightPrice;

public interface FlightService {

	public double totalPrice(List<FlightPrice> flightPrices);
}
