package javaCampDayThreeHw;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Ayşegül", "Yıldız", "xxxx@gmail.com", "123456");
		Instructor instructor1 = new Instructor(2, "Engin", "Demiroğ", "yyyy@gmail.com", "789102");
		
		UserManager userManager = new UserManager();
		userManager.update(student1);
		userManager.update(instructor1);
		
		UserManager sm = new StudentManager();
		sm.update(student1);

		StudentManager studentManager = new StudentManager();
		studentManager.joinCourse();
		studentManager.sendHomework("Ödev 1");
		studentManager.takeRollCall();
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse("Java & React");
		instructorManager.addHomework();
	}

}
