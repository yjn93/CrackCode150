/*
 * Write code to partition a linked list around a value x, such that all nodes less than x
 * come before all nodes greater than or equal to x
 */
public class partitionList2_4 {
	LinkedListNode head = null;
	public partitionList2_4(LinkedListNode h){
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
		LinkedListNode start = new LinkedListNode(3);
		partitionList2_4 head = new partitionList2_4(start);
		head.append(new LinkedListNode(6));
		head.append(new LinkedListNode(2));
		head.append(new LinkedListNode(3));
		head.append(new LinkedListNode(5));
		head.append(new LinkedListNode(2));
		head.print();
		partition(start, 3).print();
		
	}
	static LinkedListNode partition(LinkedListNode n, int value){
		if(n == null || n.next == null) return n;
		LinkedListNode smallListStart = null;
		LinkedListNode smallListLast = null;
		LinkedListNode largeListStart = null;
		LinkedListNode largeListLast = null;
		while(n != null){
			if(n.data < value){
				if(smallListStart == null){
					smallListStart = n;
					smallListLast = smallListStart;
				} else{
					smallListLast.next = n;
					smallListLast = n;
				}
			} else{
				if(largeListStart == null){
					largeListStart = n;
					largeListLast = largeListStart;
				} else{
					largeListLast.next = n;
					largeListLast = n;
				}
			}
			n = n.next;
		}
		if(smallListStart != null)
			smallListLast.next = null;
		if(largeListLast != null)
			largeListLast.next = null;
		if(smallListStart == null)
			return largeListStart;
		smallListLast.next = largeListStart;
		return smallListStart;
	}
}
