import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
class TreeNode{
	int value; 
	TreeNode rightNode; 
	TreeNode leftNode;
	public TreeNode(int val){
		value = val;
	}
}

public class BTTree {
	public static TreeNode root; 
	public static Stack<TreeNode> stack = new Stack<TreeNode>();
	public static LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
	public static void addNode(TreeNode node, int val){
		if(node == null){
			node = new TreeNode(val);
			return;
		}
		if(val >=node.value)
			addNode(node.rightNode, val);
		else if(val < node.value)
			addNode(node.leftNode,val);
	}
	
	public static int treeHeight(TreeNode node){
		int length =1;
		//if(queue.get)
		
		return length; 
	}
	
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.print("enter no of Nodes: ");
			int N = in.nextInt();
			
			for(int i=0; i<N; i++){
				System.out.println("Enter next node value:");
				addNode(root, in.nextInt());
			}	

	}

}
