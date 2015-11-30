
public class LinkedListNode {
	LinkedListNode next = null;
	int data;
	public LinkedListNode(int d){
		data = d;
	}
	void append(int data){
		LinkedListNode d = new LinkedListNode(data);
		LinkedListNode current = this;
		while(current.next != null) current = current.next;
		current.next = d;
	}
	void print(){
		LinkedListNode head = this;
		while(head != null){
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	LinkedListNode delete(LinkedListNode head, int d){
		LinkedListNode current = head;
		if(current.data == d) return head.next;
		while(current.next != null){
			if(current.next.data == d){
				current.next = current.next.next;
				return head;
			}
			current = current.next;
		}
		return head;
	}
}
