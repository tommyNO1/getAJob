package com.leetcode.num143;

import com.leetcode.dataStruct.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class ReorderList {
    public void reorderList(ListNode head) {
        Deque<ListNode> deque = new LinkedList<>();
        ListNode cur = head;
        while (cur!=null){
            ListNode next = cur.next;
            cur.next = null;
            deque.add(cur);
            cur = next;
        }
        ListNode newHead = new ListNode(0);
        cur = newHead;
        boolean flag = false;
        while (!deque.isEmpty()){
            if (!flag) {
                ListNode temp = deque.removeFirst();
                cur.next = temp;
                cur = cur.next;
                flag = true;
            }else {
                ListNode temp = deque.removeLast();
                cur.next = temp;
                cur = cur.next;
                flag = false;
            }
        }
        head = newHead.next;
    }
}
