package com.training.org;
import java.io.*;
public class MyBankEMICacluclation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		GetLoanType planLoan = new GetLoanType();  

		System.out.print("Enter the name of loan for which you want to calculate EMI: (HOUSELOAN||CARLOAN||PERSONALOAN||BUSINESSLOAN):");  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  

		String loanName=br.readLine(); 
		System.out.print("Enter the Amount for loan: ");  
		double amounts=Double.parseDouble(br.readLine()); 
		System.out.print("Enter the year for EMI: ");  
		int units=Integer.parseInt(br.readLine());  

		InterestRate l = planLoan.getInterest(loanName);  
		//call getRate() method and calculateBill()method of DomesticPaln.  

		System.out.print("EMI for "+loanName+" for  "+amounts+ "in "+ units + "years is: ");  
		l.getInterest();  
		l.calculateEMI(amounts,units);  
	}  

	}


