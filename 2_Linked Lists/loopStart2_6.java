
public class loopStart2_6 {
	LinkedListNode head = null;
	public loopStart2_6(LinkedListNode h){
		this.head = h;
	}
	private void append(LinkedListNode n){
		LinkedListNode current = this.head;
		while(current.next != null) current = current.next;
		current.next = n;
	}
	public static void main(String[] args){
		LinkedListNode h = new LinkedListNode(3);
		loopStart2_6 head = new loopStart2_6(h);
		head.append(new LinkedListNode(2));
		head.append(new LinkedListNode(5));
		LinkedListNode a = new LinkedListNode(3);
		head.append(a);
		head.append(new LinkedListNode(5));
		head.append(new LinkedListNode(8));
		head.append(new LinkedListNode(7));
		LinkedListNode b = new LinkedListNode(9);
		head.append(b);		
		b.next = a;
		System.out.println(loopStart(h).data);
	}
	private static LinkedListNode loopStart(LinkedListNode head){
		if(head == null) return null;
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
				break;
		}
		if(fast == null || fast.next == null){
			//no loop
			return null;
		}
		slow = head;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		return fast;
	}
}
