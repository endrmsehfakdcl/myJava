package exam01;

public class Who {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = solution(1, 2, 3);
	}

		public static int solution(int a, int b, int c) {
			int answer = 1;

			int count = 1;
			if (a == b || a == c || b == c) {
				count++;
			}

			if (a == b && b == c) {
				count++;
			}

			for (int i = 1; i <= count; i++) {
				answer *= (pow(a, i) + pow(b, i) + pow(c, i));
			}

			return answer;
		}

		
	}

