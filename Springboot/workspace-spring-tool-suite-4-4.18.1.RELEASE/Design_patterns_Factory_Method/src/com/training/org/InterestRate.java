package com.training.org;

public abstract class InterestRate {

	protected double Interest;
	abstract void getInterest();
	public void calculateEMI(double Amount, int years) {
//	int month = years*12;
//	double emi = (Amount*Interest*Math.pow(1 + Interest, month))/ (Math.pow(1 + Interest, month) - 1);
//	System.out.println(emi);
		double monthlyInterestRate = Interest / 12 / 100;

		 

        int numberOfPayments = years * 12;

 

        double monthlyEmi = (Amount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))

 

                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

 

        System.out.println("Monthly EMI: " + monthlyEmi);
	
	}

}
