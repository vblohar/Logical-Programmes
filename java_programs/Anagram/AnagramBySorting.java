import java.util.Arrays;

public class AnagramBySorting{

    public static void main(String[] args) {
        String anagram1 = "maam";
        String anagram2 = "mamal";

        char[] charArrayAnagram1 = anagram1.toCharArray();
        char[] charArrayAnagram2 = anagram2.toCharArray();

        Arrays.sort(charArrayAnagram1);
        Arrays.sort(charArrayAnagram2);

        String anagram3 = new String(charArrayAnagram1);
        String anagram4 = new String(charArrayAnagram2);
        System.out.println(anagram3);
        System.out.println(anagram4);

        if( anagram3.equals(anagram4)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }

}