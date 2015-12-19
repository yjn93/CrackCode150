
public class isBalanced4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTNode root = new BTNode(1);
		root.setLeft(new BTNode(2));
		root.setRight(new BTNode(3));
		root.getLeft().setLeft(new BTNode(4));
		root.getLeft().setRight(new BTNode(5));
		root.getLeft().getLeft().setLeft(new BTNode(6));
		BTNode.printInOrder(root);
		if(isBalanced(root)) System.out.println("is balanced");
		else System.out.println("is not balanced");		
		
	}
	static boolean isBalanced(BTNode root){
		return maxDepth(root) - minDepth(root) <= 1;
	}
	static int maxDepth(BTNode root){
		if(root == null)
			return 0;
		return Math.max(maxDepth(root.lChild), maxDepth(root.rChild)) + 1;
	}
	static int minDepth(BTNode root){
		if(root == null)
			return 0;
		return Math.min(minDepth(root.lChild), minDepth(root.rChild)) + 1;
	}

}
