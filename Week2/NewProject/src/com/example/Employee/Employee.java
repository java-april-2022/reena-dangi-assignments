package com.example.Employee;

public class Employee {
	
	private String email;
	private float pay;
	
	public Employee(String email, float pay) {
		super();
		this.email = email;
		this.pay = pay;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getPay() {
		return pay;
	}
	public void setPay(float pay) {
		this.pay = pay;
	}
	
	protected void employeeDetails() {
		System.out.printf("Employee Email:%s\n Pay:%.2f",this.email,this.pay );
	}
	
}
