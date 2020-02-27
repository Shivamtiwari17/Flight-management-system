package com.cg.iter.data;

import java.util.HashSet;
import java.util.Set;

import com.cg.iter.dto.Passenger;

public class DatabaseEntry {
	static Set<Passenger> passenger=new HashSet<Passenger>();
	
	
	static{
		passenger.add(new Passenger("customer", "1234","Shivam", "abc@gmail.com"));
	}


	public static Set<Passenger> getPassenger() {
		return passenger;
	}


}
