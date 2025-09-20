package same_character_count_string;

public class SameCharCountFromString2 {

	public static void main(String[] args) {

		String word1 = "ProgrammingpPP llPP";
		String word =word1.replace(" ", "");
		int[] freq = new int[256];
		
		for(char c: word.toCharArray()) {
			freq[c]++;
		}
		
		for(int i = 0; i< freq.length; i++) {
			if(freq[i] > 0) {
				System.out.println((char) (i) + ": " + freq[i]);
			}
		}

	}

}
