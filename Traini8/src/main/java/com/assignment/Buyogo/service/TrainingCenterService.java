package com.assignment.Buyogo.service;

//this is our service class which accept the requests from the controller

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.Buyogo.Repository.TrainingCenterRepo;
import com.assignment.Buyogo.model.TrainingCenter;

@Service
public class TrainingCenterService {
	@Autowired
	private TrainingCenterRepo repo;
	
	//method for POST request
	public TrainingCenter saveTrainingCenter(TrainingCenter trainingCenter) {
		
		 /*System.currentTimeMillis() method returns the difference, measured in milliseconds, 
		  * b/w the current time & midnight, January 1, 1970 UTC.
		  * */
		trainingCenter.setCreatedOn(System.currentTimeMillis()); 
		
		return repo.save(trainingCenter);
	}
	
	//method for get request
	public List<TrainingCenter> getAllTrainingCenters(String city, String state, String course){
		
		//conditions for filtering
		if(city!=null) {
		return repo.findByAddressCity(city)	;
		}
		else if(state!=null) {
			return repo.findByAddressState(state);
		}
		else if(course!=null) {
			return repo.findByCoursesOfferedContains(course);
		}
		else {
			return repo.findAll();
		}	
	}
}
