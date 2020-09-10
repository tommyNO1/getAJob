package com.leetcode.offer52;

public class Solution52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        int L1Len = 0;
        int L2Len = 0;
        while (p1!=null){
            L1Len++;
            p1=p1.next;
        }
        while (p2!=null){
            L2Len++;
            p2=p2.next;
        }
        int step = L1Len-L2Len;
        p1 = headA;
        p2 = headB;
        if(step>=0){
            for(int i=0;i<step;i++){
                p1=p1.next;
            }
        }else {
            for (int i=0;i<Math.abs(step);i++){
                p2=p2.next;
            }
        }
        while (p1!=p2){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }
}
