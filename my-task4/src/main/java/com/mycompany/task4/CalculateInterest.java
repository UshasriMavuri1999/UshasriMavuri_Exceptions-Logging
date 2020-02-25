package com.mycompany.task4;

public class CalculateInterest {
	double principal,rate,time;
	
	public void setPrincipal(double principal) {
		this.principal = principal;
	}


	public void setRate(double rate) {
		this.rate = rate;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public String CalculateCompoundInterest() {
		double compoundInterest = Math.round(principal*Math.pow((1+rate/100),time) - principal)/100.0;
		return "Compound Interest is : "+compoundInterest+"\n";
	}

	public String CalculateSimpleInterest() {
		double simpleInterest = Math.round((principal*rate*time)/100)/100.0;
		return "Simple Interest is : "+simpleInterest+"\n";
	}
	
	
}
