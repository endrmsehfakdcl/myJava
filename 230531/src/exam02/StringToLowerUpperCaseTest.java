package exam02;

public class StringToLowerUpperCaseTest {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";

		System.out.println(str1.equals(str2));

		String toUpper1 = str1.toUpperCase();
		String toUpper2 = str2.toUpperCase();

		System.out.println(toUpper1.equals(toUpper2));

		System.out.println(str1.equalsIgnoreCase(str2));

		str1 = "      02      ";
		str2 = "123    ";
		String str3 = "            1234";

		String tel = str1 + str2 + str3; // trim 문자열 공백제거
		System.out.println(tel);
		tel = str1.trim() + str2.trim() + str3.trim();
		System.out.println(tel);

		String str4 = String.valueOf(3.141592);
		System.out.println(str4);

	}

}
