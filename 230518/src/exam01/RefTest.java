package exam01;

public class RefTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "kim";
		String str2 = "kim";
		
		if(str1 == str2) { 
			System.out.println("str1과 str2는 같은 참조번지를 가짐");
		}
		else {
			System.out.println("str1과 str2는 다른 참조번지를 가짐");
		}
		
		if (str1.equals(str2)) {
			System.out.println("str1과 str2는 내용이 같음");
		}
		else {
			System.out.println("str1과 str2는 내용이 다름");
		}
//		--------------------------------------------------------------------
		String str3 = new String("kim");
		
		if (str1 == str3){
			System.out.println("str1과 str3는 같은 참조번지를 가짐");
		}
		else {
			System.out.println("str1과 str3는 다른 참조번지를 가짐");
		}
		if (str1.equals(str3)) {
			System.out.println("str1과 str3는 내용이 같음");
		}
		else {
			System.out.println("str1과 str3는 내용이 다른");
		}
//		---------------------------------------------------------------------
		String hobby = null;
		hobby = "여행";
		int n = hobby.length(); // NullPointerException
		System.out.println(n);
	}

}
