package java_exam_04;

public class StudentTest {

	public static void main(String[] args) {
		Person student1 = new Person("김자바", 22);
		Student student2 = new Student("이자바", 23, 200);
		ForeignStudent student3 = new ForeignStudent("강자바", 25, 200, "대한민국");
		
//		student1.show();
//		student2.show();
//		student3.show();
		
		Person[] list = new Person[3];
		list[0] = student1; //참조변수 주소값이 들어감
		list[1] = student2;
		list[2] = student3;
		
		for (Person person : list) { // 다형성, 타입 3개를 Person 타입 하나로 
			person.show(); 
		}

	}

}
