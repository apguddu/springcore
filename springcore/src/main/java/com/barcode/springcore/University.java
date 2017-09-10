package com.barcode.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("university")
public class University {
	
	@Autowired
	private Student s;
	@Autowired
	private Employee e;
	
	public void universityInfo()
	{
		s.displayStudentInfo();
		e.displayEmpInfo();
	}
	

}
