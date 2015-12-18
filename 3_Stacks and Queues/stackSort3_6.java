
public class stackSort3_6 {
	public static void main(String []args) throws Exception{
		BasicStack<Integer> stack = new BasicStack<Integer>(20);
		stack.push(3);
		stack.push(5);
		stack.push(2);
		stack.push(4);
		stack.push(6);
		stack.push(1);
		stack.print();
		System.out.println("Sorted stack:");
		sort(stack).print();
	}
	public static BasicStack<Integer> sort(BasicStack<Integer> s) throws Exception{
		BasicStack<Integer> r = new BasicStack<Integer>(20);
		while(!s.isEmpty()){
			int temp = s.pop();
			while(!r.isEmpty() && r.getTop() > temp){
				s.push(r.pop());
			}
			r.push(temp);			
		}
		return r;
	}
}
