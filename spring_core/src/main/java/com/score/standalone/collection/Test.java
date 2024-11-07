package com.score.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/score/standalone/collection/config.xml");
		Student ss = (Student)context.getBean("student");
		System.out.println(ss.getName());

	}

}
