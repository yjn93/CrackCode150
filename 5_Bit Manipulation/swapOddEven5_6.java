/*
 * Write a program to swap odd and even bits in an integer with as few instructions as possible 
 * (e.g., bit 0 and bit 1 are swapped, bit 2 and bit 3 are swapped, etc).
 */
public class swapOddEven5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 37;
		System.out.println("a: " + Integer.toBinaryString(a));
		int b = swap(a);
		System.out.println("Swap a: " +  Integer.toBinaryString(b));
	}

	public static int swap(int a){
		return (a & 0xaaaaaaaa) >> 1 | (a & 0x55555555) << 1;
	}
}
