
public class Hanoi3_4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BasicStack<Integer> stackA = new BasicStack<Integer>(10);
		BasicStack<Integer> stackB = new BasicStack<Integer>(10);
		BasicStack<Integer> stackC = new BasicStack<Integer>(10);
		stackA.push(5);
		stackA.push(4);
		stackA.push(3);
		stackA.push(2);
		stackA.push(1);
		stackA.print();
		Hanoi(stackA, stackC, stackB, 5);
		stackC.print();
		
	}
	public static void Hanoi(BasicStack<Integer> A, BasicStack<Integer> C, BasicStack<Integer> B, int num) throws Exception{
		if(num == 1){
			int disk = (int) A.pop();
			C.push(disk);
			return;
		}
		Hanoi(A, B, C, num-1);
		int disk = (int) A.pop();
		C.push(disk);
		Hanoi(B, C, A, num-1);
	}

}
