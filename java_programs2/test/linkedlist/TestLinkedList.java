package test.linkedlist;

import java.util.LinkedList;

class Node {
	int val;
	Node next;
	public Node(int val) {
		this.val = val;
	}
	public Node (int val, Node next) {
		this.val = val;
		this.next = next;
	}
}

public class TestLinkedList {
	
	public static Node list = new Node(0);
	public static Node list2 = new Node (2, list);
	public static Node list1 = new Node(1, list2);
	
	// When you know the first node.
	static void addNodeAtFirst(Node node) {
				
			if (list1 == null) {
				list1 = node;
			} else {
				node.next = list1;
				list1 = node;
			}
		
	}

	public static void main(String[] args) {
		Node newNode = new Node(5);

		addNodeAtFirst(newNode);
		while(list1 != null) {
			System.out.println(list1.val);
			if(list1.next != null) {
				list1 = list1.next;
			}else {
				list1 = null;
			}
		}
		
	}

}
