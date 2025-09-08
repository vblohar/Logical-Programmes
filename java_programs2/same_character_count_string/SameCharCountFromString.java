package same_character_count_string;

import java.util.HashMap;

public class SameCharCountFromString {

	public static HashMap<String, Integer> charCount(String name) {
		name = name.replace(" ", "");
		HashMap<String, Integer> map = new HashMap<>();
		char[] charArray = name.toCharArray();

		for (char c : charArray) {
			String key = String.valueOf(c).toLowerCase();
			int value = map.getOrDefault(key, 0); // ✅ avoids null
			map.put(key, value + 1);
		}

		return map;
	}

	public static void main(String[] args) {
		String name = "If a match is found increment the value in the map for that key";

		System.out.println(charCount(name));
	}

}
