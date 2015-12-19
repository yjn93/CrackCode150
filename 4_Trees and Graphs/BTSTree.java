
public class BTSTree {
	BTNode root = null;
	public BTSTree(){
		root = null;
	}
	public void insert(int key){
		BTNode parent = null;
		BTNode current = this.root;
		while(current != null){
			parent = current;
			if(current.getData() < key)
				current = current.getRight();
			else current = current.getLeft();
		}
		current = new BTNode(key);
		current.p = parent;
		if(parent == null)
			this.root = current;
		else if(current.getData() < current.p.getData())
			current.p.lChild = current;
		else current.p.rChild = current;
			}
	
	public static void main(String[] args){
		BTSTree tree = new BTSTree();
		tree.insert(3);
		tree.insert(2);
		tree.insert(5);
		tree.insert(1);
		tree.insert(0);
		BTNode.printInOrder(tree.root);
	}
}
