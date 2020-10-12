package com.leetcode.num142;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode ps = head;
        ListNode pf = head;
        boolean hasCycle = false;
        while (pf != null) {
            ps = ps.next;
            if (pf.next != null) {
                pf = pf.next.next;
            } else {
                break;
            }
            if (ps == pf) {
                hasCycle = true;
                break;
            }
        }
        if(hasCycle){
            ListNode ph = head;
            while (ph!=ps){
                ph = ph.next;
                ps = ps.next;
            }
            return ph;
        }else {
            return null;
        }
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