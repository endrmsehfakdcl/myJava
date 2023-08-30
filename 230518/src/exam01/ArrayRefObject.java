package exam01;

public class ArrayRefObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = new String[3] ;
		strArr[0] = "Good";
		strArr[1] = "Good";
		strArr[2] = new String("Good");
		
		System.out.println(strArr[1] == strArr[0]);
		System.out.println(strArr[1] == strArr[2]);
		System.out.println(strArr[0] == strArr[2]);
		
		System.out.println(strArr[0].equals(strArr[1]));
		System.out.println(strArr[0].equals(strArr[2]));
		System.out.println(strArr[2].equals(strArr[1]));
		
	}

}
