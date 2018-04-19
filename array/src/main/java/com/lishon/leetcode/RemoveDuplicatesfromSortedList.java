package com.lishon.leetcode;

/**
 * @author lishon
 * @create 2018-04-16 10:13
 **/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


public class RemoveDuplicatesfromSortedList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public  static  ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null) {
            if (current.next == null) break;
            if(current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }

        }
        return head;
    }
public static void main(String[] args){
    ListNode l1 = new ListNode(1);
    ListNode l2 = new ListNode(2);
    ListNode l3 = new ListNode(3);
    ListNode l4 = new ListNode(4);
    l1.next = l2;
    l2.next = l3;
    l3.next = l4;
    ListNode listNode = deleteDuplicates(l1);


}

}
