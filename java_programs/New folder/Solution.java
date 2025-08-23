//import java.io.*;
//import java.util.*;
//
//public class Solution  {
//	
//	public static void filteredArraylist(List<Integer> arrayList)throws IOException {
//		
//		
//		int arrayLenght = arrayList.size();
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		int actions = Integer.parseInt(bufferedReader.readLine());
//		
//		while(actions>0) {
//			String actionName = bufferedReader.readLine();
//			if(actionName.equals("Insert")) {
//				int index = Integer.parseInt(bufferedReader.readLine());
//				
//				int newNum = Integer.parseInt(bufferedReader.readLine());
//				arrayList.set(index, newNum);
//			}
//			if (actionName.equals("Delete")) {
//				int index = Integer.parseInt(bufferedReader.readLine());
//				arrayList.remove(index);
//			}
//			
//			
//			actions--;
//		}
//		System.out.println(arrayList);
//		
//	};
//
//    public static void main(String[] args) throws IOException {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//
//    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//      
//        int num = Integer.parseInt(bufferedReader.readLine());
//        
//        List<Integer> arrayList = new ArrayList<>();
//        
//        for(int i= 0; i<num;i++) {
//        	int nums = Integer.parseInt(bufferedReader.readLine());
//        	arrayList.add(nums);
//        }
//        
//        Solution.filteredArraylist(arrayList);
//
//        
//
//
//    }
//}
import java.io.*;
import java.util.*;

public class Solution  {
	
	public static void filteredArraylist(List<Integer> arrayList)throws IOException {
		
		
		int arrayLenght = arrayList.size();
		
		Scanner bufferedReader = new Scanner(new InputStreamReader(System.in));
		int actions = bufferedReader.read();
				
		
		while(actions>0) {
			String actionName = bufferedReader.readLine();
			if(actionName.equals("Insert")) {
				int index = bufferedReader.read();
				
				int newNum = bufferedReader.read();
				
				arrayList.set(index, newNum);
			}
			if (actionName.equals("Delete")) {
				int index = bufferedReader.read();
				
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