package com.thinkenterprise.flightservice.service;

import java.util.List;

import com.thinkenterprise.flightservice.model.FlightPrice;

public class FlightServiceImpl implements FlightService {

	@Override
	public double totalPrice(List<FlightPrice> flightPrices) {
		double totalPrice = 0.0;
		for(FlightPrice flightPrice: flightPrices) {
			totalPrice = totalPrice + flightPrice.getPrice();
		}
		
		return totalPrice;	
	}

}
