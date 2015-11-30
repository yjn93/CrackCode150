/*
 * Implement an algorithm to find the nth to last element of a singly linked list.
 */
public class findNthtoLastN2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data = 3;
		LinkedListNode head = new LinkedListNode(data);
		head.append(2);
		head.append(5);
		head.append(3);
		head.append(4);
		head.print();
		System.out.println(nthtoLast(head, 3).data);
		System.out.println(nthtoLast(head, 4).data);
	}
	static LinkedListNode nthtoLast(LinkedListNode head, int n){
		LinkedListNode current = head;
		for(int i = 0; i < n - 1 ; i ++){
			if(current == null) return null;
			current = current.next;
		}
		LinkedListNode p = head;
		while(current.next!=null){
			p = p.next;
			current = current.next;
		}
		return p;
	}

}
