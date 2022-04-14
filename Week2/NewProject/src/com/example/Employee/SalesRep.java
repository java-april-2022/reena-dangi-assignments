package com.example.Employee;

public class SalesRep extends Employee{

	private double target;
	public SalesRep(String email, float pay, double target) {
		super(email, pay);
		this.target = target;
	}

	public double getTarget() {
		return target;
	}

	public void setTarget(double target) {
		this.target = target;
	}
	
	@Override
	public void employeeDetails() {
		super.employeeDetails();
		System.out.println("Traget" + this.target );
	}
	
	
	
}
