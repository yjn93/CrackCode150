import java.util.Stack;

public class palindrome2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode head = new LinkedListNode(1);
		head.append(2);
		head.append(4);
		head.append(4);
		head.append(2);
		head.append(2);
		head.print();
		if(recursive(head, head.length(head))) System.out.println("list is palindrome");
		else System.out.println("list is not palindrome");
		if(stack(head)) System.out.println("list is palindrome");
		else System.out.println("list is not palindrome");
	}
	private static boolean recursive(LinkedListNode h, int length){
		if(length == 0 || length == 1)
			return true;
		if(length == 2)
			return (h.data == h.next.data);

		boolean re = recursive(h.next, length - 2);
		if(!re)
			return re;
		LinkedListNode tail = h;
		int l = 1;
		while(l < length){
			tail = tail.next;
			l ++;
		}
		if(tail.data == h.data)
			return true;
		return false;
	}
	private static LinkedListNode reverse(LinkedListNode h){
		if(h == null || h.next == null)
			return h;
		LinkedListNode reversed = reverse(h.next);
		reversed.append(h.data);
		return reversed;
	}
	private static boolean stack(LinkedListNode h){
		LinkedListNode fast = h;
		LinkedListNode slow = h;
		Stack<Integer> stack = new Stack<Integer>();
		while(fast != null && fast.next != null){
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast != null){
			slow = slow.next;
		}
		while(slow != null){
			int top = stack.pop();
			if(top != slow.data)
				return false;
			slow = slow.next;
		}
		return true;
	}
}
