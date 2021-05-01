package javaCampDayThreeHw;

public class StudentManager extends UserManager{
	
	@Override
	public void update(User user) {
		System.out.println("Öğrenci bilgileriniz güncellendi.");
	}
	
	public void joinCourse() {
		System.out.println("Kursa katılımınız gerçekleşti.");
	}
	
	public void sendHomework(String homework) {
		System.out.println(homework + " başarıyla gönderildi.");
	}
	
	public void takeRollCall() {
		System.out.println("Yoklamanız alınmıştır, derse dönebilirsiniz.");
	}
}
