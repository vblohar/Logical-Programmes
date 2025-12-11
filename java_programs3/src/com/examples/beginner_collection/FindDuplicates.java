package com.examples.beginner_collection;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

    public static void main(String[] args ){
        int[] nums = {1,2,3,4,4,5,6,7,7,8};

        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for( int num: nums){
            if(!unique.add(num)){
                duplicates.add(num);
            }
        }

        System.out.println("Duplicates values are " + duplicates);
      }
}
