package java_exam_03;

public class TriangleTest {

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		Triangle triangle2 = new Triangle();

		triangle.setBase(5.0);
		triangle.setHeight(5.0);

		triangle2.setBase(6.0);
		triangle2.setHeight(6.0);

		System.out.println("triangle1의 넓이 : " + triangle.findArea(triangle.getBase(), triangle.getHeight()));
		System.out.println("triangle2의 넓이 : " + triangle2.findArea(triangle2.getBase(), triangle2.getHeight()));

		double triangleArea = triangle.findArea(triangle.getBase(), triangle.getHeight());
		double triangleArea2 = triangle2.findArea(triangle2.getBase(), triangle2.getHeight());

		if (triangle.isSameArea(triangleArea, triangleArea2)) {
			System.out.println("두 삼각형의 넓이가 동일합니다.");
		} else {
			System.out.println("두 삼각형의 넓이가 동일하지 않습니다.");
		}

	}

}
