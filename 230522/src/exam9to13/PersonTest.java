package exam9to13;

public class PersonTest {

	public static void main(String[] args) {
		Person person1 = new Person("aaa", "1234567-12345678", 1234567);
		Person person2 = new Person("bbb", "2345678-23456789");

		person1.showInfo();
		System.out.println("----------------------------------------------------");
		person2.showInfo();
	}
}
