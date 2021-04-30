package kodlamaIo;

public class UserManger   {
	public void add(Student student) {
		System.out.print("Ogrenci Eklendi  :\n"+student.getFirstName()+" "+student.getLastName()+" \n"+
												student.getStudentId()+" \n"+student.getDivision()+" \n"+student.getEmail());
	}
	public void add(Instructor instructor) {
		System.out.println("Eðitmen Eklendi  :" +instructor.getFirstName()+ " "+instructor.getLastName()+" "+
												instructor.getArea()+" \n"+instructor.getEmail()+" \n"+
												 instructor.getInstructorId());
	}
}
