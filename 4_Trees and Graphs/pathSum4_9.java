
public class pathSum4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTNode root = new BTNode(5);
		root.setLeft(new BTNode(2));
		root.setRight(new BTNode(6));
		root.getLeft().setLeft(new BTNode(1));
		root.getLeft().setRight(new BTNode(3));
		root.getLeft().getLeft().setLeft(new BTNode(0));
		listEachDepth4_4.printLists(listEachDepth4_4.createLists(root));
		int[] path = new int[BTNode.depth(root)];
		System.out.println(BTNode.depth(root));
		findPath(root, 8, path, 0);
	}

	public static void findPath(BTNode n, int sum, int[] path, int level){
		if(n == null) return;
		path[level] = n.getData();
		int temp = 0;
		for(int i = level; i > -1; i --){
			temp += path[i];
			if(temp == sum) print(path, i, level);
		}
		findPath(n.getLeft(), sum, path, level + 1);
		findPath(n.getRight(), sum, path, level + 1);
	}
	
	public static void print(int[] path, int start, int end){
		for(int i = start; i <= end; i ++){
			System.out.print(path[i] + " ");
		}
		System.out.println("");
	}
}
