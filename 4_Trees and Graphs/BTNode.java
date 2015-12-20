
public class BTNode {
	int data;
	BTNode lChild = null;
	BTNode rChild = null;
	BTNode p = null;
	public BTNode(int d){
		data = d;
	}
	public BTNode() {
		data = -1;
		lChild = null;
		rChild = null;	
		p = null;
	}
	public int getData() {
		return this.data;
	}

	public void setData(int a) {
		this.data = a;
	}

	public void setLeft(BTNode left) {
		this.lChild = left;
	}

	public void setRight(BTNode right) {
		this.rChild = right;
	}

	public BTNode getLeft() {
		return this.lChild;
	}

	public BTNode getRight() {
		return this.rChild;
	}
	
	public static int depth(BTNode root){
		if(root == null) return 0;
		return 1 + Math.max(depth(root.getLeft()), depth(root.getRight()));	
	}
	
	public static void printInOrder(BTNode root){
		if(root != null){
			printInOrder(root.getLeft());
			System.out.println(root.getData() + " ");
			printInOrder(root.getRight());
		}
	}
	public static void printPreOrder(BTNode root){
		if(root != null){
			System.out.println(root.getData() + " ");
			printPreOrder(root.getLeft());
			printPreOrder(root.getRight());
		}
	}
	public static void printPostOrder(BTNode root){
		if(root != null){
			printPostOrder(root.getLeft());
			printPostOrder(root.getRight());
			System.out.println(root.getData() + " ");
		}
	}
}
