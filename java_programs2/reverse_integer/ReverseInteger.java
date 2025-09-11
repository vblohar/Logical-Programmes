package reverse_integer;

public class ReverseInteger {
	
	public static int reverse(int x) {
        int rev = 0;
    
        while (x != 0) {
            int digit = x % 10;   // get last digit
         
            x = x / 10;           // remove last digit
      
            // Check for overflow before multiplying by 10
            if (rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10) {
                return 0; // return 0 if it overflows
            }

            rev = rev * 10 + digit;
            System.out.println(rev);
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(00123));   // 321
        System.out.println(reverse(-456));  // -654
    
    }

}
