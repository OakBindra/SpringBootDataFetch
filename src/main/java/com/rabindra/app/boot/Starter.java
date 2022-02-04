package com.rabindra.app.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rabindra.app.Repo.EmployeeRepo;
import com.rabindra.app.entity.*;

//@Component
public class Starter {

	@Autowired
	EmployeeRepo empRepo;
	int counttemp = 0;
	public int getData() {
		int count = empRepo.getCount();
		
		return count;
	}
	
	//aba users fetch gara import gara ta milena 
	public List<Employee> getEmployees(){
		List<Employee> user = empRepo.getAll();
		return user;
	}
	// yeuta method banayera main class vitra call garthyeeau hola tyo method lai 
//	public void getResult() {
//		System.out.println("count"+getData());
//		System.out.println("count"+getData());
//	}
	
	 @Scheduled(fixedDelayString = "180000", initialDelay = 10000)
	public void finalMethod() {
		
		int count = getData();
		if(count != counttemp) {
			System.out.println("Fetching all users data");
			System.out.println("All the users:"+getEmployees());
		}else {
			System.out.println("Count is Same so not Fetching");
		}
	}

}
