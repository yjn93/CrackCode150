import java.util.ArrayList;

public class findMissingInt5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(0);
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		//array.add(5);
		array.add(6);
		array.add(7);
		array.add(8);
		array.add(9);
		array.add(10);
		array.add(11);
		System.out.println("Missing: " + findMissing(array));
	}
	
	
	
	public static int findMissing(ArrayList<Integer> array){
		int temp = 0;
		for(int i = 1; i < array.size(); i ++){
			if((array.get(i) & 1) == temp)
				return array.get(i) - 1;
			temp ^= 1;
		}
		return -1;
	}
}
