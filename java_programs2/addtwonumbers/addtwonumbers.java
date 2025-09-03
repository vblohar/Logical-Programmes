package addtwonumbers;

import java.util.LinkedList;
import java.util.Scanner;

 public class addtwonumbers {
	 
	 public static ListNode addTwoDigit (ListNode h1, ListNode h2) {
		 ListNode dummyHead = new ListNode(0);
		 ListNode current = dummyHead;
		 
		 int carry= 0;
		 
		 while(h1 != null || h2 != null || carry != 0) {
			 int sum = carry;
			 if(h1 != null) {
				 sum += h1.val;
				 h1 = h1.next;
			 }
			 if(h2 != null) {
				 sum +=h2.val;
				 h2 = h2.next;
			 }
			 
			
			 ListNode newNode = new ListNode(sum % 10);
			 current.next = newNode;
			 current = current.next;
			 
			 carry = sum/10;
			 
			
		 }
		 return dummyHead.next;
	 }
	

	 public static void main(String[] args) {
	        // Number: 123
	        int[] digits = {1, 2, 3, 4, 5}; // left to right

	        ListNode head = null, tail = null;

	        for (int d : digits) {
	            ListNode newNode = new ListNode(d);

	            if (head == null) {
	                head = newNode;
	                tail = newNode;
	              
	            } else {
	                newNode.next = head; // append at start             

	                head = newNode;
	                System.out.println(head.val);
	            }
	        }
	        
	        int[] digits1 = {8, 3, 8, 9, 5}; // left to right

	        ListNode head1 = null, tail1 = null;

	        for (int d : digits1) {
	            ListNode newNode1 = new ListNode(d);

	            if (head1 == null) {
	                head1 = newNode1;
	                tail1 = newNode1;
	              
	            } else {
	                newNode1.next = head1; // append at start             

	                head1= newNode1;
	               
	            }
	        }
	        
	        printList(addtwonumbers.addTwoDigit(head, head1));

	        printList(head1); // Output: 1 -> 2 -> 3

	        printList(head); // Output: 1 -> 2 -> 3
	    }

	    static void printList(ListNode head) {
	        while (head != null) {
	            System.out.print(head.val);
	            if (head.next != null) System.out.print(" -> ");
	            head = head.next;
	        }
	        System.out.println();
	    }

}
 
 class ListNode {
		int val;
		ListNode next;
		ListNode(){}
		ListNode(int val){ this.val = val; }
		ListNode(int val, ListNode next){ this.val = val; this.next = next;}
	}
