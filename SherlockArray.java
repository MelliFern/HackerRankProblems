import java.util.Scanner;


public class SherlockArray {
	 
	
	public static boolean findSolution(int input[], int sum){
		if(input.length == 1)
			return true;
		int sumLeft =0, sumRight = sum - input[0];
		for(int i=1; i<input.length-1; i++){
			sumLeft = sumLeft+input[i-1];
			sumRight = sumRight - (input[i]);
			//System.out.println(sumLeft+" "+ sumRight);	
			if(sumLeft == sumRight)
				return true; 
		}
			return false;
	}

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		int N; 
		int input[]; 
		int sum=0; 
		for(int t=0; t<T; t++){
			sum =0; 
			 N = in.nextInt();
			 input = new int[N];
			 
			 for(int i=0; i<N; i++){
				 input[i] = in.nextInt();
				 sum = sum+input[i];
			 }
			if(findSolution(input, sum))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
		

	}

}
