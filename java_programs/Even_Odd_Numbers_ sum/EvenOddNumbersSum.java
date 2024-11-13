
public class EvenOddNumbersSum {

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 6, 7, 10, 11};

        System.out.println(challange(array));
    }

    public static int challange(int[] myArray) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                even += myArray[i];
            } else {
                odd += myArray[i];
            }

        }
        return even > odd ? even : odd;
        // if (even > odd) {
        //     return even;
        // } else {
        //     return odd;
        // }
    }
}
