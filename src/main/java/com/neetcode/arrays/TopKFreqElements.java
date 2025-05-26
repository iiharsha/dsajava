package com.neetcode.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFreqElements {
    public int[] topKFreqElements(int[] nums, int k) {
        int[] out = new int[k];

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
        }

        for (int i = 0; i < k; i++) {
            out[i] = pq.poll().getKey();
        }

        return out;
    }
}
