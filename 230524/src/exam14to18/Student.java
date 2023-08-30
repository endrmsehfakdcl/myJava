package exam14to18;

public class Student extends People {
	public int stdNo;
	
	public Student(String name, String ssn, int stdNo) {
		super(name, ssn);
		this.stdNo = stdNo;
	}
}
