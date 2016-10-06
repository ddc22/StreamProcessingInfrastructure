package com.jdc.experiments.HighAvailabilityReceiver.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sensor/{sensorId}")
public class IncidentSensorController implements SensorStateController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getSensorState(@PathVariable String sensorId){
		return sensorId;
	}
	
	
	@RequestMapping(value = "/{sensorState}",method = RequestMethod.PUT)
	public ResponseEntity<?> sensorState(@PathVariable String sensorId, @PathVariable Long sensorState){
		System.out.println(sensorId);
		System.out.println(sensorState);
		
		
		return new ResponseEntity<Object>(null, HttpStatus.OK);
	}

}
