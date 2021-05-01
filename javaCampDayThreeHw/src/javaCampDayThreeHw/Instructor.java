package javaCampDayThreeHw;

public class Instructor extends User{
	private String instructorNumber;
	
	public Instructor(int id, String firstName, String lastName, String email, String instructorNumber) {
		super(id, firstName, lastName, email);
		this.instructorNumber = instructorNumber;
	}

}
