package services;

import org.springframework.stereotype.Component;

@Component("studyLoan")
public class StudyLoan implements loanservice {
    
	public String loanService() {
		
		return "You have sucessfully applaied for study loan";
	}

}
