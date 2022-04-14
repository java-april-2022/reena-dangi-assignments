package mainPackage;

import animalPackage.Lion;
import animalPackage.Panda;
import animalPackage.Tree;
import empPackage.Developer;
import empPackage.Employee;

public class Tester {
	
	public static void main(String[] args) {
		System.out.println("Hello, welcome to STS!!");
		Employee zainab=new Employee("zainab@dojotech", 250000);
		zainab.empDetails();
		
		Developer sarah=new Developer("sarah@dojotech", 250000, "World Hunger");
		sarah.empDetails();
		
		
		Lion simba=new Lion("Simba");
		simba.breath();
		simba.eat();
		simba.roar();
		
		Lion cub=simba.reproduce("Timon");
		cub.eat();
	
		
		
		Panda po=new Panda();
		po.climbTree();
		po.breath();
		
		Tree newTree=new Tree();
		newTree.grow();
		
		
	}

}
