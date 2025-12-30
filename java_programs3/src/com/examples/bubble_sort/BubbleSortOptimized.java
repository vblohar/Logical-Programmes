package com.examples.bubble_sort;

public class BubbleSortOptimized {
    public void bubbleSort(int[] nums){
        int arrLength= nums.length;
        boolean sorted;

        for (int i = 0; i < arrLength; i++) {
            sorted = false;
            for (int j = 0; j < arrLength-i-1; j++) {
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    sorted = true;
                }
            }
            if(!sorted){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {100,36,48,25,96,14,2,35,78,2};

        BubbleSortOptimized bubbleSortOptimized = new BubbleSortOptimized();
        bubbleSortOptimized.bubbleSort(nums);
        for(int num: nums){
            System.out.println(num);
        }
    }
}
