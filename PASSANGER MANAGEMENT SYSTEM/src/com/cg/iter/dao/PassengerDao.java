package com.cg.iter.dao;

import java.util.Set;

import com.cg.iter.dto.Passenger;

public interface PassengerDao {

	public boolean addPassenger(Passenger p);

	public Passenger viewPassenger(String search);

	public Set<Passenger> viewPassenger();

	public void updateUser(Passenger id);

	public boolean deletePassenger(String id);


	
}