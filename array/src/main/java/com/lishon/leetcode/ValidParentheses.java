package com.lishon.leetcode;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.  The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 *
 * @author lishon
 * @create 2018-04-10 15:29
 **/

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i =0 ;i < chars.length ; i++) {
            switch (chars[i]) {
                case  '(' : stack.push(')');break;
                case  '{' : stack.push('}'); break;
                case  '[' : stack.push(']'); break;
                default : {
                    if (stack.empty() || stack.pop() != chars[i]) return false;
                }
            }
        }
        return stack.empty();
    }
}
