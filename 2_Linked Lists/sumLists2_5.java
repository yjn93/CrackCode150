
public class sumLists2_5 {
	public static void main(String[] args){
		LinkedListNode a = new LinkedListNode(2);
		a.append(9);
		a.append(4);
		a.print();
		LinkedListNode b = new LinkedListNode(3);
		b.append(7);
		b.append(9);
		b.print();
		sum(a,b,0).print();
	}
	public static LinkedListNode sum(LinkedListNode a, LinkedListNode b, int carry){
		if(a == null && b == null && carry ==0)
			return null;
		int value = carry;
		if(a != null)
			value += a.data;
		if(b != null)
			value += b.data;
		LinkedListNode c = new LinkedListNode(value % 10);
		LinkedListNode next = sum(a == null? null: a.next, b == null ? null : b.next, value >= 10 ? 1 : 0);
		c.next = next;
		return c;
	}
	
}

