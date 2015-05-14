import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Node{
	int value; 
	boolean visited = false; 
	ArrayList<Integer> connectedNodes = new ArrayList<Integer>(); 
	
	public Node(int val){
		value = val;
	}
}

class Tree{
	
	HashMap<Integer, Node> trees = new HashMap<Integer, Node>();
	int cutEdges = 0; 
	int len = 0;
	
	public void addNodes(int nodeValue){
		if(trees.get(nodeValue)== null){
			Node newNode = new Node(nodeValue);
			trees.put(nodeValue, newNode); 
		}
	}
	
	public void addEdge(int toNode, int fromNode){
		addNodes(toNode); 
		addNodes(fromNode);
		trees.get(fromNode).connectedNodes.add(toNode);
	}
	
	public int pathLen(Node currNode){
		currNode.visited = true; 
		if(currNode.connectedNodes.size() == 0)
			return 1; 
		len =1; 
		for(int i = 0; i < currNode.connectedNodes.size();i++)
			len += pathLen(trees.get(currNode.connectedNodes.get(i)));

		//System.out.println("len:"+ len + "node:" + currNode.value);	
		if(len > 0 && len%2 == 0){
			cutEdges += 1;
			len = 0;			
		}	
		return len; 
	}	
}

public class EvenTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Tree tree = new Tree(); 
		int N = in.nextInt();
		int M = in.nextInt();
		
		for(int i=0; i<M; i++)
			tree.addEdge(in.nextInt(), in.nextInt());
		
		for(Integer key: tree.trees.keySet()){
			if(!tree.trees.get(key).visited)
				if(tree.pathLen(tree.trees.get(key))==0)
					tree.cutEdges--;
		}
		
		 
			
		
		System.out.println(tree.cutEdges);
		
	}

}
