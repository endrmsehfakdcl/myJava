package exam02;

public class CatchByExceptionKindTest {

	public static void main(String[] args) {

		try {
			String data1 = args[0]; // 입력
			String data2 = args[1];

			int num1 = Integer.parseInt(data1); // 정수로 변환
			int num2 = Integer.parseInt(data2);

		} catch (NumberFormatException e) { // 드래그 alt + shift + z -> try/catch block
			System.out.println("숫자로 변환이 불가합니다.");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("매개 값을 두 개 넣어주세요.");
		} catch (Exception e) { // 전체 Exception
			System.out.println("비정상 수행");
		} finally { // finally
			System.out.println("다시 실행하세요.");
		}

	}

}
