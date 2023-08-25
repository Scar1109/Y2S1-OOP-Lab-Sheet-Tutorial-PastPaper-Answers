public class PartTimeStudent extends Student {

	private int working_hours;

	public PartTimeStudent(String name, String address, String studentid, int working_hours) {
		super(name, address, studentid);
		this.working_hours = working_hours;
	}

	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("The Working hours : " + this.working_hours);
	}
}
