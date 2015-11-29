
public class replaceSpace1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc  eis abc";
		System.out.println(replaceSpace(str));
	}
	public static String replaceSpace(String s){
		int count = 0;
		for(int i = 0; i < s.length(); i ++){
			if(s.charAt(i) == ' ') count ++;
		}
		int len = s.length() + count*2;
		char[] c = new char[len];
		for(int i = s.length() - 1; i > -1; i --){
			if(s.charAt(i) == ' '){
				c[len-1] = '0';
				c[len-2] = '2';
				c[len-3] = '%';
				len = len - 3;
			}else{
				c[len-1] = s.charAt(i);
				len --;
			}				
		}
		return new String(c);
	}

}
