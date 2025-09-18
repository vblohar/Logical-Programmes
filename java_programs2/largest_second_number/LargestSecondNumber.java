package largest_second_number;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class LargestSecondNumber {
	
	public static void main(String[] args) {
		
		List<Integer> numsList = Arrays.asList(12,25,36,25,36,14,89,72,56,27);
		
		// we are getting second highest number from list using stream api..
		Integer secondHighestNumber = numsList
						.stream()
						.distinct()	
						.sorted(Comparator.reverseOrder())
						.skip(1)
						.findFirst()
						.orElse(null);
						
		System.out.println(secondHighestNumber);
	}

}
