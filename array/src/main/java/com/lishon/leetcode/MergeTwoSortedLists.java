package com.lishon.leetcode;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * @author lishon
 * @create 2018-04-10 17:04
 **/
/**
 * Definition for singly-linked list.
 * */


public class MergeTwoSortedLists {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode l;
        if (l1.val < l2.val) {
            l = l1;
            l.next = mergeTwoLists(l.next, l2);
        } else {
            l = l2;
            l.next = mergeTwoLists(l1, l2.next);
        }
        return l;
    }
}
