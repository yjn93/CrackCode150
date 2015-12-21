/*
 * Given a (decimal - e.g. 3.72) number that is passed in as a string or double, print the binary representation. 
 * If the number can not be represented accurately in binary, print “ERROR”
 */
public class printBinary5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Binary represention of double:" + printBinary(5.625));
		System.out.println("Binary represention of string:" + printBinary("5.375"));
	}
	
	public static String printBinary(double num){
		int int_part = (int) num;
		double dec_part = num - (double)int_part;
		StringBuffer int_string = new StringBuffer();
		while(int_part > 0){
			int r = int_part % 2;
			int_part >>= 1;
			int_string.insert(0, r);
		}
		StringBuffer dec_string = new StringBuffer();
		while(dec_part > 0){
			System.out.println("dec_part" + dec_part);
			if(dec_string.length() > 32) return "ERROR";			
			double r = dec_part * 2;	
			System.out.println("r: " + r);
			if(r >= 1){
				dec_string.append(1);
				dec_part = r - 1;
			}
			else{ 
				dec_string.append(0);
				dec_part = r;
			}
		}
		return int_string + "." + dec_string;
	}
	
	public static String printBinary(String num){
		int int_part = Integer.parseInt(num.substring(0, num.indexOf('.')));
		double dec_part = Double.parseDouble(num.substring(num.indexOf('.'),num.length()));
		StringBuffer int_string = new StringBuffer();
		while(int_part > 0){
			int r = int_part % 2;
			int_part >>= 1;
			int_string.insert(0, r);
		}
		StringBuffer dec_string = new StringBuffer();
		while(dec_part > 0){
			if(dec_string.length() > 32) return "ERROR";
			double r = dec_part * 2;
			if(r >= 1){
				dec_string.append(1);
				dec_part = r - 1;
			}
			else{
				dec_string.append(0);
				dec_part = r;
			}
		}
		return int_string + "." + dec_string;
	}
}
