
public class threeStacks3_1 {
	int stackSize = 100;
	int[] buffer = new int[stackSize * 3];
	int[] stackPoint = {-1, -1, -1};
	
	void push(int data, int stackNum) throws Exception{
		if(stackPoint[stackNum] + 1 >= stackSize){
			throw new Exception("Out of Space");
		}
		stackPoint[stackNum] ++;
		buffer[stackPoint[stackNum]] = data;
	}
	
	int pop(int stackNum) throws Exception{
		if(stackPoint[stackNum] == -1){
			throw new Exception("Empty stack.");
		}
		int item = buffer[stackPoint[stackNum]];
		stackPoint[stackNum] --;
		return item;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
