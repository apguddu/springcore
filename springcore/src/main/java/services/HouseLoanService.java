package services;

import org.springframework.stereotype.Component;

@Component("houseLoanService")
public class HouseLoanService implements loanservice{

	public String loanService() {
		
		return "You have applaied for HouseLoanSevice";
	}

	
}
