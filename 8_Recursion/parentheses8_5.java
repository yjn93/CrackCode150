/*
 * Implement an algorithm to print all valid (e.g., properly opened and closed) combinations of n-pairs of parentheses.
 * EXAMPLE:
 * 	input: 3 (e.g., 3 pairs of parentheses)
 * 	output: ()()(), ()(()), (())(), (()()), ((()))
 */

import java.util.ArrayList;

public class parentheses8_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(3);
	}

	public static void printPar(int l, int r, char[] str, int count){
		if(l<0 || r<0){
			System.out.println("unvalid");
			return;
		}
		if(l == 0 && r == 0){
			System.out.print(str);
			System.out.print(" ");
			return;
		}
		if(l > 0){
			str[count] = '(';
			printPar(l - 1, r, str, count + 1);
		}
		if(r > l){
			str[count] = ')';
			printPar(l, r - 1, str, count + 1);
		}
	}
	public static void print(int n){
		char[] str = new char[n*2];
		printPar(n, n, str, 0);
	}
}
