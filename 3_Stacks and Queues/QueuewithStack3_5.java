
public class QueuewithStack3_5 <T>{

	BasicStack<T> oldStack = new BasicStack<T>(20);
	BasicStack<T> newStack = new BasicStack<T>(20);

	void push(T ele){
		oldStack.push(ele);
	}
	T pop() throws Exception{
		if(!newStack.isEmpty()) return newStack.pop();
		while(!oldStack.isEmpty()) newStack.push(oldStack.pop());
		return newStack.pop();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QueuewithStack3_5<Integer> queue = new QueuewithStack3_5<Integer>();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		queue.push(5);
		queue.push(6);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		
	}

}
