/*
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */

import java.util.HashMap;

public class removeDuplicates2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data = 3;
		LinkedListNode head = new LinkedListNode(data);
		head.append(2);
		head.append(5);
		head.append(3);
		head.append(4);
		head.print();
		removeDuplicates(head);
		head.print();
		
		head.append(5);
		head.append(8);
		head.append(2);
		head.print();
		removeDuplicatesWithHashmap(head);
		head.print();
	}
	static void removeDuplicates(LinkedListNode head){
		if(head == null || head.next == null) return;

		LinkedListNode current = head;
		
		while(current != null){
			LinkedListNode ln = current;
			for(; ln.next != null; ln = ln.next){
				if(current.data == ln.next.data)	ln.next = ln.next.next;
				
			}
			current = current.next;
		}
	}
	static void removeDuplicatesWithHashmap(LinkedListNode head){
		if(head == null || head.next == null) return;
		HashMap map = new HashMap();
		LinkedListNode current = head;
		LinkedListNode previous = null;
		while(current != null){
			if(map.containsKey(current.data)){
				previous.next = current.next;
			} else{
				map.put(current.data, true);
				previous = current;
			}
			current = current.next;
		}
		
	}
}
