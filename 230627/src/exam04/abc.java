package exam04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class abc {

	public static void main(String[] args) {

		Reader reader;
		String result = "";
		String[] strArray = new String[0];
		StudentStatus sStatus = new StudentStatus();
		List<StudentStatus> list = new ArrayList<>();

		try {
			reader = new FileReader("C:/C_it/data/abc1115.txt");
			BufferedReader br = new BufferedReader(reader);

			while (true) {
				result = br.readLine();
				if (result == null) {
					break;
				} else {
					int studentId = Integer.parseInt(result.substring(0, 6));
					String email = result.substring(6, 10);
					int kScore = Integer.parseInt(result.substring(10, 13).trim());
					int eScore = Integer.parseInt(result.substring(13, 16).trim());
					int mScore = Integer.parseInt(result.substring(16, 19).trim());
					int sScore = Integer.parseInt(result.substring(19, 22).trim());
					int hScore = Integer.parseInt(result.substring(22, 25).trim());
					int totalScore = Integer.parseInt(result.substring(25, 28).trim());
					String tCode = result.substring(28, 29);
					String achivement = result.substring(29, 30);
					String locationCode = result.substring(30, 31);

					StudentStatus stStatus = new StudentStatus(studentId, email, kScore, eScore, mScore, sScore, hScore,
							totalScore, tCode, achivement, locationCode);
					list.add(stStatus);
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일 로딩 에러");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력 에러");
			e.printStackTrace();
		}

//		문제1) 지역코드가 B인 자료에 대하여 (국어점수+영어점수) 으로 내림차순 정렬했을 때
//		5번째 학번 출력하시오. 동일값 발생시 학번에 대한 오름차순 정렬하시오.
//		(※결과 값은 수검자의 파일에 출력되도록 프로그램을 작성할 것 PC C:\C_it\data\Ans1.txt )
		List<StudentStatus> sortedList = 
				list.stream()
				.filter(i -> i.getLocationCode().equals("B"))
				.sorted(Comparator.comparing(StudentStatus::sumKEscore, Comparator.reverseOrder()).thenComparing(StudentStatus::getStudentId))
				.collect(Collectors.toList());
		
		StudentStatus fifthStudent = sortedList.get(4);
		
//		try {
//			FileOutputStream os = new FileOutputStream("C:/C_it/data/Ans1.txt");
//			BufferedOutputStream bo = new BufferedOutputStream(os);
//			os.write(fifthStudent.getStudentId());
//			os.flush();
//			os.close();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try {
			Writer writer = new FileWriter("C:\\C_it\\data\\Ans1.txt");
			BufferedWriter bw = new BufferedWriter(writer);
			String studentIdAsString = String.valueOf(fifthStudent.getStudentId());
			bw.write(studentIdAsString);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		문제2 지역코드가 B인 자료들 중, 국어점수+영어점수가 최대인 값을 출력하여라. 자료가 중복 될 경우 한 개만 출력한다
//		C:\C_it\data\Ans2.txt 파일에 출력한다.
		
		List<StudentStatus> MaxSumKEscore = list.stream()
		.filter(i -> i.getLocationCode().equals("B"))
		.sorted(Comparator.comparing(StudentStatus::sumKEscore, Comparator.reverseOrder()))
		.distinct()
		.limit(1).collect(Collectors.toList());
		
	
		try {
			Writer writer = new FileWriter("C:\\C_it\\data\\Ans2.txt");
			BufferedWriter bw = new BufferedWriter(writer);
			String ans2 = String.valueOf(MaxSumKEscore.get(0).sumKEscore());
			bw.write(ans2);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		문제3 영어점수+수학점수가 120점 이상인 학생의 (총점 + 점수포인트) 를 출력하시오. 담임코드가 A = 5, B = 15, C = 20 이 점수 포인트이다.
//		C:\C_it\data\Ans3.txt 파일에 출력한다.
		List<StudentStatus> answer3List = list.stream()
				.filter(i -> i.geteScore() + i.getmScore() > 120)
				.collect(Collectors.toList());
		List<Integer> sumTotalandPointList = new ArrayList<>();
		
		for(StudentStatus ss : answer3List ) {
			if(ss.gettCode().equals("A")) {
				sumTotalandPointList.add(ss.getTotalScore() + 5);
			}else if(ss.gettCode().equals("B")) {
				sumTotalandPointList.add(ss.getTotalScore() + 15);
			}else if(ss.gettCode().equals("C")) {
				sumTotalandPointList.add(ss.getTotalScore() + 20);
			}
		}
		
		try {
			Writer writer = new FileWriter("C:\\C_it\\data\\Ans3.txt");
			BufferedWriter bw = new BufferedWriter(writer);
			for(Integer l : sumTotalandPointList ) {
				String result3 = String.valueOf(l);
				bw.write(result3 + "\n");
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		문제 4. 성취도가 A | B 인 자료에 대해 (국어점수+ 점수포인트) > 50 이상인 자료를 출력
//		점수포인트는 지역코드를 기준으로 "A"=5, "B"=10, "C"=15 의 값을 가진다.
//		C:\C_it\data\Ans4.txt 에 출력.
		
		List<Integer> ans4 =
		list.stream()
		.filter(answer4list -> answer4list.getAchivement().equals("A") || answer4list.getAchivement().equals("B"))
		.map(answer4list -> {
			if (answer4list.getLocationCode().equals("A")) {
				return answer4list.getkScore() + 5;
			}else if(answer4list.getLocationCode().equals("B")) {
				return answer4list.geteScore() + 10;
			}else if(answer4list.getLocationCode().equals("C")) {
				return answer4list.geteScore() + 15;
			}
			return answer4list.getsScore();
		})
		.collect(Collectors.toList());
		
		try {
			Writer writer = new FileWriter("c:/c_it/data/Ans4.txt");
			BufferedWriter bw = new BufferedWriter(writer);
			for (Integer a : ans4) {
				String an4Result = String.valueOf(a);
				bw.write(an4Result + "\n");
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
