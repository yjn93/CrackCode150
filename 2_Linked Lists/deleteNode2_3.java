/*
 * Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node.
 */
public class deleteNode2_3 {
	LinkedListNode head = null;
	public deleteNode2_3(LinkedListNode h){
		this.head = h;
	}
	private void append(LinkedListNode n){
		LinkedListNode current = this.head;
		while(current.next != null) current = current.next;
		current.next = n;
	}
	private void print(){
		this.head.print();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data = 3;
		LinkedListNode h = new LinkedListNode(data);
		deleteNode2_3 head = new deleteNode2_3(h);
		head.append(new LinkedListNode(2));
		head.append(new LinkedListNode(3));
		LinkedListNode a = new LinkedListNode(5);
		head.append(a);
		head.append(new LinkedListNode(2));
		head.print();
		deleteNode(a);
		head.print();
	}
	static void deleteNode(LinkedListNode n){
		if(n == null || n.next == null) return;
		n.data = n.next.data;
		n.next = n.next.next;
	}
}
