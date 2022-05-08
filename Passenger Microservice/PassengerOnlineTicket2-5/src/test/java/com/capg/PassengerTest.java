package com.capg;

import static org.mockito.Mockito.when;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.capg.Model.Passenger;
import com.capg.Repository.PassengerRepo;
import com.capg.Service.PassengerService;

@SpringBootTest
public class PassengerTest {
	@MockBean
	private PassengerRepo repository;
	@Autowired
	private PassengerService service;
	@Test
	public void addPassenger() {
	Passenger pas = new Passenger(123, "rose", "joya", "Idli", "preesta", "yes");
	when(repository.save(pas)).thenReturn(pas);
	assertEquals(pas, service.addPassenger(pas));
		
		
	}
	private void assertEquals(Passenger pas, Passenger addPassenger) {
		// TODO Auto-generated method stub
		
	}
	
	}
	
	
	
		
	
	
	


