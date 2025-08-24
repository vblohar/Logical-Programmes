import java.util.ArrayList;
import java.util.Scanner;

public class FindNumbersInArraylist {

    public static void findNumbers (ArrayList<ArrayList<Integer>> list){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nums = new ArrayList<>();
        System.out.println("Operation numbers: ");
        int n = sc.nextInt();
        while (n > 0) {

            System.out.println("lineNumber");
            int lineNumber = sc.nextInt();
           ArrayList<Integer> row = new ArrayList<>();
            if(list.size() > lineNumber){
                row = list.get(lineNumber);
                System.out.println("index");
                int index = sc.nextInt();
                if(row.size() > index){
                    int num = row.get(index);
                    nums.add(String.valueOf(num));
                } else  {
                    nums.add("ERROR!");
                }
            } else  {
                nums.add("ERROR!");
            }
//            try {
//                System.out.println("lineNumber");
//                int lineNumber = sc.nextInt();
//
//                ArrayList<Integer> row = new ArrayList<>();
//                row = list.get(lineNumber);
//                System.out.println("index");
//                int index = sc.nextInt();
//
//                int num = row.get(index);
//                nums.add(String.valueOf(num));
//            } catch ( IndexOutOfBoundsException e){
//                nums.add("ERROR!");
//            }
            n--;
        }
        int numsLength = nums.size();
        while (numsLength > 0){
            System.out.println(nums.get(numsLength -1));
            numsLength--;
        }
    }

    
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("How many lines have you to add in Arraylist: ");
        int lines = sc.nextInt();
        while (lines > 0 ) {
            System.out.println("How many numbers have you to add in this line: ");
            int nums = sc.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            System.out.println("Enter: " + nums + "numbers with enter key for each one");
            while (nums > 0) {
                int num = sc.nextInt();
                row.add(num);
                nums--;
            }
            list.add(row);
            lines--;
        }
        FindNumbersInArraylist.findNumbers(list);

    }

}
