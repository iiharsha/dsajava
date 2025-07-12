package com.neetcode.linkedlist;

class ReorderList {
    public void reorderList(ListNodeV1 head) {
        ListNodeV1 fast = head;
        ListNodeV1 slow = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNodeV1 current = slow.next;// start of the second list
        slow.next = null;

        ListNodeV1 previous = null;

        while (current != null) {
            ListNodeV1 temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        current = head;

        while (previous != null) {
            ListNodeV1 temp = current.next;
            ListNodeV1 temp2 = previous.next;
            current.next = previous;
            previous.next = temp;
            current = temp;
            previous = temp2;
        }
    }

}
