package com.neetcode.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseLinkedListTest {

    // Helper to create a linked list from an array
    private ListNodeV1 buildList(int[] values) {
        ListNodeV1 dummy = new ListNodeV1(0);
        ListNodeV1 current = dummy;
        for (int val : values) {
            current.next = new ListNodeV1(val);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper to convert linked list back to array
    private int[] listToArray(ListNodeV1 head) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    @Test
    public void testReverseNormalList() {
        ReverseLinkedList reverser = new ReverseLinkedList();
        ListNodeV1 input = buildList(new int[] { 1, 2, 3, 4, 5 });
        ListNodeV1 result = reverser.reverseList(input);
        assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, listToArray(result));
    }

    @Test
    public void testReverseSingleElement() {
        ReverseLinkedList reverser = new ReverseLinkedList();
        ListNodeV1 input = buildList(new int[] { 42 });
        ListNodeV1 result = reverser.reverseList(input);
        assertArrayEquals(new int[] { 42 }, listToArray(result));
    }

    @Test
    public void testReverseEmptyList() {
        ReverseLinkedList reverser = new ReverseLinkedList();
        ListNodeV1 result = reverser.reverseList(null);
        assertNull(result);
    }
}
