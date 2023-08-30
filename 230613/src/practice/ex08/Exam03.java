package practice.ex08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//03. 5개의 double 타입 숫자로 구성된 배열을 사용해 다음 작업을 수행하는 프로그램을 작성하시오.
//
//- 배열의 모든 원소를 C:/Temp/double.txt파일에 DataOutputStream을 사용해 저장한다.
//- 저장된 숫자를 DataInputStream을 사용해 읽은 후 화면에 출력한다.
public class Exam03 {
	public static void main(String[] args) throws Exception {

		double[] d5 = { 10.1, 15.4, 9.7, 81.9, 41.2 };
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:/Temp/double.txt"))) {
			for (double d : d5) {
				dos.writeDouble(d);
				System.out.println(d);
			}
			System.out.println("C:/Temp/double.txt 파일에 저장했습니다.");
		}
		
		try (DataInputStream dis = new DataInputStream(new FileInputStream("C:/Temp/double.txt"))) {
//			for (int i = 0; i < d5.length; i++) {
//				System.out.println(dis.readDouble());
//			}
			while (dis.available() > 0) {
				System.out.println(dis.readDouble());
			}
		}

	}
}
