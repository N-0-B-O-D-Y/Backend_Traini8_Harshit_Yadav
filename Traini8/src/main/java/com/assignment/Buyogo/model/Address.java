package com.assignment.Buyogo.model;

import jakarta.persistence.Embeddable;


//this is our class which will be embedded in our TrainingCenter class/table

//& here we are specifying that this class is embedded one is by using the below annotation
@Embeddable
public class Address {
	
	//properties
	private String detailedAddress;
	private String city;
	private String state;
	private String pinCode;
	
	//getters & setters
	public String getDetailedAddress() {
		return detailedAddress;
	}
	public void setDetailedAddress(String detailedAddress) {
		this.detailedAddress = detailedAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	
}
