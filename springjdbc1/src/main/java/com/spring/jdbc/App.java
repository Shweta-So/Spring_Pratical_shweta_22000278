package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.EmpDao;
import com.spring.jdbc.entites.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext c;

	public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        
        c = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        EmpDao cd = c.getBean("EmpDao",EmpDao.class);
        
        Employee c1 = new Employee();
//        c1.setEid(101);
//        c1.setEname("Shweta Solanki");
//        c1.setDname("Marketing");
//        int r = cd.insert(c1);
//        System.out.println("record inserted" + r);
        
        c1.setEid(101);
        c1.setEname("shweta solanki");
        int c  = cd.update(c1);
        System.out.println("record updated" + c);
        
        
    }
}
