import java.util.ArrayList;
import java.util.Scanner;


public class MatrixTraversal {
	
	public static int matrix[][];
	public static int M, N; 
	public static ArrayList<Integer> paths = new ArrayList<Integer>();
	
	public static int findpath( int col, int row, int pathLen){
		if(col == M-1 && row == N-1)
			return pathLen;
		int maxpath = pathLen; 
		System.out.print(row +" c:"+ col+ " pathLen:"+ pathLen+"\n");
					
		if((col+1) < N && matrix[row][col+1] ==1){
			pathLen = findpath(row,col+1,pathLen+1);
			if(maxpath < pathLen)
				maxpath = pathLen; 
			System.out.println("pathLen:"+pathLen+"maxpath: "+ maxpath);
		}
		if(row+1< M && matrix[row+1][col]==1){
			pathLen = findpath(row+1,col,pathLen+1);
			if(maxpath < pathLen)
				maxpath = pathLen; 
			System.out.println("pathLen:"+pathLen+" maxpath: "+ maxpath);
		}
		if(col-1 >= 0 && matrix[row][col-1]==1){
			pathLen = findpath(row,col-1,pathLen+1);
			if(maxpath < pathLen)
				maxpath = pathLen;
			System.out.println("pathLen:"+pathLen+"maxpath: "+ maxpath);
		}
			
			return maxpath; 
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		 
		M = in.nextInt(); 
		N = in.nextInt(); 
		matrix = new int [M][N];
		
		for(int r=0; r<M;r++)
			for(int c=0; c<N; c++)
				matrix[r][c] = in.nextInt();
		
		//for(int r=0; r<M;r++){
			for(int c=0; c<N; c++){
				if(matrix[0][c] ==1){
					System.out.println(findpath(0,c,1));
					break;
				}
			}
			
		
	}

}
