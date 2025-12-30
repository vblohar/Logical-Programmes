package com.examples;

import java.util.HashMap;
import java.util.Map;

public class OddNums {

    public static void main(String[] args) {
        int[] arr = {29,45,18,30,17,29,29,45};

        HashMap<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            numMap.put(arr[i], numMap.getOrDefault(arr[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : numMap.entrySet()){
            if(!(entry.getKey() % 2 ==0) & entry.getValue() == 3){
                System.out.println("Three times repeated odd number is: " + entry.getKey());
                break;
            }
        }

    }



}
