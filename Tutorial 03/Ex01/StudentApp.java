public class StudentApp {

	public static void main(String[] args) {
		Student[] student = new Student[5];
		
		student[0] = new Student("Kaveen Dinethma","Information Technology","0710826479");
		student[1] = new Student("Praveen De Silva","Information Technology","0710825454");
		student[2] = new Student("Sasindu Nadeeshan","Information Technology","07108545479");
		student[3] = new Student("Alex cery","Businuss Managemnet","071085479");
		student[4] = new Student("Joe Biden","Information Technology","0710453479");
		
		for(int i=0; i<5; i++) {
			student[i].print();
			System.out.println();
		}

	}

}