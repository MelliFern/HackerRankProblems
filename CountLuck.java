import java.util.Scanner;

class cell {
	char value; 
	boolean visited = false;
	public cell(char val){
		value = val;
	}
}

public class CountLuck {
	public static int N, M, startRow, startCol; 
	public static String matrix [];
	public static int wandUse=0;
	
	public static void findStartPoint(){
		int val ; 
		for(int i=0; i<N ; i++){
			val = matrix[i].indexOf('M'); 
			if(val >= 0){
				startRow = i; 
				startCol = val;
				break;
			}
		}
			
	}
	
	public static Boolean traverseForest(int row, int col){
		if(matrix[row].charAt(col)=='*')
			return true; 
		
		return true; 
	}
	
	
	public static void findWandUse(){
		
		findStartPoint();
		traverseForest(startRow, startRow); 
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		N = in.nextInt(); 
		M = in.nextInt();
		int row, col;
		matrix = new String [N];
		//System.out.println(M+" "+N);
		for(int i=0; i<N; i++){
			matrix[i]= in.next();
		}
		//traverseForest();
	}

}
