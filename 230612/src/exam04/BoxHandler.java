package exam04;

public class BoxHandler {
	public static void outBox(Box<? extends Toy> box) {
		Toy t = box.getObj();
		System.out.println(t);
//		box.setObj(t); // set을 못하게 ? extends Toy // get만 가능하도록
	}
	public static void inBox(Box<? super Toy> box, Toy n) {
		box.setObj(n);
//		Toy t = box.getObj(n); super로 제한을 걸었다. 컴파일러가 에러를 내도록 // 코드의 안정성을 살리기위한 와일드카드
	}
}
