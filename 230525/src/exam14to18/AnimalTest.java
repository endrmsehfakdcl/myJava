package exam14to18;

public class AnimalTest {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();

		dog.sound(); //멍멍
		cat.sound(); //야옹
		System.out.println("---------------------------");

//		Animal animal = new Animal(); // abstract Animal
		Animal animal2 = new Dog();
		Animal animal = null; // Animal 타입 참조변수 초기화
		animal = new Dog(); // 추상참조변수 자동 형변환
		animal.sound(); //멍멍

		animal = new Cat();
		animal.sound(); //야옹

		System.out.println("-----------------------------");
		
		animalSound(animal); 	//야옹
		animalSound(new Dog()); //멍멍
		animalSound(new Cat());	//야옹
		

	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
