
@SuppressWarnings("hiding")
public class BasicStack <Object>{
	Node top = null;
	Node bottom = null;
	int capacity;
	int stackPoint = -1;
	public BasicStack(int c){
		capacity = c;
	}
	public int getCapacity(){
		return capacity;
	}
	public Object pop() throws Exception{
		if(top != null){
			@SuppressWarnings("unchecked")
			Object item = (Object) top.data;
			top = top.next;		
			stackPoint --;
			return item;
		}
		else
			throw new Exception("Empty stack");
	}
	public void push(Object d){
		Node item = new Node(d);
		item.next = top;
		if(top == null)
			bottom = item;
		top = item;
		stackPoint ++;
	}
	@SuppressWarnings("unchecked")
	public Object getTop(){
		return (Object) top.data;
	}
	
	public Object removeBottom() throws Exception{
		if(bottom != null){
			@SuppressWarnings("unchecked")
			Object item = (Object) bottom.data;
			if(top == bottom){
				bottom = null;
				top = null;
				stackPoint --;
				return item;
			}
			
			Node current = top;
			while(current != null){
				if(current.next == bottom){
					bottom = current;
					current.next = null;
					return item;
				}
				current = current.next;
				System.out.println("ehi"+current.data);
			}
		}
		else
			throw new Exception("Empty stack");
		return null;
	}
	
	public void print(){
		Node current = top;
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public boolean isEmpty(){
		return top == null;
	}
	public boolean isFull(){
		return (stackPoint + 1) == capacity;
	}
}

