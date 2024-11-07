package com.score.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/score/ci/config.xml");
		Student ss = (Student)context.getBean("s");
		System.out.println(ss);

	}

}
