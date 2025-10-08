package my_map;

import java.io.*;
import java.util.*;

public class MyHashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dummyN = n;

		Map<String, String> phoneBook = new HashMap<>();
		sc.nextLine();

		while (dummyN > 0) {
			System.out.println("Enter name : " + dummyN);
			String name = sc.nextLine();
			System.out.println("Mobile No : " + dummyN);
			String phoneNum = sc.nextLine();

			phoneBook.put(name, phoneNum);
			dummyN--;
		}

		System.out.println(phoneBook);
		dummyN = n;
		List<String> names = new ArrayList<>();
		System.out.println("Enter SearchName : " + dummyN);
		while (dummyN > 0) {
			String searchName = sc.nextLine();
			names.add(searchName);
			dummyN--;
		}

		dummyN = n;
		List<String> phoneList = new ArrayList<>();
		for (int i = 0; i < names.size(); i++) {

			if (!phoneBook.containsKey(names.get(i))) {
				names.set(i, "Not Found");
			} else {
				String jointNamePhoneNum = (names.get(i) + "=" + phoneBook.get(names.get(i)));
				names.set(i, jointNamePhoneNum);
			}
		}

		names.stream().peek(System.out::println);
		System.out.println(names);

	}
}
