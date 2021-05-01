package javaCampDayThreeHw;

public class InstructorManager extends UserManager{
	
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + "eğitmen bilgileriniz güncellendi.");
	}
	
	
	public void addCourse(String course) {
		System.out.println(course + " kursu oluşturuldu.");
	}
	
	public void addHomework() {
		System.out.println("Ödev eklendi.");
	}
}
