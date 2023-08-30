package practice.ex08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//02. BufferdReader클래스의 readLine() 메서드를 
//\사용해 키보드에서 행 단위로 읽은 후 화면에 출력하는 프로그램을 작성하시오.
//Hint) 키보드는 표준 입력 장치이므로 InputStream타입의 System.in 객체를 사용한다. 
//InputStream을 Reader타입으로 변환하려면 InputStreamReader클래스를 사용하면 된다.
public class Exam02 {
	public static void main(String[] args) throws Exception {
		while (true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("행 단위로 읽은 후 화면에 출력합니다.");
			System.out.println(br.readLine());
		}
	}
}
