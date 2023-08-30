package exam01;

public class StudentTest { //실행 객체 / 실행 클래스

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		System.out.println(s1);

		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		System.out.println(s2);
		
		Ball b1 = new Ball();
		System.out.println(b1.getVolumn()); 		
	}

}
