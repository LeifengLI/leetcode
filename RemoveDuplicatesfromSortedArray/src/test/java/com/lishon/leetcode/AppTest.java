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
        App app = new App();
        int nums[] = new int[]{1,1,2};
        int i = app.removeDuplicates(nums);
        System.out.println(i);
    }
}
