package com.cg.iter.service;

import java.util.Map;
import java.util.Set;
import com.cg.iter.dao.PassengerDao;
import com.cg.iter.dao.PassengerDaoImpl;
import com.cg.iter.dto.Passenger;

public class PassengerServiceImpl implements PassengerService{
	PassengerDao passengerDao= new PassengerDaoImpl();
	
	public boolean addPassenger(Passenger p){
		return  passengerDao.addPassenger(p);
		
	}
	
	public Passenger viewPassenger(String search){
		return passengerDao.viewPassenger(search);
	}
	public Set<Passenger> viewPassenger(){
		return passengerDao.viewPassenger();
		
	}
	public void updatePassenger(Passenger pas){
		passengerDao.updateUser(pas);
	}
	public boolean deletePassenger(String id){
		return passengerDao.deletePassenger(id);
		 
	}
	public void validatePassenger(Passenger p){
		
	}

	@Override
	public boolean addPassenger(PassengerService passenger) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<Long, PassengerService> getPassenger() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PassengerService viewPassenger(long passengerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validatePhoneNo(long phoneNo) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateEmail(String mail) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateId(long id) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		return false;
	}
}
