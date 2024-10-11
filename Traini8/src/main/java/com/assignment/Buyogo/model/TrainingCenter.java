package com.assignment.Buyogo.model;

/*this is our model class which will hold the data
 * & here we do various validations, which helps us in storing & fetching data in a particular format
 * */


import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //acts as table in the database
public class TrainingCenter {
	
	//properties
	
	@Id //primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	@NotNull(message="center name is required")
	@Size(max=40, message="center name must be less than 40 characters")
	private String centerName;
	
	@NotNull(message = "center code is required")
	@Pattern(regexp="^[a-zA-Z0-9]{12}$", message = "center code must be exactly 12 alphanumeric characters")
	private String centerCode;
	
	
	@NotNull(message="Address is required")
	@Valid
	@Embedded //reference of embedded class
	private Address address;
	
	private Integer studentCapacity;
	
	@ElementCollection
	private List<String> coursesOffered;
	
	private Long createdOn;
	
	@Email(message="Contact Email is invalid")
	private String contactEmail;
	
	@Pattern(regexp="^[0-9]{10}$", message="contact number must be a valid 10-digit number")
	private String contactNumber;
	
	
	//here we have the getters & setters for our all properties

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getCenterCode() {
		return centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getStudentCapacity() {
		return studentCapacity;
	}

	public void setStudentCapacity(int studentCapacity) {
		this.studentCapacity = studentCapacity;
	}

	public List<String> getCoursesOffered() {
		return coursesOffered;
	}

	public void setCoursesOffered(List<String> coursesOffered) {
		this.coursesOffered = coursesOffered;
	}

	public Long getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Long createdOn) {
		this.createdOn = createdOn;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
}
