package exam03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class StringWriteTest {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test7.txt");
		Reader reader = new FileReader("C:/Temp/test7.txt");

		char a = 'A';
		char b = 'B';
		char c = 'C';
		char[] array = { 'a', 'b', 'c' };
		String str = "안녕 자바";

		writer.write(a);
		writer.write(b);
		writer.write(c);
		writer.write(array);
		writer.write(array, 1, 2);
		writer.write(str);

		writer.close();

		while (true) {
			int data = reader.read();
			if (data == -1)
				break;
			System.out.print((char) data);
		}
//----------------------------------------------------------------------------------------------
		System.out.println();
		reader = new FileReader("C:/Temp/test7.txt"); // Stream은 1회용이므로 reader 다시 선언
		char[] buffer = new char[100];
		while (true) {
//			int readCharNum = reader.read(buffer,2,3);
			int readCharNum = reader.read(buffer, 9, 8);

			if (readCharNum == -1)
				break;
			for (int i = 0; i < buffer.length; i++) {
				System.out.print(buffer[i]);
			}
			System.out.println();
			System.out.println("readCharNum : " + readCharNum);
		}
		reader.close();
	}

}
