package kodlamaIo;

public class Student extends User {
	String division;
	int studentId;

	
	public String getDivision() {
		return division;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
}
