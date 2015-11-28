
public class isUniqueChar1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(checkLowerLetter("abebcaA"))
			System.out.println("This String has all unique characters");
		if(checkGeneral("abA1c2@dD@a"))
			System.out.println("This String has all unique characters");
		

	}
	
	private static boolean checkGeneral(String str){
		boolean[] check_set = new boolean[256];
		for(int i = 0; i < str.length(); i ++){
			int val = str.charAt(i);
			if(check_set[val]){
				System.out.println(str.charAt(i) + ": first repeat character");
				return false;
			}
			check_set[val] = true;
		}
		return true;
	}
	private static boolean checkLowerLetter(String str){
		//use a bit vector to check, assume the string only contains lower-case letters
		int check = 0;
		for(int i = 0; i <str.length(); i ++){
			int val = str.charAt(i)-'a';
			if((check & (1<<val)) > 0) {
				System.out.println(str.charAt(i) + ": first repeat character");
				return false;
			}
			check |= (1<<val);
		}
		return true;
	}
}
