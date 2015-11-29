
/*
 * Assume you have a method isSubstring which checks if one word is a substring of another. 
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring 
 * (i.e., “waterbottle” is a rotation of “erbottlewat”). 
 */

public class isRotatedString1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private static boolean isRotate(String a, String b){
		if(a == null || b == null || a.length() != b.length())
			return false;
		String aa = a + a;
		return isSubString(aa, b);
	}
	private static boolean isSubString(String s1,String s2){
		//this is suppose to given
		return true;
	}

}
