package exam01;

import java.util.Date;

public class ToString {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date(); // ctrl + shift + o
		Key obj3 = new Key(1);
		SmartPhone obj4 = new SmartPhone("구글", "안드로읻"	);
		
		
		System.out.println(obj1); // java.lang.Object@1c4af82c
		System.out.println(obj2); // Wed May 31 11:31:29 KST 2023
		System.out.println(obj3); // exam01.Key@1
		
		System.out.println(obj4);
		String str = obj4.toString();
		System.out.println(str);

	}
}
