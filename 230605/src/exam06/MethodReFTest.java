package exam06;

@FunctionalInterface
interface Mathematical {
	double calculator(double d);
}

@FunctionalInterface
interface Pickable {
	char pick(String s, int i);
}

@FunctionalInterface
interface Computable {
	int compute(int x, int y);
}

class Utils {
	int add(int a, int b) {
		return a + b;
	}
}

class Box {
	int no;

	public Box(int no) {
		this.no = no;
	}

	boolean isSame(Box b) {
		return this.no == b.no;
	}
}

interface Applyable {
	boolean apply(Box a, Box b);
}

public class MethodReFTest {
	public static void main(String[] args) {
		Mathematical m;
		Pickable p;
		Computable c;

//		m = d -> Math.abs(d);
		m = Math::abs;
		System.out.println(m.calculator(-50.9));

//		p = (a, b) -> a.charAt(b);
		p = String::charAt;
		char cha = p.pick("안녕, 인스턴스 메소드 참조", 4);
		System.out.println(cha);

		Utils utils = new Utils();
//		c = (a,b) -> utils.add(a, b);
		c = utils::add;
		System.out.println(c.compute(50, 60));

		Applyable app;
//		app = (a, b) -> a.isSame(b);
		app = Box::isSame; // 메소드 참조 type::method
		System.out.println(app.apply(new Box(1), new Box(2)));
		System.out.println(app.apply(new Box(1), new Box(1)));

	}
}
