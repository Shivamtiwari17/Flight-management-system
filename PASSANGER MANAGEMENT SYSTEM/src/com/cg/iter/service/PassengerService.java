package com.cg.iter.service;

import java.util.Map;
import java.util.Set;

import com.cg.iter.dto.Passenger;

public interface PassengerService {
	
	
	public boolean addPassenger(Passenger passenger);
	public Set<Passenger> viewPassenger();
	public Map<Long,PassengerService> getPassenger();
	public Passenger viewPassenger(String string);
	
	public boolean validatePhoneNo(long phoneNo) throws InvalidDetailsException;
	public boolean validateEmail(String mail) throws InvalidDetailsException;
	public boolean validateId(long id) throws InvalidDetailsException;
	public boolean deletePassenger(String next);
	public void updatePassenger(Passenger pas);
	boolean addPassenger(PassengerService passenger);
	PassengerService viewPassenger(long passengerId);
}