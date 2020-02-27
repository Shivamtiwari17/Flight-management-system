package com.cg.iter.dto;

public class Passenger {
	String passengerType;
	String passengerId;
	String passengerName;
	//Password userPassword;
	String passengerEmail;
	public Passenger(String PassengerType, String passengerId, String PassengerName, String PassengerEmail) {
		super();
		this.passengerType = PassengerType;
		this.passengerId = passengerId;
		this.passengerName = PassengerName;
		this.passengerEmail = PassengerEmail;
	}
	public String getPassengerType() {
		return passengerType;
	}
	public void setPassengerType(String userType) {
		this.passengerType = userType;
	}
	public String getPassengerId() {
		return passengerId;
	}
	
	@Override
	public String toString() {
		return "Passenger [passengerType=" + passengerType + ", passengerId=" + passengerId + ", passengerName="
				+ passengerName + ", passengerEmail=" + passengerEmail + "]";
	}
	public void setPassengerId(String userId) {
		this.passengerId = userId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String PassengerName) {
		this.passengerName = PassengerName;
	}
	public String getPassengerEmail() {
		return passengerEmail;
	}
	public void setPassengerEmail(String PassengerEmail) {
		this.passengerEmail = PassengerEmail;
	}
}
