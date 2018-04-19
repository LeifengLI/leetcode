package com.lishon.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public boolean isValid(String str) {
        char[] chars = str.toCharArray();
        Stack<Character> s = new Stack<Character>();
        for (int i = 0; i < chars.length; i++) {

            switch (chars[i]) {
                case '(' : s.push(')'); break;
                case '[' : s.push(']'); break;
                case '{' : s.push('}'); break;

                default : if (s.isEmpty() || chars[i] != s.pop()) {return  false;} break;
            }
        }
        return s.isEmpty();
    }
}
