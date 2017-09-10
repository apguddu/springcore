package com.barcode.springcore;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	
     private int id; 
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
