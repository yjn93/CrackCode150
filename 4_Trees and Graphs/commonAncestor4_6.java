/*
 * Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree. 
 * Avoid storing additional nodes in a data structure. 
 * NOTE: This is not necessarily a binary search tree.
 */
public class commonAncestor4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTNode root = new BTNode(5);
		root.setLeft(new BTNode(2));
		BTNode a = new BTNode(6);
		root.setRight(a);
		root.getLeft().setLeft(new BTNode(1));
		BTNode b = new BTNode(7);
		root.getLeft().setRight(b);
		BTNode c = new BTNode(8);
		root.getLeft().getLeft().setLeft(c);
		listEachDepth4_4.printLists(listEachDepth4_4.createLists(root));
		System.out.println("common ancestor: " + commonAncestor(root, c, b).getData());
	}
	public static boolean isChild(BTNode root, BTNode n){
		if(root == null || n == null) return false;
		if(root == n) return true;
		return isChild(root.getLeft(), n) || isChild(root.getRight(), n);
	}
	
	public static BTNode commonAncestor(BTNode root, BTNode p, BTNode q){
		if(root == null || p == null || q == null) return null;
		if(root == p || root == q) return root;
		boolean p_in_left = isChild(root.getLeft(), p);
		boolean q_in_left = isChild(root.getLeft(), q);
		if(p_in_left != q_in_left) return root;
		if(p_in_left) return commonAncestor(root.getLeft(), p, q);
		return commonAncestor(root.getRight(), p, q);
	}
}
