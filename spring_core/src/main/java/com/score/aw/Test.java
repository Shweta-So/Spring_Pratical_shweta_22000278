package com.score.aw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {

       context = new ClassPathXmlApplicationContext("com/score/aw/config.xml");
       Question que = (Question) context.getBean("que");
       System.out.println(que);
       

	}

}
