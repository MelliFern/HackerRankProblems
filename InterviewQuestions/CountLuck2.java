package InterviewQuestions;

import java.util.Scanner;

public class CountLuck2 {
	public static int M, N; 
	public static int wand; 
	public static void printMatrix(char matrix[][]){
		
		for(int r=0; r<N; r++){
			for(int c=0; c<M; c++)
				System.out.print(matrix[r][c]+" ");
			System.out.println();
		}
		System.out.println("==============================================");
	}
	
	public static boolean findPath(char matrix[][], int row, int col, int len){
		boolean flag = false; 
		int noOfPaths =0; 
		if(matrix[row][col]=='*')
			return true; 
		matrix[row][col] = '-';
		//
		 
		 if(col+1 < M && (matrix[row][col+1]=='.'))
			noOfPaths++; 
		if(col-1 >=0 && (matrix[row][col-1]=='.' ))
			noOfPaths++; 
		// up
		if(row-1 >= 0 && (matrix[row-1][col]=='.'))
			noOfPaths++; 
		// down 
		if(row+1 < N && (matrix[row+1][col]=='.'))
			noOfPaths++; 
		
		if (noOfPaths >1)
			wand--; 
		
		// right 
		if(col+1 < M && (matrix[row][col+1]=='.' || matrix[row][col+1]=='*')){
			 
			flag = findPath(matrix, row, col+1, len+1);
			if(flag)
				return flag;
		}
		// left
		if(col-1 >=0 && (matrix[row][col-1]=='.' || matrix[row][col-1]=='*')){
			flag = findPath(matrix, row, col-1, len+1);
			if(flag)
				return flag;
		}
		// up
		if(row-1 >= 0 && (matrix[row-1][col]=='.' || matrix[row-1][col]=='*')){
			flag = findPath(matrix, row-1, col, len+1);
			if(flag)
				return flag;
		}
		// down 
		if(row+1 < N && (matrix[row+1][col]=='.'|| matrix[row+1][col]=='*')){
			flag = findPath(matrix, row+1, col, len+1);
			if(flag)
				return flag; 
		}
		//printMatrix(matrix);
		return flag; 
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str ; 
		int stRow=0,stCol=0;
		char val;
		int T = in.nextInt(); 
		for(int t=0; t<T; t++ ){
			N = in.nextInt(); 
			M = in.nextInt();
			char matrix[][] = new char [N][M];
			for(int i=0; i<N; i++){
				str= in.next();
				
				for(int j=0; j<str.length(); j++){
					val = str.charAt(j);
					matrix[i][j] = val; 
					//System.out.print(val);
					if(val =='M'){
						stRow = i; 
						stCol = j;
					}	
				}
			}
			wand = in.nextInt();
			//printMatrix(matrix);
			
			if(findPath(matrix, stRow, stCol, 0)){
				if(wand != 0)
					System.out.println("Oops!");
				else
					System.out.println("Impressed");
			}
		}
	}

}
