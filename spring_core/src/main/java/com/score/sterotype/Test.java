package com.score.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/score/sterotype/config.xml");
		Employee emp = (Employee)context.getBean("employee",Employee.class);
		System.out.println(emp);

	}

}
