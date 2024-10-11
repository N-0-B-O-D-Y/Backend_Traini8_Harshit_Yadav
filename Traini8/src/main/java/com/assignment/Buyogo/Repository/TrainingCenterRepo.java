package com.assignment.Buyogo.Repository;

//this is our repository interface which extends JpaRepository interface, so that we can use its in-built "CRUD" methods

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.Buyogo.model.TrainingCenter;

public interface TrainingCenterRepo extends JpaRepository<TrainingCenter, Long>{
	
	//here is some method declarations for data filtering purpose
	List<TrainingCenter> findByAddressCity(String city);
	List<TrainingCenter> findByAddressState(String State);
	List<TrainingCenter> findByCoursesOfferedContains(String course);
}
