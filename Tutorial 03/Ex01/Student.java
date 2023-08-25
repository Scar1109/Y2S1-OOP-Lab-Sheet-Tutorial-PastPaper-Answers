public class Student {
	private static int max = 100;
	private int studentID;
	private String name;
	private String degree;
	private String mobile;
	
	
	public Student(String name, String degree, String mobile) {
		this.studentID = getNextStudentID();
		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void print() {
		System.out.println("Student id : " + this.studentID);
		System.out.println("Student name : " + this.name);
		System.out.println("Degree : " + this.degree);
		System.out.println("Mobile : " + this.mobile);
	}
	
	public static int getNextStudentID() {
		max ++;
		
		return max;
	}
	
	
}
