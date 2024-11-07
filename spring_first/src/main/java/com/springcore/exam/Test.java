package com.springcore.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collection.emp;

public class Test {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("com/springcore/exam/config.xml");
		question p1= (question)context.getBean("que");
		System.out.println(p1.getQ1());
		System.out.println(p1.getAnswer());

	}

}
