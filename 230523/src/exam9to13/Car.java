package exam9to13;

// ctrl+shift+o 
import exam9to13.hankook.SnowTire;
import exam9to13.hankook.Tire;
import exam9to13.hyundai.Engine;
import exam9to13.kumho.BigWireTire;

public class Car {
	public static void main(String[] args) {

		Engine engine = new Engine();
//		engine.engineType();
//		int a = engine.a;
		SnowTire snowTire = new SnowTire();
		BigWireTire bigWireTire = new BigWireTire();
		Tire tire = new Tire();

//		int count = tire;	// private 멤버
		int count = tire.getCount(); // getXXX() 만들어서 꺼내기
		tire.setCount(10); // 바퀴가 4개
		System.out.println(tire.getCount());
		exam9to13.kumho.Tire tire2 = new exam9to13.kumho.Tire();
	}
}