package com.thinkenterprise.flightservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.thinkenterprise.flightservice.configuration.FlightServiceConfigurationProperties;
import com.thinkenterprise.flightservice.model.FlightPrice;

public class FlightServiceImpl implements FlightService {

	@Autowired
	FlightServiceConfigurationProperties fsProperties;
	
	@Override
	public double totalPrice(List<FlightPrice> flightPrices) {
		double totalPrice = 0.0;
		for(FlightPrice flightPrice: flightPrices) {
			totalPrice = totalPrice + flightPrice.getPrice();
		}
		
		double taxRate = 1.0;
		if (fsProperties.getTaxRate() != 0.0f)
			taxRate = fsProperties.getTaxRate();
		
		return totalPrice * taxRate;	
	}

}
