
public class reverseCString1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefg";
		System.out.println(str);
		System.out.println(reverse(str));
		System.out.println(reverseNoNewBuffer(str));
	}
	
	private static String reverse(String s){
		StringBuilder ary= new StringBuilder();
		for(int i=s.length()-1;i>-1;i--){
			ary.append(s.charAt(i));
		}
		
		String reversed =ary.toString();
		return reversed;
	}
	
	private static String reverseNoNewBuffer(String s){
		char []c = s.toCharArray();
		char temp;
		for(int i=0, j=s.length()-1;i<j;i++,j--){
			temp = c[i];
			c[i] = c[j];
			c[j] = temp;			
		}
		String reversed = String.valueOf(c);
		return reversed;
	}
}
