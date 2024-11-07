package com.score.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("com/score/ci/config.xml");
		Student ss=(Student)c.getBean("s1");
		System.out.println(ss);
	}

}
