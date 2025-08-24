import java.io.*;
import java.util.*;

public class Solution  {
	
	public static void filteredArraylist(List<Integer> arrayList)throws IOException {
		
		
		int arrayLenght = arrayList.size();
		
		Scanner bufferedReader = new Scanner(System.in);
		int actions = bufferedReader.nextInt();
				
		
		while(actions>0) {
			String actionName = bufferedReader.next();
			if(actionName.equals("Insert")) {
				int index = bufferedReader.nextInt();
				
				int newNum = bufferedReader.nextInt();
				
				arrayList.set(index, newNum);
			}
			if (actionName.equals("Delete")) {
				int index = bufferedReader.nextInt();
				
				arrayList.remove(index);
			}
			
			
			actions--;
		}
		System.out.println(arrayList);
		
	};

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    	
    	Scanner sc = new Scanner(new InputStreamReader(System.in));
      
        int num = sc.nextInt();
				
        System.out.println(num);
        List<Integer> arrayList = new ArrayList<>();
        
        while(num>0) {
        	int nums = sc.nextInt();
				
            arrayList.add(nums);
            num--;
        }
        System.out.println(arrayList);
        Solution.filteredArraylist(arrayList);

    
    }
}