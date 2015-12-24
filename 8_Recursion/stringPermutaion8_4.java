import java.util.ArrayList;

public class stringPermutaion8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abce";
		print(permutation(s));
		
	}

	public static ArrayList<String> permutation(String s){
		ArrayList<String> permutations = new ArrayList<String>();
		if(s == null) return null;
		if(s.length() == 0){
			permutations.add("");
			return permutations;
		}
		char first = s.charAt(0);
		ArrayList<String> words = permutation(s.substring(1));
		for(String word: words){
			ArrayList<String> newWords = insert(first, word);
			permutations.addAll(newWords);
		}
		return permutations;
	}
	public static ArrayList<String> insert(char c, String s){
		ArrayList<String> words = new ArrayList<String>();
		for(int i = 0; i <= s.length(); i ++){
			String newWord = s.substring(0, i) + c + s.substring(i);
			words.add(newWord);
		}
		return words;
	}
	public static void print(ArrayList<String> words){
		int count = 0;
		for(String word: words){
			System.out.println(word + " ");
			count ++;
		}
		System.out.println("count: " + count);
	}
}
