package com.neetcode.linkedlist;

public class ListNodeV1 {
    int val;
    public ListNodeV1 next;

    public ListNodeV1(int val) {
        this.val = val;
    }

    public ListNodeV1(int val, ListNodeV1 next) {
        this.val = val;
        this.next = next;
    }
}
