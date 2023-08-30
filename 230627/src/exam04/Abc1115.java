package exam04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class Abc1115 {
	public static void main(String[] args) throws Exception {

		String Path = "C:/C_it/data/abc1115.txt";
		String resultPath1 = "C:/C_it/data/Ans1.txt";
		String resultPath2 = "C:/C_it/data/Ans2.txt";
		String resultPath3 = "C:/C_it/data/Ans3.txt";
		String resultPath4 = "C:/C_it/data/Ans4.txt";

		BufferedReader bf = new BufferedReader(new FileReader(Path));
		List<String> numList = new ArrayList<>();
		List<Integer> korList = new ArrayList<>();
		List<Integer> engList = new ArrayList<>();
		List<Integer> korEngList = new ArrayList<>();
		List<Integer> engMathList = new ArrayList<>();
		List<Character> damList = new ArrayList<>();
		List<Character> sungList = new ArrayList<>();
		List<Character> jiList = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap<>();

		while (true) {
			String str = bf.readLine();
			if (str == null)
				break;
			if (str.substring(30).equals("B")) {
				String num = str.substring(0, 6);
				int kor = Integer.parseInt(str.substring(10, 13).trim());
				int eng = Integer.parseInt(str.substring(13, 16).trim());
				int math = Integer.parseInt(str.substring(16, 19).trim());
				int korEngSum = kor + eng;
				int engMathSum = eng + math;
				char dam = str.substring(28).charAt(0);
				char sung = str.substring(29).charAt(0);
				char ji = str.substring(30).charAt(0);

				numList.add(num);
				korList.add(kor);
				engList.add(eng);
				korEngList.add(korEngSum);
				engMathList.add(engMathSum);
				damList.add(str.substring(28).charAt(0));
				sungList.add(str.substring(29).charAt(0));
				jiList.add(str.substring(30).charAt(0));
				map.put(num, korEngSum);
			}
		}
		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
		LinkedHashMap<String, Integer> linkedmap = new LinkedHashMap<>();
		// value값으로 내림차순 정렬한 것을 thenComparing 사용해서 value값이 동일한 경우 key값을 오름차순 정렬한다.
		entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return o2.getValue() - o1.getValue();
			}
		}.thenComparing(new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		}));

		// 람다식을 사용하면 3줄 요약
//		entryList.sort(Comparator.comparing(Map.Entry<String, Integer>::getValue)
//		        .reversed()
//		        .thenComparing(Comparator.comparing(Map.Entry<String, Integer>::getKey)));

		int count = 0;
		int Ans2 = 0;
		String Ans1 = "";
		for (Map.Entry<String, Integer> entry : entryList) {
			linkedmap.put(entry.getKey(), entry.getValue());
			count++;
			if (count == 1) {
				Ans2 = entry.getValue();
			}
			if (count == 5) {
				Ans1 = entry.getKey();
			}
		}
//		System.out.println(linkedmap);
//		System.out.println(Ans1);
//		System.out.println(Ans2);

		try (FileWriter writer = new FileWriter(resultPath1)) {
			writer.write(Ans1);
		}

//		public void write​(int c) throws IOException
//		Writes a single character. The character to be written is contained in the 16 low-order bits of the given integer value; the 16 high-order bits are ignored.
//		Subclasses that intend to support efficient single-character output should override this method.
		// result = À
//		try (FileWriter writer2 = new FileWriter(resultPath2)) {
//			writer2.write(Ans2);
//		}

		try (FileWriter writer2 = new FileWriter(resultPath2)) {
			writer2.write(String.valueOf(Ans2));
		}

		// ------------------------------------------------------------------------------------------------------
		int Ans3 = 0;
		BufferedReader bf3 = new BufferedReader(new FileReader(Path));
		while (true) {
			String str = bf3.readLine();
			if (str == null)
				break;
			if (Integer.parseInt(str.substring(13, 16).trim())
					+ Integer.parseInt(str.substring(16, 19).trim()) >= 120) {
				char dam = str.substring(28).charAt(0);
				int damScore = 0;
				if (dam == 'A') {
					damScore = 5;
				} else if (dam == 'B') {
					damScore = 15;
				} else if (dam == 'C') {
					damScore = 20;
				}
				int eng = Integer.parseInt(str.substring(13, 16).trim());
				int math = Integer.parseInt(str.substring(16, 19).trim());
				Ans3 = Ans3 + eng + math + damScore;
			}
		}

		try (FileWriter writer3 = new FileWriter(resultPath3)) {
			writer3.write(String.valueOf(Ans3));
		}

		int Ans4 = 0;
		BufferedReader bf4 = new BufferedReader(new FileReader(Path));
		while (true) {
			String str = bf4.readLine();
			if (str == null)
				break;
			char ji = str.substring(28).charAt(0);
			int jiScore = 0;
			if (ji == 'A') {
				jiScore = 5;
			} else if (ji == 'B') {
				jiScore = 10;
			} else if (ji == 'C') {
				jiScore = 15;
			}
			char sung = str.substring(29).charAt(0);
			int kor = Integer.parseInt(str.substring(10, 13).trim());
			int korJi = kor + jiScore;
			if (((sung == 'A') || (sung == 'B')) && (korJi) >= 50) {
//				System.out.println(sung + ", " + kor + ", " + jiScore + ", " + korJi);
				Ans4++;
			}

		}
//		System.out.println(Ans4);

		try (FileWriter writer4 = new FileWriter(resultPath4)) {
			writer4.write(String.valueOf(Ans4));
		}
	}
}
