public class Person {
	private String name;
	private String address;
	
	public void showDetails() {
		System.out.println("The name : " + this.name);
		System.out.println("The address : " + this.address);
	}

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
}
