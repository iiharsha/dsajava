package com.neetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class GroupAnagramsTest {

    @Test
    public void testingGroupAnagrams() {
        GroupAnagrams sol = new GroupAnagrams();

        String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };

        List<List<String>> expected = Arrays.asList(
                Arrays.asList("eat", "tea", "ate"),
                Arrays.asList("tan", "nat"),
                Arrays.asList("bat"));

        List<List<String>> actual = sol.groupAnagrams(input);

        List<Set<String>> expectedSet = toSetList(expected);
        List<Set<String>> actualSet = toSetList(actual);

        assertTrue(actualSet.containsAll(expectedSet) && expectedSet.containsAll(actualSet));
    }

    private List<Set<String>> toSetList(List<List<String>> list) {
        List<Set<String>> setList = new ArrayList<>();
        for (List<String> group : list) {
            setList.add(new HashSet<>(group));
        }
        return setList;
    }
}
