package com.neetcode.linkedlist;

class MergeTwoSortedList {
    public ListNodeV1 mergeTwoLists(ListNodeV1 list1, ListNodeV1 list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNodeV1 head = null;

        if (list1.val < list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }

        ListNodeV1 current = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
        }

        if (list1 != null)
            current.next = list1;
        if (list2 != null)
            current.next = list1;

        return head;
    }
}
