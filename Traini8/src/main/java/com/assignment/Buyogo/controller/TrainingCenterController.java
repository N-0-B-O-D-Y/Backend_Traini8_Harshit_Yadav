package com.assignment.Buyogo.controller;

//this is our controller class which faces the requests coming from the client & act accordingly

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.Buyogo.model.TrainingCenter;
import com.assignment.Buyogo.service.TrainingCenterService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/training-centers") // here is our request which is mapped with this controller class
public class TrainingCenterController {
	@Autowired
	private TrainingCenterService service;
	
	// API for 'POST' request
	@PostMapping
	public ResponseEntity<?> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter){
			TrainingCenter savedCenter= service.saveTrainingCenter(trainingCenter);
			return ResponseEntity.status(201).body(savedCenter);
	}
	
	// API for 'GET' request
	@GetMapping
	public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters(@RequestParam(required =false) String city ,@RequestParam(required =false) String state,@RequestParam(required =false) String course){
		
		List<TrainingCenter> trainingCenters=service.getAllTrainingCenters(city,state,course);
		
			return ResponseEntity.ok(trainingCenters);
		}
}
