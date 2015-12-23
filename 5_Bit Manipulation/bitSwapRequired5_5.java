/*
 * Write a function to determine the number of bits required to convert integer A to integer B.
 */
public class bitSwapRequired5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 43;
		int b = 14;
		System.out.println("a: " + Integer.toBinaryString(a));
		System.out.println("b: " + Integer.toBinaryString(b));	
		System.out.println("Bit swap required number: " + bitRequired(a, b));
		System.out.println("Bit swap required number: " + bitRequired_2(a, b));
	}
	public static int bitRequired(int a, int b){
		int count = 0;
		for(int c = a ^ b; c != 0; c >>= 1){
			count += c & 1;
		}
		return count;
	}
	
	// A tricky solution!  c & (c - 1) : clear the least significant 1 in c
	public static int bitRequired_2(int a, int b){
		int count = 0;
		for(int c = a ^ b; c != 0; c = c & (c - 1)){
			count ++;
		}
		return count;
	}	
}
