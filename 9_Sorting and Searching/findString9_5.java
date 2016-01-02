
public class findString9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = new String[10];
		words[0] = "apple";
		words[1] = "";
		words[2] = "";
		words[3] = "";
		words[4] = "banana";
		words[5] = "cider";
		words[6] = "";
		words[7] = "love";
		words[8] = "";
		words[9] = "";
		System.out.println("target index: " + search(words, "apple", 0, 9));
	}
	
	public static int search(String[] words, String target, int first, int last){
		while(first <= last){
			while(first <= last && words[last].equals("")){
				last --;
			}
			if(first > last) return -1;
			int middle = (first + last) / 2;
			while(words[middle] == "") middle ++;
			int c = words[middle].compareTo(target);
			if(c == 0) return middle;
			if(c < 0) first = middle + 1;
			else last = middle - 1;
		}
		return -1;
		
	}

}
