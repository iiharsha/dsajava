package com.neetcode.twopointer;

class TwoSumTwo {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int left = 0;
        int right = size - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target)
                return new int[] { left + 1, right + 1 };

            if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[] {};
    }
}
