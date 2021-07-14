package student;

class StudentData {
	private int stuID;
	private String stuName;
	private int stuAge;

	//getter method for Student's ID
	public int getStuID() {
		return stuID;
	}

	//getter method for Student's Name
	public String getStuName() {
		return stuName;
	}

	//getter method for Student's Age
	public int getStuAge() {
		return stuAge;
	}

	// default constructor
	public StudentData() {

	}

	//parameterized constructor
	public StudentData(int stuID, String stuName, int stuAge) {
		this.stuID = stuID;
		this.stuName = stuName;
		this.stuAge = stuAge;
	}

	public static void main(String args[]) {

		// This object creation would call the default constructor
		StudentData myobj = new StudentData();
		System.out.println("Student Name is: " + myobj.getStuName());
		System.out.println("Student Age is: " + myobj.getStuAge());
		System.out.println("Student ID is: " + myobj.getStuID());

		/*
		 * This object creation would call the parameterized constructor
		 * StudentData(int, String, int)
		 */
		StudentData myobj2 = new StudentData(555, "Chaitanya", 25);
		System.out.println("Student Name is: " + myobj2.getStuName());
		System.out.println("Student Age is: " + myobj2.getStuAge());
		System.out.println("Student ID is: " + myobj2.getStuID());
	}
}
