package exam14to18;

public class Mammal extends Animal {

	// 필드

	// 생성자

	Mammal() {

		super("사자");
		System.out.println("포유류 : 사자");
	}

	Mammal(String s) {
		super(s);
		System.out.println("포유류 : " + s);
	}
}
