package kodlamaIo;

public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student();
		student1.setFirstName("Veysi");
		student1.setLastName("AKAN");
		student1.setEmail("veysiakan5@gmail.com");
		student1.setDivision("Say�sal");
		student1.setStudentId(1);
		

		Student student2=new Student();
		student2.setFirstName("Ay�e");
		student2.setLastName("G�L");
		student2.setEmail("gulayse@gmail.com");
		student2.setDivision("E�it A��rl�k");
		student2.setStudentId(2);
	
		
		
		Instructor instructor1=new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroj");
		instructor1.setEmail("abc@Hotmail.com");
		instructor1.setArea("Programc�");
		instructor1.setInstructorId(1);
		
		Instructor instructor2=new Instructor();
		instructor2.setFirstName("Fatma");
		instructor2.setLastName("yaz");
		instructor2.setEmail("xyz@Hotmail.com");
		instructor2.setArea("Web Tasar�m�");
		instructor2.setInstructorId(2);
		
		UserManger manger=new UserManger();
		manger.add(student1);
		manger.add(student2);
		System.out.println("-------------\n");
		manger.add(instructor1);
		manger.add(instructor2);
		
	}

}
