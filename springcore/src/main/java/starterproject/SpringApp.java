package starterproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.barcode.springcore.University;

import config.ConfigurationDemo;

public class SpringApp {

	public static void main(String[] args) {

		System.out.println("loading file...");
		
		//load xml file 
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//load configurarion class file 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationDemo.class);
		System.out.println("xml loaded..");
		University university = (University)context.getBean("university");
		university.universityInfo();
		//context.close();
		
	}

}
