package com.neetcode.twopointer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;

class ThreeSumTest {
    ThreeSum sol;

    @BeforeEach
    void setup() {
        sol = new ThreeSum();
    }

    @Test
    void testBasicCase() {

        int[] input = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1));

        List<List<Integer>> result = sol.threeSum(input);

        // Sort both outer and inner lists for comparison
        sortResult(result);
        sortResult(expected);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void testNoTriplet() {

        int[] input = { 1, 2, 3, 4, 5 };
        List<List<Integer>> result = sol.threeSum(input);

        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void testAllZeros() {

        int[] input = { 0, 0, 0, 0 };
        List<List<Integer>> expected = Collections.singletonList(
                Arrays.asList(0, 0, 0));

        List<List<Integer>> result = sol.threeSum(input);

        sortResult(result);
        sortResult(expected);

        Assertions.assertEquals(expected, result);
    }

    private void sortResult(List<List<Integer>> list) {
        for (List<Integer> triplet : list) {
            Collections.sort(triplet);
        }
        list.sort(Comparator.comparing((List<Integer> l) -> l.get(0))
                .thenComparing(l -> l.get(1))
                .thenComparing(l -> l.get(2)));
    }
}
