import java.util.ArrayList;
import java.util.LinkedList;

public class listEachDepth4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTree tree = new BSTree();
		tree.insert(8);
		tree.insert(5);
		tree.insert(1);
		tree.insert(0);
		tree.insert(2);
		tree.insert(7);
		tree.insert(6);
		tree.insert(12);
		tree.insert(4);
		printLists(createLists(tree));
		tree.delete(5);
		printLists(createLists(tree));
		tree.delete(8);
		printLists(createLists(tree));
		tree.insert(20);
		tree.insert(14);
		tree.insert(18);
		tree.insert(16);
		tree.insert(19);
		printLists(createLists(tree));
		tree.delete(12);
		printLists(createLists(tree));
	}
	public static ArrayList<LinkedList<BTNode>> createLists(BSTree T){
		int depth = 0;
		ArrayList<LinkedList<BTNode>> results = new ArrayList<LinkedList<BTNode>>();
		LinkedList<BTNode> list = new LinkedList<BTNode>();
		list.add(T.root);
		results.add(depth, list);
		while(true){
			list = new LinkedList<BTNode>();
			for(int i = 0; i < results.get(depth).size(); i ++){
				BTNode n = results.get(depth).get(i);
				if(n != null){
					if(n.getLeft() != null) list.add(n.getLeft());
					if(n.getRight() != null) list.add(n.getRight());
				}
			}
			if(list.size() == 0)
				break;
			depth ++;
			results.add(depth, list);
		}
		return results;
	}
	
	public static void printLists(ArrayList<LinkedList<BTNode>> lists){
		for(int i = 0; i < lists.size(); i ++){
			LinkedList<BTNode> list = lists.get(i);
			System.out.print("depth" + i +": " + list.get(0).getData());			
			for(int j = 1; j < list.size(); j ++){
				System.out.print("-> " + list.get(j).getData());
			}
			System.out.println();
		}
	}
}
