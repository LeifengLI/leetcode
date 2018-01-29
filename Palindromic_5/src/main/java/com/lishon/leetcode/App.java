package com.lishon.leetcode;

/**
 * Hello world!
 *
 */
public class App 
{
    public String longestPalindrome(String s) {
        int length = s.length();
        char sub[] = new char[length];
        char tmp[] = new char[length];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length-1;i++) {
            int num = length / 2 + 1;
            sub[0] = chars[0];
            for (int j = 1;j <= num;j++) {
              if (chars[j] == chars[j-1]) {

              }
            }
        }
        return  null;
    }
}
