package exam01;


/*
 *  여러 줄 주석은 이렇게 사용한다.
 */

public class Ex01 {
	
	public static void a01() {
		b01();
		String v01 = "a01입니다"; // 타입을 지켜줘야 한다.
		System.out.println(v01);
	}
	
	public static void b01( ) {
		int v01 = 100;
		System.out.println("b01()입니다.");
		System.out.println("v01은 " + v01 + "입니다.");
	}
	
//	자바는 메인 메소드를 찾아서 실행한다.
	public static void main(String[] args) {
		//System.out.println(); sysout + ctrl + spacebar
		System.out.println("Hello world~");	
		
//		type variable;
//		타입  변수명
		int x;
		x = 100; // 연산 참여 할 때는 초기값
		int y = 200;
		int result= x + y;
		
		System.out.println("x + y = " + result); //x + y = 300
		System.out.println(x + "+" + y + "=" + result); //100+200=300
		
		a01(); // a01 메소드 호출
		System.out.println("main 메소드입니다.");
	}

}
