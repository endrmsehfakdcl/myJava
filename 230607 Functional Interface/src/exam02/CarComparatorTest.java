package exam02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CarComparatorTest {
	public static void main(String[] args) {
		List<Car> list = Car.cars.subList(0, 3); // 0 1 2
		Car[] cars = list.toArray(new Car[3]);

		// <? super T> T의 부모만
		// <? extends T> T의 자식만
		Comparator<Car> modelComperator = Comparator.comparing(Car::getModel);
		System.out.println(Arrays.toString(cars));

		Arrays.sort(cars, modelComperator); // model 순서로 오름차순 sort
		System.out.println(Arrays.toString(cars));

		Arrays.sort(cars, modelComperator.reversed());
		System.out.println(Arrays.toString(cars));

		Arrays.sort(cars, Comparator.comparing(Car::getMileage));
		System.out.println(Arrays.toString(cars));

//		Arrays.sort(cars, Comparator.comparing(Car::getMileage).reversed());
		Arrays.sort(cars, Comparator.comparing(Car::getMileage, (a, b) -> b - a));
		System.out.println(Arrays.toString(cars));

	}

}
