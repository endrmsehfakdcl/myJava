package exam14to18;

public class UpcastTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p;
		Student2 s = new Student2();
		Person p2 = new Person();
		
		p = s;
		s = (Student2) p; // 강제 형변환, 명시적 형변환
		
//		Student2 s2 = new Person(); //Cannot convert Person to Student2
		s = (Student2)p2;
		
		p.whoami();
//		p.work(); //undefined for type Person
		s.whoami();
		s.work();
	}

}
