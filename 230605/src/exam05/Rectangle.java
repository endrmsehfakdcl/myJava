package exam05;

public class Rectangle implements Comparable<Rectangle> {
	private int height;
	private int width;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}

	public int findArea() {
		return height * width;
	}

	@Override
	public int compareTo(Rectangle o) {
		return findArea() - o.findArea();
	}

}
