package exam01;

public class KoreanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("박자바", "123124-1231251");
		Korean k2 = new Korean("김자바", "933124-1231251");
		if (k1 == k2) { //주소값 k1 k2
			System.out.println("k1과 k2는 같아요.");
		} else {
			System.out.println("k1과 k2는 달라요"); // 주소값이 다름
		}
		
		System.out.println(k1);
		System.out.println(k2);

		System.out.println(k1.nation); // 필드에서 초기화 된 부분
		System.out.println(k1.name); // 생성자에 초기화
		System.out.println(k1.ssn); // 생성자에 초기화

		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		System.out.println("------------------------------------------------------------");

		Korean k3 = new Korean(); // new 하면 heap영역에 새로 만들기 때문에 주소값이 달라진다.
		Korean k4 = new Korean();
		if (k3 == k4) { //주소값 k1 k2
			System.out.println("k3과 k4는 같아요.");
		} else {
			System.out.println("k3과 k4는 달라요"); // 주소값이 다름
		}
		System.out.println(k3);
		System.out.println(k3.nation);
		System.out.println(k3.name);
		System.out.println(k3.ssn);
		System.out.println(k4);
		System.out.println(k4.nation);
		System.out.println(k4.name);
		System.out.println(k4.ssn);
		
		
		
		
		
		
	}

}
