package exam01;

public class ResourcePathTest {

	public static void main(String[] args) {
		Class clazz = Key.class;
		String path1 = clazz.getResource("photo1.jpg").getPath();
		String path2 = clazz.getResource("images/photo2.jpg").getPath();
		
		System.out.println(path1);
		System.out.println(path2);
	}

}
