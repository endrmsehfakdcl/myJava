package exam01;

class Box {
	private String contents;
	private int boxNum;

	Box(int num, String cont) {
		boxNum = num;
		contents = cont;
	}

	public int getBoxNum() {
		return boxNum;
	}

	public String toString() {
		return contents;
	}
}

public class EnhancedFor {
	public static void main(String[] args) {
		Box[] boxArr = new Box[5];
		boxArr[0] = new Box(100, "coffee");
		boxArr[1] = new Box(101, "banana");
		boxArr[2] = new Box(102, "apple");
		boxArr[3] = new Box(103, "orange");
		boxArr[4] = new Box(104, "kiwi");
		for (Box b : boxArr) {
			if (b.getBoxNum() == 103) {
				System.out.println(b.toString());
			}
		}

	}

}
