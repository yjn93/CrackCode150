import java.util.ArrayList;

public class setOfStacks3_3 {
	public int capacity;
	
	public setOfStacks3_3(int c){
		capacity = c;
	}
	ArrayList<BasicStack<Integer>> stacks = new ArrayList<BasicStack<Integer>>(this.capacity);
	BasicStack<Integer> getLastStack(){
		if(stacks.size() == 0) return null;
		return stacks.get(stacks.size() -1);
	}
	
	void push(int v){
		BasicStack<Integer> last = getLastStack();
		if(last != null && !last.isFull()){
			last.push(v);
			return;
		}
		BasicStack<Integer> stack = new BasicStack<Integer>(capacity);
		stack.push(v);
		stacks.add(stack);
	}
	int pop() throws Exception{
		BasicStack<Integer> last = getLastStack();
		int item = last.pop();
		if(last.isEmpty()){
			stacks.remove(last);
		}
		return item;
	}

	
	int popAt(int index) throws Exception{
		if(index + 1 >= stacks.size()){
			System.out.println("no such stack");
		}
		return leftShift(index, true);
	}
	
	int leftShift(int index, boolean removeTop) throws Exception{
		BasicStack<Integer> stack = stacks.get(index);
		int remove_item;
		if(removeTop)
			remove_item = stack.pop();
		else
			remove_item = stack.removeBottom();
		//System.out.println("remove: " + remove_item);
		if(stack.isEmpty())
			stacks.remove(index);
		else if(stacks.size() > index + 1){
			int v = leftShift(index + 1, false);
			stack.push(v);
		}
		//System.out.println("stack: " + index);
		//stack.print();
		return remove_item;
	}
	
	public static void main(String[] args) throws Exception{
		setOfStacks3_3 stackSets = new setOfStacks3_3(2);
		stackSets.push(1);
		stackSets.push(2);
		stackSets.push(3);
		stackSets.push(4);
		stackSets.push(5);
		System.out.println(stackSets.popAt(0));
		System.out.println(stackSets.popAt(0));
		System.out.println(stackSets.pop());
		System.out.println(stackSets.pop());

	}
	
}
