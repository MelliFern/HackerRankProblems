import java.util.Scanner;
class MainClass{
	
	public static void main(String[]agr){
		Scanner in = new Scanner(System.in);
		DFS dfsGraph = new DFS();
		int N = in.nextInt(); 
		for(int i=0; i<N; i++)
			dfsGraph.addVertex(in.next());
		
		for (int i=0; i<7; i++){
			dfsGraph.addEdge(in.next(), in.next());
		}
		
		dfsGraph.traverseGraph();
		
	}


}
