package com.examples;

public class SumOfDigits {
    public static void main(String[] args) {
        int nums = 259;
        int sum =0;
        int count = 0;
        String reverseNums = "";

        while(nums >0){
            sum += nums%10;
            reverseNums += nums%10;
            nums = nums/10;
            count++;
        }
        System.out.println(reverseNums);
    }

}
