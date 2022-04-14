package com.example.animalkingdom;

public class Tiger extends Animal implements Living{
	private String name;

	public Tiger(String name) {
		this.name=name;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I would like to eat meat");
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object reproduce() {
		// TODO Auto-generated method stub
		Tiger cub=new Tiger("simba");
		return cub;
		
	}

	

}
