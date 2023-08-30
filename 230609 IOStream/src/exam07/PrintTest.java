package exam07;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.Reader;

public class PrintTest {
	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("C:/Temp/printStream.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[프린트 보조 스트림]");
		ps.println("마치 ");
		ps.println("프린터가 출력하는 것 처럼 ");
		ps.println("데이터를 출력합니다. ");
		ps.println("오호~ ");
		ps.close();
		
		Reader reader = new FileReader("C:/Temp/printStream.txt");
		char[] buffer = new char[100];
		while(true) {
			int charNum = reader.read(buffer);
			if(charNum == -1) break;
			for( int i =0 ; i<buffer.length ; i ++) {
				System.out.print(buffer[i]);
			}
		}
		
	}
}
