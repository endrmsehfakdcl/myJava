package exam04;

public class BoundedWildcardBase {
	public static void main(String[] args) {
		Box<Toy> box = new Box();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
	}
}
