package com.neetcode.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeTwoSortedListTest {

    MergeTwoSortedList solution = new MergeTwoSortedList();

    // Helper: Convert array to linked list
    private ListNodeV1 buildList(int[] values) {
        ListNodeV1 dummy = new ListNodeV1(0);
        ListNodeV1 current = dummy;
        for (int val : values) {
            current.next = new ListNodeV1(val);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper: Convert linked list to array
    private int[] listToArray(ListNodeV1 head) {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    @Test
    public void testBothEmpty() {
        ListNodeV1 merged = solution.mergeTwoLists(null, null);
        assertNull(merged);
    }

    @Test
    public void testOneEmpty() {
        ListNodeV1 list1 = buildList(new int[] { 1, 3, 5 });
        ListNodeV1 merged = solution.mergeTwoLists(list1, null);
        assertArrayEquals(new int[] { 1, 3, 5 }, listToArray(merged));
    }

    @Test
    public void testNormalMerge() {
        ListNodeV1 list1 = buildList(new int[] { 1, 2, 4 });
        ListNodeV1 list2 = buildList(new int[] { 1, 3, 5 });
        ListNodeV1 merged = solution.mergeTwoLists(list1, list2);
        assertArrayEquals(new int[] { 1, 1, 2, 3, 4, 5 }, listToArray(merged));
    }

    @Test
    public void testDuplicateElements() {
        ListNodeV1 list1 = buildList(new int[] { 2, 2, 2 });
        ListNodeV1 list2 = buildList(new int[] { 2, 2 });
        ListNodeV1 merged = solution.mergeTwoLists(list1, list2);
        assertArrayEquals(new int[] { 2, 2, 2, 2, 2 }, listToArray(merged));
    }

    @Test
    public void testInterleavedValues() {
        ListNodeV1 list1 = buildList(new int[] { 1, 4, 6 });
        ListNodeV1 list2 = buildList(new int[] { 2, 3, 5 });
        ListNodeV1 merged = solution.mergeTwoLists(list1, list2);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, listToArray(merged));
    }
}
