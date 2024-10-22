
public class Number_Of_Digits {

    public int numberInDigits(int num) {
        int count = 1;
        num = Math.abs(num);

        while ((num /= 10) >= 1) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        Number_Of_Digits myObj = new Number_Of_Digits();

        int num = 256321;

        System.out.println(myObj.numberInDigits(num));

    }

}
