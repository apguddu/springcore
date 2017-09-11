package springinaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import beans.Employee;
import beans.Student;
import services.loanservice;

@Component("university")
public class University {
	
	@Autowired
	private Student s;
	@Autowired
	private Employee e;
	
	@Autowired
	@Qualifier("houseLoanService")
	private loanservice service;
	
	public void universityInfo()
	{
		s.displayStudentInfo();
		e.displayEmpInfo();
		System.out.println(service.loanService());
	}
	

}
