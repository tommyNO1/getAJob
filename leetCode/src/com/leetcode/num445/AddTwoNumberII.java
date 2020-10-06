package com.leetcode.num445;

import java.util.Deque;
import java.util.LinkedList;

public class AddTwoNumberII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> stack1 = new LinkedList<>();
        Deque<Integer> stack2 = new LinkedList<>();
        ListNode l1_crr = l1;
        ListNode l2_crr = l2;
        while (l1_crr!=null){
            stack1.push(l1_crr.val);
            l1_crr=l1_crr.next;
        }
        while (l2_crr!=null){
            stack2.push(l2_crr.val);
            l2_crr=l2_crr.next;
        }
        int carry = 0;
        ListNode l3 = null;
        while(!stack1.isEmpty()||!stack2.isEmpty()||carry>0){
            int sum = carry;
            sum += stack1.isEmpty()?0:stack1.pop();
            sum += stack2.isEmpty()?0:stack2.pop();
            ListNode node = new ListNode(sum%10);
            node.next = l3;
            l3 = node;
            carry = sum/10;
        }
        return l3;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}