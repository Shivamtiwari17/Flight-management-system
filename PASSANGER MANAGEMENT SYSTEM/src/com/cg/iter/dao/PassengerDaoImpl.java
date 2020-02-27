package com.cg.iter.dao;

import java.util.HashSet; 
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.apache.log4j.Logger;

//import org.apache.log4j.Logger;

import com.cg.iter.data.DatabaseEntry;
import com.cg.iter.dto.Passenger;
import com.cg.iter.exception.passengerNotFoundException;

public class PassengerDaoImpl implements PassengerDao {
	Set<Passenger> passengerSet=new HashSet<Passenger>();
	Logger logger=Logger.getLogger(PassengerDaoImpl.class);

	@Override
	public boolean addPassenger(Passenger p) {
		passengerSet=DatabaseEntry.getPassenger();
		passengerSet.add(p);
		logger.info("addpassenger"+p);
		return false;
		
	}

	@Override
	public Passenger viewPassenger(String search) {
		passengerSet=DatabaseEntry.getPassenger();
		Iterator<Passenger> iter = passengerSet.iterator();
		while(iter.hasNext()) {
			Passenger p =  iter.next();
			if(p.getPassengerId().equalsIgnoreCase(search)){
				return p;
			}

		}
		return null;
	}

	@Override
	public Set<Passenger> viewPassenger() {
		passengerSet=DatabaseEntry.getPassenger();
		System.out.println(passengerSet);
		return  passengerSet;
		
	}

	@Override
	public void updateUser(Passenger pas) {
		passengerSet=DatabaseEntry.getPassenger();			
		Iterator<Passenger> iter = passengerSet.iterator();
		while(iter.hasNext()) {
			Passenger p =  iter.next();
			if(p.getPassengerId().equalsIgnoreCase(pas.getPassengerId())){
				p.setPassengerName(pas.getPassengerName());
				p.setPassengerEmail(pas.getPassengerEmail());
				p.setPassengerType(pas.getPassengerType());
			}
		}		
	}

	@Override
	public boolean deletePassenger(String id) {
		passengerSet=DatabaseEntry.getPassenger();
		for (Iterator<Passenger> iterator = passengerSet.iterator(); iterator.hasNext();) {
			Passenger p = (Passenger) iterator.next();
			if(p.getPassengerId().equalsIgnoreCase(id)){
				return passengerSet.remove(p);
			}

		}
		return false;
		
	}

	

}
