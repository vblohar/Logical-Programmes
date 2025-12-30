package com.examples;

import java.util.ArrayList;
import java.util.List;

public class OddNums1 {
    public static void main(String[] args) {
        int[] arr = {1,2,38,1,36,1,47,25,12};

        List<Integer> oddNumsList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!(arr[i] % 2 == 0) && !(oddNumsList.contains(arr[i]))){
                oddNumsList.add(arr[i]);
            }
        }
        System.out.println(oddNumsList);

        List<Integer> oddNumsCount = new ArrayList<>();
        for (int i = 0; i < oddNumsList.size(); i++) {
            int count = 1;

            for (int j = 0; j < arr.length; j++) {

                if(oddNumsList.get(i) == arr[j]){

                    if(!(oddNumsCount.contains(oddNumsList.get(i)))){
                        oddNumsCount.add(count);

                    } else {
                        count++;
                        oddNumsCount.set(i, count);
                    }
                }
            }

        }
        System.out.println(oddNumsCount);
        int threeTimesRepeaedValue = 0;
        for (int i = 0; i < oddNumsCount.size(); i++) {
            if(oddNumsCount.get(i) == 3) {
                threeTimesRepeaedValue = oddNumsList.get(i);
                System.out.println("Three times repeated odd value is: " + threeTimesRepeaedValue);
                break;
            }


        }
        if(threeTimesRepeaedValue <= 0){
            System.out.println(" Not found odd value is repeated three times ");
        }

     }
}
