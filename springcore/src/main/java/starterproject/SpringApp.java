package com.barcode.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("xml loaded..");
		University university = (University)context.getBean("university");
		university.universityInfo();
		context.close();
		
	}

}
