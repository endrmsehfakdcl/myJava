package java_exam_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
08. 다음은 Collections 클래스의 메서드를 테스트하는 프로그램이다. 
다음과 같이 실행 결과가 나타나도록 테스트 프로그램을 작성하라.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] s = {"독수리", "고양이", "강아지"};

        ________________________________;
        System.out.println(list);

        List<String> all = new ArrayList<>(list);
        System.out.println("nCopies(nCopies) : " +all);

        ________________________________;
        System.out.println("'벌'을 채운 후(fill) : " + all);

        ________________________________;
        System.out.println("리스트를 모두 추가한 후(addAll) : " + all);
        
        ________________________________;
        System.out.println("리스트를 섞은 후(shuffle) : " + all);
        
        ________________________________;
        System.out.println("리스트를 역순으로 정렬한 후(reverse) : " + all);

        System.out.println("리스트에서 최소(min) : " + _________________);
        System.out.println("리스트에서 최대(max) : " + _________________);
        System.out.println("리스트에서 '벌'의 빈도(frequency) : " + _________________);
    }
}

[개미, 개미]
nCopies [개미, 개미]
'벌'을 채운 후 : [벌, 벌]
addAll : [벌, 벌, 독수리, 고양이, 강아지]
*/
public class Exam08 {

	public static void main(String[] args) {
		String[] s = { "독수리", "고양이", "강아지" };

		List<String> list = Arrays.asList("개미", "개미"); // [개미, 개미]
		System.out.println(list);

		List<String> all = new ArrayList<>(list);
		System.out.println("nCopies(nCopies) : " + all); // nCopies [개미, 개미]

		Collections.fill(all, "벌");
		System.out.println("'벌'을 채운 후(fill) : " + all); // '벌'을 채운 후 : [벌, 벌]

		Collections.addAll(all, s);
		System.out.println("리스트를 모두 추가한 후(addAll) : " + all); // addAll : [벌, 벌, 독수리, 고양이, 강아지]

		Collections.shuffle(all);
		System.out.println("리스트를 섞은 후(shuffle) : " + all);

		Collections.reverse(all);
		System.out.println("리스트를 역순으로 정렬한 후(reverse) : " + all);

		System.out.println("리스트에서 최소(min) : " + Collections.min(all));
		System.out.println("리스트에서 최대(max) : " + Collections.max(all));
		System.out.println("리스트에서 '벌'의 빈도(frequency) : " + Collections.frequency(all, "벌"));

	}

}
