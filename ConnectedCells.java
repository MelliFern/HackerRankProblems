import java.util.Scanner;

class mCell {
	int value; 
	boolean visited = false; 
	
}



public class ConnectedCells {
	public static mCell grid[][];
	public static int row; 
	public static int col;
	public static int maxLen = 0; 
	
	public static int findPath(int r, int c, int pathLen){
		grid[r][c].visited = true; 
		//System.out.println("r:"+ r+" c:"+c);

		if(c+1 <col && grid[r][c+1].value ==1 && !grid[r][c+1].visited)
			pathLen = findPath(r,c+1,pathLen +1);
		if(r+1 <row && grid[r+1][c].value ==1 && !grid[r+1][c].visited)
			pathLen = findPath(r+1,c,pathLen+1);
		if(c-1 >=0 && grid[r][c-1].value ==1 && !grid[r][c-1].visited)
			pathLen = findPath(r,c-1,pathLen +1);
		if(r-1 >=0 && grid[r-1][c].value ==1 && !grid[r-1][c].visited)
			pathLen = findPath(r-1,c,pathLen+1);
		//diagonal test
		if(r-1 >=0 && c-1>=0 && grid[r-1][c-1].value ==1 && !grid[r-1][c-1].visited)
			pathLen = findPath(r-1,c-1,pathLen+1);
		if(r+1 <row && c-1>=0 && grid[r+1][c-1].value ==1 && !grid[r+1][c-1].visited)
			pathLen = findPath(r+1,c-1,pathLen+1);
		if(r-1 >=0 && c+1<col && grid[r-1][c+1].value ==1 && !grid[r-1][c+1].visited)
			pathLen = findPath(r-1,c+1,pathLen+1);
		if(r+1 <row && c+1<col && grid[r+1][c+1].value ==1 && !grid[r+1][c+1].visited)
			pathLen = findPath(r+1,c+1,pathLen+1);
		
		
		
		if(maxLen<pathLen)
			maxLen = pathLen; 
		//System.out.println("pathLen"+ pathLen);
		return maxLen; 
		
	}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		row = in.nextInt(); 
		col = in.nextInt(); 
		grid = new mCell[row][col];
		boolean flag = false; 
		
		for(int r=0; r<row; r++){
			for(int c=0; c<col; c++){
				mCell newcell = new mCell();
				newcell.value = in.nextInt();
				grid[r][c]= newcell;
			}
		}
		
		for(int r=0; r<row; r++){
			for(int c=0; c<col; c++){
				if(grid[r][c].value == 1 && !grid[r][c].visited){
					maxLen= (findPath(r,c,1));
					flag = true;
				}
			  }
			
			}
		
		System.out.println(maxLen);
	}

}
