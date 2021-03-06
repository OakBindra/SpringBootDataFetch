package com.rabindra.app.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.rabindra.app.Repo.EmployeeRepo;
import com.rabindra.app.entity.*;

@Component
//here component is also needed otherwise main app wont be able to find it.
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
//	@Scheduled(cron="* * * * * *")
	public void finalMethod() {
		
		int count = getData();
		if(count != counttemp) {
			counttemp++;
			System.out.println("Fetching all users data");
			System.out.println("All the users:"+getEmployees());
		}else {
			System.out.println("Count is Same so not Fetching");
		}
	}
}

//public class Starter {
//
//	@Autowired
//	EmployeeRepo empRepo;
//	
//	public int getData() {
//		int count = empRepo.getCount();
//		
//		return count;
//	}
//	
//	//aba users fetch gara import gara ta milena 
//	public List<Employee> getEmployees(){
//		List<Employee> user = empRepo.getAll();
//		return user;
//	}
//	// yeuta method banayera main class vitra call garthyeeau hola tyo method lai 
////	public void getResult() {
////		System.out.println("count"+getData());
////		System.out.println("count"+getData());
////	}
//	
//	public void finalMethod() {
//		int counttemp = 0;
//		System.out.println("total user"+getData());
//		if(counttemp != getData()) {
//			counttemp++;
//			System.out.println("All the users:"+getEmployees());
//		}else {
//			System.out.println("Data cant be fetched.");
//		}
//	}
//
//}
	
	
