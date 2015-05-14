import java.util.Arrays;
import java.util.Scanner;


public class IcecreamPalor {

	
	// N2 time complexitiy 
	public static void iceCreamSelection(int M, int input[]){
		int flavor1 =0, flavor2=0; 
		for(int i=0; i<input.length; i++){
			flavor1 = i; 
			for(int j=i+1; j< input.length; j++){
				if(input[i]+ input[j]== M){
					flavor2 = j;
					break;
				}
				
			}
			if(flavor2>0)
				break;
		}
		System.out.println((flavor1+1) + " "+ (flavor2+1));
		
	}
	
	/*public static int searchVal(int val, int sortedInput[]){
		
		for(int i=0; i<sortedInput.length; i++){
			if (val == sortedInput)
			
		}
	}
	public static void iceCreamSelection(int M, int input[], int sortedInput[]){
		int flavor1=0, flavor2=0, val; 
		int flavor2Val= input[0]; 
		for(int i=0; i<input.length; i++){
			flavor1= i; 
			val = M-flavor1; 
			flavor2Val = searchVal(val,i, sortedInput);
		}
		
	}*/
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int T = in.nextInt();
		int M, N; 
		int input[];
		int sortedInput[];
		
		for(int i=0; i<T ; i++){
			M = in.nextInt(); 
			N = in.nextInt(); 
			input= new int[N];
			sortedInput = new int[N];
			
			 for(int k=0; k<N; k++)
				input[k]= in.nextInt();

			iceCreamSelection(M, input);
			
				//Arrays.sort(sortedInput);
			//iceCreamSelection(M,input, sortedInput);
		
		}

	}

}
