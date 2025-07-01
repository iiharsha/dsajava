package com.neetcode.twopointer;

import java.util.*;

class ThreeSum {
    /*
     * Time Complexity : NlogN + n^2
     * Space Complexity: logN + result
     */
    public List<List<Integer>> threeSum(int[] nums) {
        int size = nums.length;

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums); // T: (NlogN) S: (logN)

        for (int i = 0; i < size; ++i) {
            int left = i + 1;
            int right = size - 1;

            if (nums[i] > 0)
                break;

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
