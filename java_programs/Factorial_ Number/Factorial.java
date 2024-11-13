
public class Factorial {

    public static void main(String[] args) {
        int number = 4;
        System.out.println(factorial(number));

    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}