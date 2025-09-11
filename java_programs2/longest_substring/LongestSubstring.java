package longest_substring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	
	 public static int lengthOfLongestSubstring(String s) {
	  
		 Set<Character> set = new HashSet<>();
		 int left = 0, maxLength = 0;
		 
		 for(int right = 0; right < s.length(); right++) {
			 char c = s.charAt(right);
			 
			 while(set.contains(c)) {
				 set.remove(s.charAt(left));
				 left++;
			 }
			 
			 set.add(c);
			 maxLength = Math.max(maxLength, right - left + 1);
		 }
		 
		 return maxLength;
		 
		 
	    }
	
	public static void main(String[] args) {
		String name = "HelloWorld";
		
		System.out.println(lengthOfLongestSubstring(name));
	}

}
