import java.util.Scanner;


public class MaxIndexProduct {
	public static Long input [];
	public static int N;
	public static Long max, min; 
	
	public static int left(int idx ){
		
		for(int i=idx-1; i>0; i--){
			if(input[i]> input[idx]){
				return i;
			}
		}
		 return 0;
	}
	public static int right(int idx ){
		
		for(int i=idx+1; i<=N; i++){
			if(input[i]> input[idx]){
				return i;
			}
		}
		 return 0;
	}
	
	public static int  maxIndexProduct(){
		int max = 0; 
		int val;
		for(int i=1; i<=N; i++){
			val = left(i)* right(i);
			//System.out.println(left(i)+"  "+ right(i));
			if (val > max)
				max = val; 
		}
		return max;
	}
	
	public static void maxmin(){
		min= input[1];
		max = input[1];
		for(int i=1; i<=N; i++){
			if(input[i]> max)
				max = input[i];
			else if (input[i]< min)
				min = input[i];
		}
			
		
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		N = in.nextInt(); 
	
		input = new Long [N+1];
		for(int i=1; i<=N; i++)
			input[i] = in.nextLong(); 
			
		System.out.println(maxIndexProduct());
		//maxIndexProduct();
	}

}
