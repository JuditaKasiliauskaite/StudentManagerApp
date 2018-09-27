package ie.gmit.studentmanager;

public class Student {
	private String name;
	private int age;
	private int studentId;

	public int getStudentId() { // function
		return studentId; // stores id
	}

	public void setStudentId(int newStudentId) { // method
		studentId = newStudentId;
	}

	public String getName() { // return type
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int newAge) {
		age = newAge;
	}
}
