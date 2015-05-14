import java.util.Scanner;


public class MaxSubArray {
	
	public static int maxSubArray(int array[]){
		int max_ending_here=0; 
		int startIdx = 0; 
		int endIdx = 1;
		int max_so_far = 0; 
		if(array.length == 1){
			for(int i=0; i<array.length; i++){
				max_ending_here = Math.max(array[i], max_ending_here+array[i]); 
				max_so_far = Math.max(max_so_far, max_ending_here);
			}
		}else{
			max_so_far =array[0];
		}
		
		return max_so_far; 
	}
	
	public static int maxSubArrayNon(int array[]){
		int sum = 0; 
		for(int i=0; i<array.length; i++){
			if(array[i] >0)
				sum += array[i]; 
		}
		return sum; 
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int T = in.nextInt(); 
		int N;
		int input[];
		for(int i=0; i<T; i++){
			N= in.nextInt(); 
			input = new int[N];
			for(int k=0; k<N ; k++)
				input[k]= in.nextInt();
			
			System.out.print(maxSubArray(input) +" ");
			System.out.print(maxSubArrayNon(input)+"\n");
			
		}

	}

}
