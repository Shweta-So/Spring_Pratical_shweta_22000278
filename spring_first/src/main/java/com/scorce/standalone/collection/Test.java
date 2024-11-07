package com.scorce.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("com/scorce/standalone/collection/config.xml");
		Employee p1=(Employee)context.getBean("emp1");
		System.out.println(p1.getEname());
			

	}

}
