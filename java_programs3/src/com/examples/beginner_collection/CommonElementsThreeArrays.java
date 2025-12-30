package com.examples.beginner_collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElementsThreeArrays {

    public static void main(String[] args) {
        Integer[] arr1 = {1,5,10,20,40,80};
        Integer[] arr2 = {3,6,7,20,80,100};
        Integer[] arr3 = {3,4,15,20,30,70,80,120};

        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(arr3));

        set1.retainAll(set2);
        set1.retainAll(set3);

        System.out.println(set1);
    }
}
