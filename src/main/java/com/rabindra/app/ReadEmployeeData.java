//package com.rabindra.app;
//
////import java.io.Serializable;
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
////import org.hibernate.cfg.Configuration;
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Repository;
//
//import com.rabindra.app.entity.Employee;
//@Repository
//public class ReadEmployeeData
//{
//
//	@Autowired
//	private SessionFactory sessionFactory;
//	public void createEmployee(Employee employee){
//		Session session= null;
//		try {
//			session = sessionFactory.openSession();
//			session.beginTransaction();
////			Integer id =(Integer) session.save(employee);
//			
//			// query students
//			List<Employee> theStudents = session.createQuery("from Employee").list();
//						
//			// display the students
//			displayStudents(theStudents);
//			
//			System.out.println("Employee is created With Id::"+id);
//			session.getTransaction().commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		yo run garera dekhau malai 
//		
//		
//	}
//	private void displayStudents(List<Employee> theStudents) {
//		System.out.println(theStudents);
//		
//	}
//}
