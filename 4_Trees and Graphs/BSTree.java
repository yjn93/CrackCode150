// Binary Search Tree which implement insert, delete, successor(4_6 new version book), etc. 


public class BSTree {
	BTNode root = null;
	public BSTree(){
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
	
	public void delete(int key){
		BTNode parent = null;
		BTNode current = this.root;
		while(current!=null && current.getData() != key){
			parent = current;
			if(current.getData() < key)
				current = current.getRight();
			else current = current.getLeft();
		}
		if(current == null){
			System.out.println("This node does not exist.");
			return;
		}
		if(current.getLeft() == null)
			transplant(this, current, current.getRight());
		else if(current.getRight() == null)
			transplant(this, current, current.getLeft());
		else{
			BTNode successor = this.treeMinimum(current.getRight());
			if(successor.p != current){
				transplant(this, successor, successor.getRight());
				successor.setRight(current.getRight());
				successor.getRight().p = successor;
			}
			transplant(this, current, successor);
			successor.setLeft(current.getLeft());
			successor.getLeft().p = successor;
		}
			
	}
	
	public BTNode treeMinimum(BTNode n){
		while(n.getLeft() != null){
			n = n.getLeft();
		}
		return n;
	}
	
	public BTNode treeMaximum(BTNode n){
		while(n.getRight() != null){
			n = n.getRight();
		}
		return n;
	}	
	
	public BTNode successor(BTNode n){
		if(n.getRight() != null)
			return this.treeMinimum(n.getRight());
		BTNode current = n;
		while(current == current.p.getRight() && current.p != null)
			current = current.p;
		return current.p;
		
	}
	
	private static void transplant(BSTree T, BTNode u, BTNode v){
		if(u.p == null)
			T.root = v;
		else if (u == u.p.getLeft())
			u.p.setLeft(v);
		else u.p.setRight(v);
		if(v != null)
			v.p = u.p;
	}
	
	public static void main(String[] args){
		BSTree tree = new BSTree();
		tree.insert(3);
		tree.insert(2);
		tree.insert(5);
		tree.insert(0);
		tree.insert(1);
		BTNode.printInOrder(tree.root);
		tree.delete(3);
		BTNode.printInOrder(tree.root);
		tree.insert(8);
		tree.insert(6);
		tree.insert(7);
		tree.insert(12);
		tree.insert(4);
		tree.insert(3);
		BTNode.printInOrder(tree.root);
		tree.delete(2);
		BTNode.printInOrder(tree.root);
	}
}
