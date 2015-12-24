import java.util.ArrayList;

public class getSubsets8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> set, int index){
		ArrayList<ArrayList<Integer>> allSubsets;
		if(index == 1){
			allSubsets = new ArrayList<ArrayList<Integer>>();
			allSubsets.add(new ArrayList<Integer>());
		}
		else{
			allSubsets = subsets(set, index - 1);
			ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> subset: allSubsets){
				ArrayList<Integer> newSubset = new ArrayList<Integer>();
				newSubset.addAll(subset);
				newSubset.add(set.get(index));
				moreSubsets.add(newSubset);
			}
			allSubsets.addAll(moreSubsets);
		}
		return allSubsets;
	}

}
