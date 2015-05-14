import java.util.Scanner;
public class UtopianTree {

	public static int springGrowth(int height){
		return height*2;
	}
	public static int summerGrowth(int height){
		return height+1;
	}
	
	public static void main(String []arg){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt(); 
		int yrs =0; 
		int treeHeight=1; 
		for(int i=0; i<t; i++){
			yrs = in.nextInt();
			treeHeight =1;
			for(int j = 0; j<yrs; j++){
				//System.out.println("j: " + (j%2));
				if(j%2==0)
					treeHeight = springGrowth(treeHeight);
				else 
					treeHeight = summerGrowth(treeHeight);
			}
			System.out.println(treeHeight);
		}
		
	}
	
	
}

