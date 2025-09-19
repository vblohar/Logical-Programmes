package four_sum;

import java.util.*;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) return result;

        Arrays.sort(nums);  // Step 1: sort the array

        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
        
            if (i > 0 && nums[i] == nums[i - 1]) { // skip duplicates for i
            	System.out.println("i: " + i + (nums[i] == nums[i - 1]));
            	continue;
            };

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                	System.out.println("j: "+j);
                	continue;
                // skip duplicates for j
                }

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right]; 
                    // use long to avoid integer overflow

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // skip duplicates for left and right
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;  // need a bigger sum
                    } else {
                        right--; // need a smaller sum
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        int[] nums1 = {1,0,-1,0,-2,2};
//        int target1 = 1;
//        System.out.println(fourSum(nums1, target1));
        // Output: [[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]

        int[] nums2 = {2,2,2,2,2};
        int target2 = 8;
        System.out.println(fourSum(nums2, target2));
        // Output: [[2, 2, 2, 2]]
    }
}

