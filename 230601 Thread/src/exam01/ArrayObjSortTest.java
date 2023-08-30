package exam01;

import java.util.Arrays;

public class ArrayObjSortTest {

	public static void main(String[] args) {

		Person[] person = new Person[3];
		person[0] = new Person("Kim", 30);
		person[1] = new Person("Lee", 21);
		person[2] = new Person("Park", 50);

//		Arrays.sort(person);

		for (Person p : person) {
			System.out.println(p);
		}

		int idx = Arrays.binarySearch(person, new Person("Kim", 30)); // binarySearch 전에 sort 필요
		System.out.println(idx);

		System.out.println();

	}

}
