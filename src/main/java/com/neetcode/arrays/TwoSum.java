package com.neetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // initialize a map to store the elements with indexes
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            //calculate the complement for ex:- 9 - 2 = 7
            int complement = target - nums[i];

            //try to get the get from the map
            if (map.containsKey(complement)) {
                // return index of complement and the current index i
                return new int[]{map.get(complement), i};
            }
            //if no complement found insert the num as key and index of num as value
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("no solution found!");
    }
}
