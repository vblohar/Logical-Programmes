package palindrome_number;

public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
		int fullSize = (String.valueOf(x).length());
		char[] nums = String.valueOf(x).toCharArray();
		
		for (int i = 0; i < nums.length / 2; i++) {
			fullSize--;
			if (nums[i] != (nums[fullSize])) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		System.out.println(isPalindrome(1221221));
	}

}
