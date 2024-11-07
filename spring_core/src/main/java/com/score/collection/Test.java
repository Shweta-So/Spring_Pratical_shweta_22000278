package com.score.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/score/collection/config.xml");
		Student ss = (Student)context.getBean("stu");
		System.out.println(ss.getName());
		System.out.println(ss.getAdd());
		System.out.println(ss.getPhone());
		System.out.println(ss.getCourse());

	}

}
