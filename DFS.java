import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


class Vertex{
	String vertexValue; 
	ArrayList<String> neighborList = new ArrayList<String>();
	boolean visited = false;
	
	public Vertex(String value){
		vertexValue = value;  
	}
	public void addNeighbor(String neighborVal){
		neighborList.add(neighborVal);
	}
	
}

public class DFS{
	
	HashMap<String, Vertex> vertexs = new HashMap<String, Vertex>();
	int idx =0;
	public void addVertex(String vertexValue){
		Vertex v1 = new Vertex(vertexValue);
		vertexs.put(vertexValue, v1); 
		idx++;
	}
	
	public void addEdge(String fromVertex, String toVertex){
		//System.out.println(" frm:"+ fromVertex+ "  ");
		vertexs.get(fromVertex).addNeighbor(toVertex);
	}
	
	public void visitVertex(Vertex vertex){
		if(!vertex.visited){
			System.out.println(vertex.vertexValue);
			vertex.visited = true;
		}
	}
	

	public void traverseGraph(){
		Vertex v ; 
		for(String key : vertexs.keySet()){
			v = vertexs.get(key);                                                           
			if(!v.visited){
				System.out.println("vertex:"+ v.vertexValue);
				traverse(v);
				/*visitVertex(v);
				for(int i=0; i<v.neighborList.size(); i++)
					visitVertex(vertexs.get((v.neighborList.get(i))));*/
			}	
				
		}
		
	}
	
	public void traverse(Vertex v){
		if(v.neighborList == null)
			return; 
		
		visitVertex(v); 
		for(int i=0; i<v.neighborList.size(); i++)
			traverse(vertexs.get((v.neighborList.get(i))));
	}
}



















