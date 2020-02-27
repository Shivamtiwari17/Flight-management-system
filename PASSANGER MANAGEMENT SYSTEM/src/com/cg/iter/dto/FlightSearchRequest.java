package com.cg.iter.dto;

public class FlightSearchRequest {

	private String airportOriginCode;

	private String airportDestinationCode;

	private int departureFrom;

	private int person1Amount;

	private int person2Amount;

	@Override
	public String toString() {
		return "FlightSearchRequest [airportOriginCode=" + airportOriginCode + ", airportDestinationCode="
				+ airportDestinationCode + ", departureFrom=" + departureFrom + ", person1Amount=" + person1Amount
				+ ", person2Amount=" + person2Amount + ", person3Amount=" + person3Amount + "]";
	}

	private int person3Amount;

	public FlightSearchRequest(String airportOriginCode, String airportDestinationCode, int departureFrom, int adultAmount, int childAmount, int infantAmount) {
		this.airportDestinationCode = airportDestinationCode;
		this.airportOriginCode = airportOriginCode;
		this.departureFrom = departureFrom;
		this.person1Amount = person1Amount;
		this.person2Amount = person2Amount;
		this.person3Amount = person3Amount;
	}

	public String getAirportOriginCode() {
		return airportOriginCode;
	}

	public String getAirportDestinationCode() {
		return airportDestinationCode;
	}

	public int getperson1Amount() {
		return person1Amount;
	}

	public int getperson2Amount() {
		return person2Amount;
	}

	public int getperson3Amount() {
		return person3Amount;
	}

	public void setAirportOriginCode(String airportOriginCode) {
		this.airportOriginCode = airportOriginCode;
	}

	public void setAirportDestinationCode(String airportDestinationCode) {
		this.airportDestinationCode = airportDestinationCode;
	}

	public int getDepartureFrom() {
		return departureFrom;
	}

	public void setDepartureFrom(int departureFrom) {
		this.departureFrom = departureFrom;
	}

	public void setAdultAmount(int adultAmount) {
		this.person1Amount = person1Amount;
	}

	public void setChildAmount(int childAmount) {
		this.person2Amount = person2Amount;
	}

	public void setInfantAmount(int infantAmount) {
		this.person3Amount = person3Amount;
	}
}