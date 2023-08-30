package exam14to18;

public abstract class Animal { // new로 못씀 
	public String kind;
	
	public void breath() {
		System.out.println("숨을 쉽니다");
	}
	
	public abstract void sound(); //하나라도 추상 메소드가 있으면 추상이다.
}
