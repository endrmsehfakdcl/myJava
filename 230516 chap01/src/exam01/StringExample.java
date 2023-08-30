package exam01;

public class StringExample {

	public static void main(String[] args) {
		char var01 = 'A';
		char var02 = 65; 
		char var03 = '\u0041'; // \u0041 > 유니코드
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);

		String name = "\"홍길동\""; // \" 이스케이프
		String job = "프로그래머";
//		String a01 = 'a' ; 
		System.out.println(name);
		System.out.println(job);
		
//		int a = (int) 5e2;
//		System.out.println(a);
//		double b = (double) 0.12e-2;
//		System.out.println(b);

		float var12 = 3.14f;
		double var22 = 3.14; // double이 실수 기본형
		int var32 = 30;

		var32 = var01 ;
		System.out.println(var32);
		var22 = var01 ;
		System.out.println(var22);
		var12 = var01 ;
		System.out.println(var12);
		
		byte byteValue = 65;
		System.out.println(byteValue);
//		var01 = byteValue;
		
		//casting 강제 타입 변환
		byteValue = (byte) var32; // int -> byte
		System.out.println(byteValue);
		
		// int(4byte -> char(2byte
		var01 = (char) var32 ;
		
		//double -> int
		var22 = 3.141592;
		System.out.println(var22); // 3.141592
		var32 = (int) var22 ;
		System.out.println(var32); // 3
		
	}

}





