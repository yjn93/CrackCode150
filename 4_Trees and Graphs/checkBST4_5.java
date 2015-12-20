
public class checkBST4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTNode root = new BTNode(5);
		root.setLeft(new BTNode(2));
		root.setRight(new BTNode(6));
		root.getLeft().setLeft(new BTNode(1));
		root.getLeft().setRight(new BTNode(3));
		root.getLeft().getLeft().setLeft(new BTNode(0));
		listEachDepth4_4.printLists(listEachDepth4_4.createLists(root));
		if(checkBST(root)) System.out.println("is BST");
		else System.out.println("is not BST");
	}
	public static int lastValue = Integer.MIN_VALUE;
	public static boolean checkBST(BTNode n){
		if(n == null) return true;
		if(!checkBST(n.getLeft())) return false;
		if(n.getData() <= lastValue) return false;
		lastValue = n.getData();
		if(!checkBST(n.getRight())) return false;
		
		return true;
	}

}
