package com.leetcode.num141;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode ps = head;
        ListNode pf = head;
        while (pf != null) {
            ps = ps.next;
            if (pf.next != null) {
                pf = pf.next.next;
            } else {
                break;
            }
            if (ps == pf) return true;
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}