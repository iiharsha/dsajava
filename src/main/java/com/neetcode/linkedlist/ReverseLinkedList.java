package com.neetcode.linkedlist;

class ReverseLinkedList {
    public ListNodeV1 reverseList(ListNodeV1 head) {
        ListNodeV1 prevNode = null;
        ListNodeV1 currNode = head;
        ListNodeV1 nextNode = null;

        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }

        return prevNode;
    }
}
