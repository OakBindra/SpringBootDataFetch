package com.rabindra.app.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rabindra.app.Repo.EmployeeRepo;
import com.rabindra.app.entity.*;

@Component
public class Starter {

	@Autowired
	EmployeeRepo empRepo;
	
	
	//sab kura aaisakyo aba scheduling kina use garne because we are not going to display our data in rest api 
	// and how will you display them with only the methods??
	

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
}