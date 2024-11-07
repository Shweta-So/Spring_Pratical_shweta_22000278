package com.midsem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("com/midsem/config.xml");
		Customer customer = (Customer)context.getBean("customer");
		System.out.println(customer);

	}

}
