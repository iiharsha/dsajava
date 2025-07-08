package com.neetcode.linkedlist;

class LinkedListCycle {
    public boolean hasCycle(ListNodeV2 head) {

        ListNodeV2 fast = head;
        ListNodeV2 slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }
}
