package com.lishon.leetcode;

/**
 * @author lishon
 * @create 2018-01-30 13:18
 **/

//  Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
public class App {
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		 	ListNode result = new ListNode(0);
		 	ListNode tail = result;
	        while (l1 !=null || l2 != null) {
	             if (l1 != null && l2 != null) {
	                if (l1.val <= l2.val) {
	                	tail.next = l1;
	                    l1 = l1.next;
	                } else {
	                	tail.next = l2;
	                    l2 = l2.next;
	                }
	            } else if (l2 == null) {
	            	tail.next = l1; 
	            	break;
	            } else if(l1 == null) {
	            	tail.next = l2;
	            	break;
	            }
 	            tail = tail.next;
	         }
	        return result.next;
	    }
    
    public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l11 = new ListNode(2);
		ListNode l111 = new ListNode(4);
		l1.next = l11;
		l11.next = l111;
		
		ListNode l2 = new ListNode(1);
		ListNode l22 = new ListNode(2);
		ListNode l222 = new ListNode(4);
		l2.next = l22;
		l22.next = l222;
		
		App app = new App();
		ListNode mergeTwoLists = app.mergeTwoLists(l1, l2);
		while(mergeTwoLists != null) {
			
			System.out.println(mergeTwoLists.val);
			mergeTwoLists = mergeTwoLists.next;
		}
	}
}
