
public class isSubtree4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static boolean isSubtree(BTNode large, BTNode small){
		if(small == null) return true;
		if(large == null) return false;
		if(large.getData() == small.getData())
			return matchTree(large, small);
		return isSubtree(large.getLeft(), small) || isSubtree(large.getRight(), small);
	}
	
	public static boolean matchTree(BTNode r1, BTNode r2){
		if(r1 == null && r2 == null) return true;
		if(r1 == null || r2 == null) return false;
		if(r1.getData() != r2.getData()) return false;
		return matchTree(r1.getLeft(), r2.getLeft()) && matchTree(r1.getRight(), r2.getRight());
	}

}
