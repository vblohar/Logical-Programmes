import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSum{

    public ArrayList<Integer> SumOfTwoIndex (ArrayList<Integer> intArray){
        int numCount = intArray.size();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Target sum of two numbers");
        int targetSum = sc.nextInt();
        ArrayList<Integer> targetArray = new ArrayList<>();
        for (int i = 0; i < numCount-1; i++) {
            for (int j = i+1; j < numCount; j++) {
                int targetNum = intArray.get(i) + intArray.get(j);
                if(targetNum == targetSum){
                    targetArray.add(i);
                    targetArray.add(j);
                    return targetArray;
                }
            }
        }
        return targetArray;
    }

    public static void main (String[] args) {
        System.out.println("How many numbers add to Array: ");
        Scanner sc = new Scanner(System.in);
        int numCount = sc.nextInt();
        ArrayList<Integer> intArray = new ArrayList<>();
        for (int i = 0; i < numCount; i++) {
            int newNum = sc.nextInt();
            intArray.add(newNum);
            }
        TwoSum twoSum = new TwoSum();
        System.out.println(twoSum.SumOfTwoIndex(intArray));

    }
}