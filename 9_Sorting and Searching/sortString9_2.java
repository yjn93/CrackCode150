import java.util.Arrays;

public class sortString9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = new String[10];
		words[0] = "hello";
		words[1] = "apple";
		words[2] = "banana";
		words[3] = "ehllo";
		words[4] = "naanba";
		words[5] = "hlleoa";
		words[6] = "nanaba";
		words[7] = "nnaeba";
		words[8] = "eaplp";
		words[9] = "elhlo";
		quickSort(words, 0, 9);
		for(int i = 0; i < words.length; i ++){
			System.out.print(words[i] + "   ");
		}
		System.out.println();		
	}
	
	public static void quickSort(String[] words, int first, int last){
		if(first < last){
			String pivot = words[first];
			int partitionPoint = partition(words, first, last, pivot);
			words[partitionPoint] = pivot;
			quickSort(words, first, partitionPoint - 1);
			quickSort(words, partitionPoint + 1, last);
		}
		return;
	}
	
	public static int partition(String[] words, int first, int last, String pivot){
		int low = first, high = last;
		while(low < high){
			int highVac = extendLargeRegion(words, pivot, low, high);
			int lowVac = extendSmallRegion(words, pivot, low + 1, highVac);
			low = lowVac;
			high = highVac - 1;
		}
		return low;
	}
	
	public static int extendLargeRegion(String[] words, String pivot, int low, int high){
		for(int i = high; i > low; i --){
			if(compareStrings(words[i], pivot) < 0){
				words[low] = words[i];
				return i;
			}
		}
		return low;
	}
	
	public static int extendSmallRegion(String[] words, String pivot, int low, int high){
		for(int i = low; i < high; i ++){
			if(compareStrings(words[i], pivot) > 0){
				words[high] = words[i];				
				return i;
			}
		}
		return high;
	}
	
	public static int compareStrings(String w1, String w2){
		char[] word1 = w1.toCharArray();
		char[] word2 = w2.toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
		return (new String(word1)).compareTo(new String(word2));
	}

}
