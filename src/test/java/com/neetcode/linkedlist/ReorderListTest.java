package com.neetcode.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReorderListTest {
    ReorderList sol = new ReorderList();

    private ListNodeV1 buildList(List<Integer> values) {
        if (values.isEmpty())
            return null;

        ListNodeV1 head = new ListNodeV1(values.get(0));
        ListNodeV1 current = head;

        for (int i = 1; i < values.size(); i++) {
            current.next = new ListNodeV1(values.get(i));
            current = current.next;
        }

        return head;
    }

    private List<Integer> listToValues(ListNodeV1 head) {
        List<Integer> result = new ArrayList<>();

        while (head != null) {
            result.add(head.val);
            head = head.next;
        }

        return result;
    }

    @Test
    void testOne() {
        ListNodeV1 head = buildList(Arrays.asList(1, 2, 3, 4, 5));
        sol.reorderList(head);
        List<Integer> result = listToValues(head);
        Assertions.assertEquals(Arrays.asList(1, 5, 2, 4, 3), result);
    }

    @Test
    void testTwo() {
        ListNodeV1 head = buildList(Arrays.asList(1, 2, 3, 4));
        sol.reorderList(head);
        List<Integer> result = listToValues(head);
        Assertions.assertEquals(Arrays.asList(1, 4, 2, 3), result);
    }
}
