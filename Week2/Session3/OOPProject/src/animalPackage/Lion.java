package animalPackage;

public class Lion extends Animal implements Living {

	private String name;
	
	
	public Lion(String name) {
		this.name = name;
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
		System.out.println("I would like to eat Panda!!");
	}
	
	public void roar() {
		System.out.println("roarrrrrrrrrrrrrrrrrrr!");
	}

	@Override
	public void grow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Lion reproduce(String name ) {
		// TODO Auto-generated method stub
		Lion cub=new Lion(name);
		System.out.println("I can give you cute cubs");
		return cub;
		
	}

	
	
}
