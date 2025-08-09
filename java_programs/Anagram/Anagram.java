
public class Anagram {
	
	public static boolean isAnagram(String s, String t) {
		if(s.length() == t.length()) {
			int[] count = new int[26];
			for(int i =0; i < s.length(); i++) {
				count[s.charAt(i) - 'a']++;
				count[t.charAt(i) - 'a']--;
			}
			
			for(int c: count) {
				if(c!=0) return false; 
			}
			return true;
		}
		return false;
	}

	
	public static void main(String arg[]) {
		
		System.out.println(Anagram.isAnagram("mama", "maam"));
	}
	
}