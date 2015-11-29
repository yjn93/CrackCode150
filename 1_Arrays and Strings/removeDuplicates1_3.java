
public class removeDuplicates1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaabbbccabcdefdefdef";
		System.out.println(removeDuplicatesNoBuffer(str));
		System.out.println(removeDuplicates(str));
	}
	
	//no more buffer
	private static String removeDuplicatesNoBuffer(String str){

		if(str == null) return str;
		if(str.length() < 2) return str;
		char []s = str.toCharArray();
		int tail = 1;
		for(int i = 1; i < s.length; i ++){
			int j;
			for(j = 0; j < tail; j ++){
				if(s[j] == s[i]) break;
			}
			if(j == tail){
				s[tail] = s[i];
				tail ++;
			}
		}
		while(tail < s.length) {
			s[tail] = 0;
			tail ++;
		}
		return new String(s);
	}
	
	//same as is unique char 1_1
	private static String removeDuplicates(String str){
		boolean []check = new boolean[256];
		StringBuffer s = new StringBuffer(str);
		for(int i = 0; i < s.length(); i ++){
			int val = s.charAt(i);
			if(check[val]){
				s.deleteCharAt(i);	
				i --;
			}
			check[val] = true;
		}
		return s.toString();
	}

}
