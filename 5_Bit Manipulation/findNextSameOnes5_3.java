/*
 * Given an integer, print the next smallest and last largest number 
 * that have the same number of 1 bits in their binary representation
 */
public class findNextSameOnes5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 44;
		System.out.println("a: " + a + " " + Integer.toBinaryString(a));
		int b = nextSmallest(a);
		System.out.println("next smallest: " + b + " " + Integer.toBinaryString(b));
		int c = lastLargest(a);
		System.out.println("last largest: " + c + " " + Integer.toBinaryString(c));
	}
	public static int getBit(int a, int index){
		return (a >> index) & 1;
	}
	public static int setBit(int a, int index, int bit){
		if(bit == 1){
			return a | (bit << index);
		}		
		return (~(1 << index)) & a;
	}
	public static int nextSmallest(int a){
		int index = 0;
		while(getBit(a, index) == 0) index ++;
		int countOnes = 0;
		while(getBit(a, index) == 1){
			index ++;
			countOnes ++;
		}
		a = setBit(a, index, 1);
		a = setBit(a, index - 1, 0);
		countOnes --;
		for(int i = index - 2; i >= countOnes; i --){
			a = setBit(a, i, 0);
		}
		for(int i = 0; i < countOnes; i ++){
			a = setBit(a, i, 1);
		}
		return a;
	}
	
	public static int lastLargest(int a){
		int index = 0;
		while(getBit(a, index) == 1) index ++;
		int countZeros = 0;
		while(getBit(a, index) == 0){
			index ++;
			countZeros ++;
		}
		a = setBit(a, index, 0);
		a = setBit(a, index - 1, 1);
		countZeros --;
		for(int i = index - 2; i >= countZeros; i --){
			a = setBit(a, i, 1);
		}
		for(int i = 0; i < countZeros; i ++){
			a = setBit(a, i, 0);
		}
		return a;
	}
	
}
