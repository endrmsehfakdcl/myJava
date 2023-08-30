package exam01;

public class Ex02 {

	public static void main(String[] args) {
		int var01 = 15;
		
		if (var01 > 10) {
			int var02 = 0;
			var02 += var01;
			System.out.println("var02 += var01 : " + var02);
		}
		
		for (int i=0 ; i <= 10; i++) {
			int var03 = i;
			var01 += var03;
			System.out.println(i + " " +var01);
		}
		
		System.out.println(var01);
		
	}

}
