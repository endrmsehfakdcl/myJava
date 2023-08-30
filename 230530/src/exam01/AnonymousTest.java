package exam01;

public class AnonymousTest {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.wake(); // 6시에 일어납니다.

		anony.method1();
		anony.method2(new Person() {
			void study() {
				System.out.println("공부를 합니다.");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어압니다.");
				study();
			};
		});

	}
}
