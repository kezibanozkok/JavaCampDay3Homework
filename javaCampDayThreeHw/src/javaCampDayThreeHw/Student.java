package javaCampDayThreeHw;

public class Student extends User{
	private String studentNo;

	public Student(int id, String firstName, String lastName, String email, String studentNo) {
		super(id, firstName, lastName, email);
		this.studentNo = studentNo;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
}
