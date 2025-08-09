import java.util.ArrayList;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 20;
        System.out.println(fibonacciSum(n));

    }

    public static ArrayList<Integer> fibonacciSum(int n) {
        ArrayList<Integer> num = new ArrayList<>();
        int first = 0;
        int next = 1;
        if (n == 0) {
            num.add(first);
            return num;
        } else if ( n == 1){
            num.add(first);
            num.add(next);
            return num;
        } else if (n > 1) {
            num.add(first);
            num.add(next);
            while(n > 1){
                int sum = first + next;
                num.add(sum);
                first = next;
                next = sum;
                n--;
            }
        }
        return num;
    }
}
