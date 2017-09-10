package com.barcode.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	
	 @Value("10")
     private int id;
	 @Value("Abhilash")
     private String name;
     
     public Student()
     {
    	 
     }
     
     public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void displayStudentInfo()
     {
    	 System.out.println("Student info...");
    	 System.out.println("id and name -->> " + id + " " + name);
    	
    	 
     }

}
