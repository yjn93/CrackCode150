
import java.util.Arrays;

public class isAnagram1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcke";
		String s2 = "abkec";
		if(checkAnagram(s1, s2)) 
			System.out.println("are anagrams");
		else
			System.out.println("are not anagrams");
		if(checkAnagramSort(s1, s2)) 
			System.out.println("are anagrams");
		else
			System.out.println("are not anagrams");
	}

	private static boolean checkAnagram(String s1, String s2){
		if(s1.length() != s2.length()) return false;
		int []letters = new int[256];
		for(int i = 0; i < s1.length(); i ++){
			letters[s1.charAt(i)] ++;
		}
		for(int i = 0; i < s2.length(); i ++){
			if(letters[s2.charAt(i)] == 0) return false;
			letters[s2.charAt(i)] --;
		}
		return true;
	}
	private static boolean checkAnagramSort(String s1, String s2){
		if(s1.length() != s2.length()) return false;
		char[] s1_array = s1.toCharArray();
		char[] s2_array = s2.toCharArray();
		Arrays.sort(s1_array);
		Arrays.sort(s2_array);
		if(new String(s1_array).equals(new String(s2_array)))
			return true;
		return false;
	}
}
