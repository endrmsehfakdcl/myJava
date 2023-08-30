package exam05;

import java.util.Arrays;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle[] rectangles = { new Rectangle(3, 5), new Rectangle(2, 10), new Rectangle(5, 5) };
		
		Arrays.sort(rectangles);
		
		for (Rectangle r : rectangles) {
			System.out.println(r);
		}
	}
}
