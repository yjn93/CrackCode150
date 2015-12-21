/*
 * You are given two 32-bit numbers, N and M, and two bit positions, i and j. 
 * Write a method to set all bits between i and j in N equal to M 
 * (e.g., M becomes a substring of N located at i and starting at j).
 * EXAMPLE:
 * Input: N = 10000000000, M = 10101, i = 2, j = 6
 * Output: N = 10001010100
 */
public class updateBits5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 16;
		int m = 5;
		System.out.println("n: " + Integer.toBinaryString(n));
		System.out.println("m: " + Integer.toBinaryString(m));
		n = updateBits(n, m, 1, 3);
		System.out.println("n: " + Integer.toBinaryString(n));

	}
	public static int updateBits(int n, int m, int start, int end){
		int allOnes = ~0;
		int left = allOnes << (end + 1);
		int right = ~(allOnes << start);
		int mask = left | right;
		System.out.println("mask: " + Integer.toBinaryString(mask));
		return n & mask | m << start;
	}
}
