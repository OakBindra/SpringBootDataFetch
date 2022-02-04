package com.rabindra.app.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;

import com.rabindra.app.entity.Employee;
//@Repository
public interface EmployeeRepo extends JpaRepository <Employee, String> {

	@Query(value="select * from employee ",nativeQuery = true)
	 List<Employee> getAll();
	
	
	@Query(value="select count(*) from employee", nativeQuery=true)
	int getCount();
}
