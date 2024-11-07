package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("com/springcore/collection/config.xml");
		emp p1=(emp)context.getBean("emp1");
		System.out.println(p1.getName());
		System.out.println(p1.getPhone());
		System.out.println(p1.getAddress());
		System.out.println(p1.getCourses());
			

	}

}
