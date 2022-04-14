package animalPackage;

public class Tree implements Living {

	@Override
	public void grow() {
		// TODO Auto-generated method stub
		
		System.out.println("I can grow with help of water and soil");
	}

	@Override
	public Object reproduce(String name) {
		// TODO Auto-generated method stub
		System.out.println("I can give Fruites");
		return null;
	}
	

}
