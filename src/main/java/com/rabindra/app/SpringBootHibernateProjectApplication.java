package com.rabindra.app;


//import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rabindra.app.boot.Starter;
//

@SpringBootApplication
public class SpringBootHibernateProjectApplication implements CommandLineRunner{

	@Autowired
	private static Starter starter;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateProjectApplication.class, args);
//		System.out.println(starter.getData());
	}


	@Override
	public void run(String... args) throws Exception {

		System.out.println(starter.getData());
//		System.out.println(applicationContext.getId());

//		MyBean myBean = applicationContext.getBean(MyBean.class);
//		System.out.println(myBean.getApplicationId());
}
	
	
}
