package ie.gmit.studentmanager;

public class StudentManager {
	//set an initial capacity constant for the array
	//you need to know the size that the array is
	private static final int INITIAL_CAPACITY = 10;
	
	//Create an array to store student objects
	private Student[] students=null;
	private int[] studentAges;
	
	//Constructor- instantiate students array
	public StudentManager() {
		students= new Student[INITIAL_CAPACITY];
	}
	//create methods you may need and stub them out
	
	public boolean addStudent(Student student) {
		return false;
	}
	//this is a delete student method
	public boolean deleteStudent(String studentId) {
		return false;
	}
	public Student[] getStudentByFirstName(String firstName) {
		return null;
	}
	public int findTotalStudents(){
		return -1;
	}
	
	
}
