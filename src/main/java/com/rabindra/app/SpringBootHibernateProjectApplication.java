package com.rabindra.app;


//import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.rabindra.app.boot.Starter;
//
@EnableScheduling
@SpringBootApplication
public class SpringBootHibernateProjectApplication implements CommandLineRunner{

	@Autowired
	private Starter starter;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateProjectApplication.class, args);
//		System.out.println(starter.getData());
	}


	@Override
	public void run(String... args) throws Exception {

//		System.out.println(starter.getData());
		
//		System.out.println(starter.getEmployees());
//		System.out.println(applicationContext.getId());
		System.out.println(starter.finalMethod());

//		MyBean myBean = applicationContext.getBean(MyBean.class);
//		System.out.println(myBean.getApplicationId());
}
	
	
}
