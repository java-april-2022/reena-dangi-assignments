package com.example.Employee;

public class Engineer extends Employee {
	private String project;

	public Engineer(String email, float pay, String project) {
		super(email, pay);
		this.project = project;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
	
	@Override
	public void employeeDetails() {
		super.employeeDetails();
		System.out.println("Project" + this.project );
	}
	
	


	
	

}
