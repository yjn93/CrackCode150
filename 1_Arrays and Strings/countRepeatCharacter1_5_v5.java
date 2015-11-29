/*
 * Implement a method to perform basic string compression using the counts of 
 * repeated characters. For example, the string aabcccccaaa would become 
 * a2blc5a3. If the "compressed" string would not become smaller than the original
 * string, your method should return the original string.
*/

public class countRepeatCharacter1_5_v5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabcccccaaa";
		System.out.println(str);
		System.out.println(countCharacterString(str));
	}

	//get the new string
	private static String countCharacterString(String s){
		int size = countSize(s);
		if(size >= s.length()) return s;
		StringBuffer newString = new StringBuffer();
		int count = 1;
		char last = s.charAt(0);
		for(int i = 1; i < s.length(); i ++){
			if(last == s.charAt(i))
				count ++;
			else{
				newString.append(last).append(count);
				count = 1;
				last = s.charAt(i);
			}
		}
		newString.append(last).append(count);
		return newString.toString();
	}
	
	//count the size of new string
	private static int countSize(String s){
		if(s == null || s.length() == 0) return 0;
		char c = s.charAt(0);
		int count = 1;
		int size = 0;
		for(int i = 1; i < s.length(); i ++){
			if(s.charAt(i) == c){
				count ++;
				
			} else{
				size += 1 + String.valueOf(count).length();
				count = 1;
				c = s.charAt(i);
			}			
		}
		size += 1 + String.valueOf(count).length();
		return size;
	}
}
