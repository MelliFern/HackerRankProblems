import java.util.Scanner;


public class QuickSortPartition1 {
	
	
	public static void quickSort(int []input){
		int left[] = new int[input.length];
		int right[] = new int[input.length];
		int pivot = input[0];
		int pivotCount=0;
		int r=0,l=0;
		
		for(int i=0; i<input.length; i++){
			if(input[i] > pivot){
				right[r] = input[i];
				r++; 
			}else if(input[i]< pivot){
				left[l] = input[i];
				l++; 
			}else
				pivotCount++; 	
		}
		
		for(int idx=0; idx<l; idx++)
			input[idx]= left[idx]; 
		for(int idx=0; idx<pivotCount; idx++)
			input[l+idx] = pivot; 
		for(int idx=0; idx<r; idx++)
			input[l+pivotCount+idx] = right[idx];
		
		
		for(int j=0; j<input.length; j++)
			System.out.print(input[j]+" ");
		//return input;
		
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); 
		int input[] = new int [N]; 
		int val; 
		for(int i=0; i< N; i++){
			input[i] = in.nextInt();
		}
			
		quickSort(input);
		
		

	}

}
