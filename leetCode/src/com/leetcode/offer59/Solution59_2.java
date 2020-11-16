package com.leetcode.offer59;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution59_2 {
    class MaxQueue {
        Queue<Integer> queue1 = new LinkedList<>();
        Deque<Integer> queue2 = new LinkedList<>();


        public MaxQueue() {

        }

        public int max_value() {
            if (queue2.isEmpty()) return -1;
            return queue2.peekFirst();
        }

        public void push_back(int value) {
            queue1.add(value);
            while (!queue2.isEmpty() && value > queue2.peekLast()) {
                queue2.removeLast();
            }
            queue2.addLast(value);
        }

        public int pop_front() {
            if (queue1.isEmpty()) return -1;
            int temp = queue1.peek();
            if (queue1.peek() < queue2.peekFirst()) {
                queue1.remove();
            } else {
                queue1.remove();
                queue2.removeFirst();
            }
            return temp;
        }
    }
}
