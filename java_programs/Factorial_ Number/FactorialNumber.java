
public class FactorialNumber {

    public static void main(String[] args) {
        int number = 4;
        System.out.println(factorial(number));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        int FNumber = n;
        for (int i = 1; i < n; i++) {
            FNumber = FNumber * i;
        }

        return FNumber;

    }
}
