package com.lishon.leetcode;

/**
 *
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

 Note:
 You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 * @author lishon
 * @create 2018-04-16 10:50
 **/

public class MergeSortedArray_88 {



    public static void merge(int A[], int m, int B[], int n) {
        while(n>0)A[m+n-1]=(m==0||B[n-1]<A[m-1])?A[--m]:B[--n];
    }
    public static void printArray(int[] a) {
        for(int i: a) System.out.print(i+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] A = {2,0};
        int m = 1;
        int[] B = {0};
        int n = 1;
        printArray(A);
        printArray(B);
        merge(A,m,B,n);
        printArray(A);
    }
    //此数组只用nums1 不额外增加空间，从后向前由大到小排序

}
