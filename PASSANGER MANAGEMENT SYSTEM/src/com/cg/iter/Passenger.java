package com.cg.iter;

public class Passenger {
	private int pnrNumber;
	private String passengerName;
	private int passengerAge;
	private int passengerUIN;
	private double Luggage;
	public Passenger(int pnrNumber, String passengerName, int passengerAge, int passengerUIN, double luggage) {
		
		this.pnrNumber = pnrNumber;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerUIN = passengerUIN;
		Luggage = luggage;
	}
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(int pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public int getPassengerUIN() {
		return passengerUIN;
	}
	public void setPassengerUIN(int passengerUIN) {
		this.passengerUIN = passengerUIN;
	}
	public double getLuggage() {
		return Luggage;
	}
	public void setLuggage(double luggage) {
		Luggage = luggage;
	}
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
