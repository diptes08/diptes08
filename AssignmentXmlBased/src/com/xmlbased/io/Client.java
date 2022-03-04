package com.xmlbased.io;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	    Mobile mob =(Mobile) context.getBean("brand");
	   String BRAND= mob.feature(); 
	    Mobile mob1 =(Mobile) context.getBean("color");
	   String COLOR=mob1.feature();
	    Mobile mob2 =context.getBean("processor",Processor.class);
	   String PROCS= mob2.feature();
	    
	    System.out.println("The combination you have selcted is: " +BRAND+ " " + " " + COLOR +" " + PROCS);
	}
   

	}

