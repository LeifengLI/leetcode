package com.lishon.leetcode;

import java.util.Stack;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 For example,
 "A man, a plan, a canal: Panama" is a palindrome.
 "race a car" is not a palindrome.

 Note:
 Have you consider that the string might be empty? This is a good question to ask during an interview.

 For the purpose of this problem, we define empty string as valid palindrome.
 * @author lishon
 * @create 2018-04-19 11:14
 **/

public class ValidPalindrome_125 {

    public boolean isPalindrome(String s) {
        char[] chs = s.toLowerCase().toCharArray();
        int i = 0, j = chs.length - 1;
        while (i<=j) {
            if(Character.isLetterOrDigit(chs[i])) {
                if(Character.isLetterOrDigit(chs[j])){
                    if(chs[j--] != chs[i++]) return false;
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }
        return true;
    }

    public static void main(String[] args){
     int a = 4;
     int b = 2;
        System.out.println(a ^ b ^ a);
    }
}
