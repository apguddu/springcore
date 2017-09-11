package scopes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ConfigurationDemo;

public class BeanScope {
	
	
	public void doMyStartupStuffs()
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationDemo.class);
		System.out.println("Config class loading complete..");
	}

}
