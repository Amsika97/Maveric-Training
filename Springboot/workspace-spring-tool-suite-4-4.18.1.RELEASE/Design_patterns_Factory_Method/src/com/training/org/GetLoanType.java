package com.training.org;

public class GetLoanType {
	public InterestRate getInterest(String loanType){  
		if(loanType == null){  
			return null;  
		}  
		if(loanType.equalsIgnoreCase("HOUSELOAN")) {  
			return new HouseLoan();  
		}   
		else if(loanType.equalsIgnoreCase("CARLOAN")){  
			return new CarLoan();  
		}   
		else if(loanType.equalsIgnoreCase("PERSONALOAN")) {  
			return new PersonalLoan();  
		} 
		else if(loanType.equalsIgnoreCase("BUSINESSLOAN")) {  
			return new BusinessLoan();  
		} 
		return null;  
	}

}
