package exam01;

public class Korean {
	//필드
	String nation = "대한민국"; // 생성자가 아닌 필드에서 특정값으로 초기화
	String name;
	String ssn;
	
//	//생성자
//	public Korean(String n, String s) {
//		name = n;
//		ssn = s;
//	}
	
	Korean(){}
	
	
	//생성자 변수명// 필드와 매개변수 이름이 동일할 때 this.
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}


