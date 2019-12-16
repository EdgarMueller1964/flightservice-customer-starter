package com.thinkenterprise.flightservice.autoconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.thinkenterprise.flightservice.service.FlightService;
import com.thinkenterprise.flightservice.service.FlightServiceImpl;

@Configuration
@ConditionalOnClass(FlightService.class)
public class FlightServiceAutoConfiguration {


	@Autowired
	FlightServiceConfigurationProperties fsProperties;
	
	
	
	@Bean
	public FlightServiceConfigurationProperties fsProperties() {
		return new FlightServiceConfigurationProperties();
	}
	
	
    //conditional bean creation
    @Bean
    @ConditionalOnMissingBean
    public FlightService flightService(){

        FlightService fs = new FlightServiceImpl();
        fs.setTaxRate(fsProperties.getTaxRate());
        return fs;
    }
    
}
