/*
 * You are given two sorted arrays, A and B, and A has a large enough buffer at the end to hold B. 
 * Write a method to merge B into A in sorted order.
 */
public class mergeSorted9_1 {
	public static void main(String[] args){
		int[] A = new int[20];
		int[] B = new int[5];
		A[0] = 1;
		A[1] = 4;
		A[2] = 5;
		A[3] = 6;
		A[4] = 9;
		A[5] = 12;
		A[6] = 15;
		B[0] = 2;
		B[1] = 7;
		B[2] = 9;
		B[3] = 10;
		B[4] = 13;
		int n = 7, m = 5;
		sort(A, B, n, m);
		for(int i = 0; i < m + n; i ++)
			System.out.println(A[i]);
	}
	
	public static int[] sort(int[] A, int[] B, int n, int m){
		//A.length		
		int index = m + n - 1;
		int i = n - 1;
		int j = m - 1;
		while(i >= 0 && j >= 0){
			if(A[i] > B[j])
				A[index--] = A[i--];
			else
				A[index--] = B[j--];
		}
		while(j >= 0)
			A[index --] = B[j--];		
		return A;
	}
	
}
