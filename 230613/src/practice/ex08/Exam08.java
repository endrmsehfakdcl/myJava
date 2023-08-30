package practice.ex08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//08. 주어진 단어를 문자 하나씩 추측해서 맞추는 행맨(hangman) 프로그램을 작성하시오. 
//처음에는 단어에 포함된 문자의 갯수만큼 빈칸이 나타나며, 
//사용자는 빈칸에 들어갈 문자를 하나씩 추측한다. 
//추측한 문자가 맞으면 빈칸 대신 맞춘 문자를 출력한다. 
//프로그램에서 사용할 문자열은 10개의 단어로 구성된 
//C:/Temp/words.txt파일에 있는 문자열 중 무작위로 선택한다. 
//여섯 번을 초과해서 잘못된 추측을 하면 게임이 종료된다. 
//다음은 최초 화면과 하나의 문자를 맞춘 실행 결과이다.
//
//== 실핼 결과 ==
//추측할 단어입니다 : -----
//지금까지 추측한 내용입니다 :
//추측한 문자를 입력하세요 : a
//정확한 추측입니다. - 6번을 더 추측할 수 있습니다.
//추측할 단어입니다 : ---a-
//지금까지 추측한 내용입니다 : a
//추측한 문자를 입력하세요 :
//
public class Exam08 {
	public static void main(String[] args) throws Exception {

		String filePath = "C:/Temp/words.txt";
		int lifeStock = 6;
		try (Scanner scanner = new Scanner(System.in)) {
			List<String> list = new ArrayList<>();
			try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
				while (true) {
					String oneLine = br.readLine();
					if (oneLine == null)
						break;
					list.add(oneLine);
				}
			}

			Random random = new Random();
			int randomLineNum = random.nextInt(list.size());
			String hangmanQuiz = list.get(randomLineNum);
			String guessString = "-".repeat(hangmanQuiz.length());
			char guess = ' ';
			String guessStory = " ";
			StringBuilder stringBuilder = new StringBuilder(guessString);

//		for (Object s : list.toArray()) {
//			System.out.println(s);
//		}
//			System.out.println(hangmanQuiz);

			while (lifeStock > 0) {
				if (hangmanQuiz.equals(guessString)) {
					break;
				}
				HangmanAscii.draw(lifeStock);
				System.out.println("추측할 단어입니다 : " + guessString);
				System.out.println("지금까지 추측한 내용입니다 :" + guessStory);
				System.out.print("추측한 문자를 입력하세요 : ");
				guess = scanner.nextLine().charAt(0);
				guessStory = guessStory + " " + guess;

				if (hangmanQuiz.contains(String.valueOf(guess))) {
					System.out.println("정확한 추측입니다. - " + lifeStock + "번을 더 추측할 수 있습니다.");
					for (int i = 0; i < hangmanQuiz.length(); i++) {
						if (guess == hangmanQuiz.charAt(i)) {
							stringBuilder.setCharAt(i, guess);
							guessString = stringBuilder.toString();
						}
						if (hangmanQuiz.equals(guessString)) {
							System.out.println("문자를 맞추셨습니다. 정답은" + hangmanQuiz + "입니다.");
							break;
						}
					}
				} else {
					lifeStock--;
					if (lifeStock == 0) {
						HangmanAscii.draw(lifeStock);
						System.out.println("틀린 추측입니다. - 더 이상 추측할 수 없습니다.");
						break;
					} else {
						System.out.println("틀린 추측입니다. - " + lifeStock + "번을 더 추측할 수 있습니다.");
					}
				}

			}
		}

	}
}
