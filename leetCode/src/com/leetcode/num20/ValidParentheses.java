package com.leetcode.num20;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }

            if (s.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.poll();
                } else {
                    return false;
                }
            }
            if (s.charAt(i) == '}') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.poll();
                } else {
                    return false;
                }
            }
            if (s.charAt(i) == ']') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.poll();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
