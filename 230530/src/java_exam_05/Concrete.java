package java_exam_05;

public class Concrete extends Abstract {

	public int j;

	Concrete(int i, int j) {
		super(i);
		this.j = j;
	}

	public void show() {
		System.out.println("i = " + i + ", j = " + j);
	}
}
