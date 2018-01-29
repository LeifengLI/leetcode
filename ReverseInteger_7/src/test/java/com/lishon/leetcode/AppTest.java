package com.lishon.leetcode;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
//        int num = 123;
//        int num = 1235678289;
        int num = 1;
        App app = new App();
        int reverse = app.reverse(num);
        System.out.println(reverse);
    }
}
