package exam9to13;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123456-1234567", "홍길동");
//		p1.nation = "usa"; 			//The final field Person.nation cannot be assigned
//		p1.ssn = "123456-2345678";	//The final field Person.ssn cannot be assigned
		p1.name = "김자바";
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
	}

}
