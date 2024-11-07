package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static AbstractApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Department d1 = (Department)context.getBean("dd"
				+ "");
		System.out.println(d1);
		context.registerShutdownHook();
		
		System.out.println("-------------------------------------------------------------------");
		emp e1 = (emp)context.getBean("e1");
		System.out.println(e1);
		
		System.out.println("-------------------------------------------------------------------");
		example ex1 = (example)context.getBean("ex1");
		System.out.println(ex1);
		
	}

}
