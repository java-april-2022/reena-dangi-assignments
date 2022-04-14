package com.example.main;

import com.example.Employee.Employee;
import com.example.Employee.Engineer;
import com.example.Employee.SalesRep;
import com.example.animalkingdom.Tiger;

public class Test {
	public static void main(String[] args) {
//		Employee claudia=new Employee("Cludia@cafe.com",3000000);
//		claudia.employeeDetails();
		Engineer man=new Engineer("man@cafe.com",3000000, "Chatbot");
		man.employeeDetails();
		
		SalesRep moha=new SalesRep("hdhbfj@gmail.com", 54534545,8904585.67);
		moha.employeeDetails();
		
		Tiger newTiger=new Tiger("Big Cat");
		Tiger baby=(Tiger) newTiger.reproduce();
		System.out.println(baby.getName());
	}	

}
