package exam07;

interface NewObject<T> {
	T getObject(T o);
}

interface NewArray<T> {
	T[] getArray(int size);
}

public class ConstructorRefTest {
	public static void main(String[] args) {
		NewObject<String> s;
		NewArray<Integer> i;

//		s = x -> new String(x);
		s = String::new; // 생성자 참조
		String str = s.getObject("사과");

//		i = x -> new Integer[x];
		i = Integer[]::new;
		Integer[] array = i.getArray(2);
		array[0] = 100;
		array[1] = 200;
		
		System.out.println(str);
		System.out.println(array[1]);

	}
}
