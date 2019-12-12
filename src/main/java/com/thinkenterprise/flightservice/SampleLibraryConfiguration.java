package com.thinkenterprise.flightservice;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = SampleLibraryConfiguration.class)
public class SampleLibraryConfiguration {

	
	  private static final Logger logger = LoggerFactory.getLogger(SampleLibraryConfiguration.class);

	  @PostConstruct
	  public void postConstruct(){
	    logger.info("Spring Boot Sample Library Loaded!");
	  }
}

