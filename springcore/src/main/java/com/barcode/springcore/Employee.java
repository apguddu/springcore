package com.barcode.springcore;

import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
	
	private int emp_id;
	private int emp_name;
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(int emp_name) {
		this.emp_name = emp_name;
	}
	
	public void displayEmpInfo()
	{
		System.out.println("employee info...");
		System.out.println("id and name -->> " + emp_id + " " + emp_name);
	}
	

}
