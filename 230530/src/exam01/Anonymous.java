package exam01;

public class Anonymous {
	Person field = new Person() {
		// 익명클래스
		void work() {
			System.out.println("출근합니다.");
		}
 
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}

	}; // 한문장이므로 세미콜론 필요함
		// Person field2 = new Person() {};

	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");

			}

			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		localVar.wake();

	}
	void method2(Person person) {
		person.wake();
	}

}
