package exam05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class BytesFileCopier {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("대상파일 : ");
		String src = scanner.nextLine();

		System.out.print("사본파일 : ");
		String dst = scanner.nextLine();
		long beforeTime = System.currentTimeMillis();
		// try ~ Resource 구문 : 자원을 알아서 해제
		try (InputStream in = new FileInputStream(src);
			 OutputStream out = new FileOutputStream(dst)) {

			int data;
			while (true) {
				data = in.read();
				if (data == -1) {
					break;
				}
				out.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		long afterTime = System.currentTimeMillis(); 
		long secDiffTime = (afterTime - beforeTime);
		System.out.println("시간차이 : "+secDiffTime);
		
		
//		
//		long beforeTime = System.currentTimeMillis();
//		// buffer를 써서 read
//		try (InputStream in = new FileInputStream(src); OutputStream out = new FileOutputStream(dst)) {
//
//			byte buf[] = new byte[1024];
//			int len;
//			while (true) {
//				len = in.read(buf);
//				if (len == -1) {
//					break;
//				}
//				out.write(buf, 0, len);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		long afterTime = System.currentTimeMillis(); 
//		long secDiffTime = (afterTime - beforeTime);
//		System.out.println("시간차이 : "+secDiffTime);
	}
}
