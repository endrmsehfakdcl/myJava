package exam14to18;

public class InstanceOf {
	public static void main(String[] args) {
		Student2 s = new Student2();
		Person p = new Person();
		Person p1 = new Student2();
		
		method1(p1);
		method2(p1);

		method1(p);
		method2(p);
		
		System.out.println(s instanceof Person);
		System.out.println(s instanceof Student2);
		System.out.println(p instanceof Student2); // Student2 extends Person
		System.out.println(p instanceof Person);

		
	}

	public static void method1(Person p) {
		if (p instanceof Student2) { // 상속관계 true인 경우에만 형변환
			Student2 s = (Student2) p;
			System.out.println("method1 - Student2 로 변환함.");
		} else {
			System.out.println("method1 - 변환불가");
		}
	}

	public static void method2(Person p) {
		Student2 s = (Student2) p;
		System.out.println("method2 - Student2로 변환함");
	}

}
