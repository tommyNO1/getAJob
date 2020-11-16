package com.leetcode.num234;

import com.leetcode.dataStructure.ListNode;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode l1 = head;
        ListNode l2 = slow.next;
        slow.next = null;
        l2 = reverse(l2);
        while (l1 != null && l2 != null) {
            if (l1.val == l2.val) {
                l1 = l1.next;
                l2 = l2.next;
            } else {
                return false;
            }
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
