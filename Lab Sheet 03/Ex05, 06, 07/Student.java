public class Student extends Person {

	private String studentid;

	public Student(String name, String address, String studentid) {
		super(name, address);
		this.studentid = studentid;
	}

	@Override
	public void showDetails() {
		super.showDetails();
			System.out.println("The Student ID : " + this.studentid);
			}
}