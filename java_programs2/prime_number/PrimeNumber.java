package prime_number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		
		if(num == 2 || num == 3) {
			return true;
		}
		
		if(num > 3) {
			for(int i = 2; i < Math.sqrt(num); i++) {
				if(num % i == 0) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		while(n > 0) {
			int newInt = sc.nextInt();
			list.add(newInt);
			n--;
		}
		
		List<Integer> primeList = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if(isPrime(list.get(i))) {
				primeList.add(list.get(i));
			
				for(int j = 0; j < primeList.size(); j++) {
					System.out.print(primeList.get(j) + " ");
				}
				System.out.println();
			}
		}

		sc.close();
	}
}
