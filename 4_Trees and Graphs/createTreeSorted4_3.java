
public class createTreeSorted4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6,7};
		BTNode tree = createTree(array);
		BTNode.printInOrder(tree);
		BTNode.printPostOrder(tree);
	}
	public static BTNode addNode(int[] array, int start, int end){
		if(end < start)
			return null;
		int mid = (start + end) / 2;
		BTNode midNode = new BTNode(array[mid]);
		midNode.setLeft(addNode(array, start, mid - 1));
		midNode.setRight(addNode(array, mid + 1, end));
		return midNode;
	}

	public static BTNode createTree(int[] array){
		return addNode(array, 0, array.length - 1);
	}
}
