package java_exam_05;

public class HumanTest {

	public static void main(String[] args) {
		Human.echo();
		
		Student student = new Student();
		student.print();
		student.eat();
		
		Worker worker = new Worker();
		worker.print();
		worker.eat();
	}

}
