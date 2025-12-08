package com.examples.two_pointers;

public class Zeros {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3,0,4,0,0, 12};
//        int left = 0;
//
//        for (int right = 0; right < arr.length; right++) {
//            if (arr[right] != 0) {
//                System.out.println(arr[right]);
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//                left++;
//            }
//        }
        int[] newArr= moveZeroToEnd(arr);

        for (int n : newArr) System.out.print(n + " ");
    }
    public static int[] moveZeroToEnd(int[] nums){

        int arrLength = nums.length;
        int[] emptyArr = new int[arrLength];

        int left = 0;
        int right = arrLength;
        int temp = 0;
        while(left < arrLength){

            if(nums[left] == 0){
                right--;
                emptyArr[right] = nums[left];
            }
            else {
                emptyArr[temp] = nums[left];
                temp++;
          }
            left++;
        }
        return emptyArr;
   }
}
