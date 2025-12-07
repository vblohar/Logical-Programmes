package com.examples;

import java.util.Arrays;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,5};
        int missNum = 0;
        int firstNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(firstNum != arr[i]){
                missNum = firstNum;
                break;
            }
            firstNum++;
        }
        System.out.println(missNum);

        List<Integer> list =Arrays.asList(1,5,9,7,12,12,45,6);
        int num = list.stream()
                .distinct()
                .sorted()
                
                .skip(1)
                .findFirst()
                .get();

        System.out.println(num);
    }

}
