
public class stackWithMin3_2 extends BasicStack<NodeWithMin3_2>{
	public stackWithMin3_2(int c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public void push(int value){
		int newMin = Math.min(this.min(), value);
		super.push(new NodeWithMin3_2(value, newMin));
	}
	
	int min(){
		if(isEmpty()){
			return Integer.MAX_VALUE;
		}
		return getTop().getMin();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		stackWithMin3_2 newStack = new stackWithMin3_2(20);
		newStack.push(3);
		newStack.push(5);
		newStack.push(2);
		System.out.println(newStack.min());
		newStack.pop();
		System.out.println(newStack.min());
	}
	
}
