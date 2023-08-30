package exam05;

import java.util.List;
import java.util.Vector;

public class BoardTest {
	public static void main(String[] args) {
		List<Board> list = new Vector();

		list.add(new Board("title1", "content1", "writer1"));
		list.add(new Board("title2", "content2", "writer2"));
		list.add(new Board("title3", "content3", "writer3"));
		list.add(new Board("title4", "content4", "writer4"));
		list.add(new Board("title5", "content5", "writer5"));

		for (Board b : list) {
			System.out.println(b);
		}
		System.out.println();

		list.remove(2);
		list.remove(3);
		list.remove("title2"); // <Board>가 객체여서 안지워짐

		for (Board b : list) {
			System.out.println(b);
		}
	}
}
