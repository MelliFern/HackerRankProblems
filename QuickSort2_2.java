import java.util.ArrayList;
import java.util.Scanner;


public class QuickSort2_2 {

	public static int[] quickSort(int[] input, int len){
		for(int i=0; i<len; i++)
			System.out.println(input[i]);
		System.out.println("size:"+ input.length+" len:"+ len);
		if(len < 2)
			return input;
		
		int temp, val;
		int[] right = new int[len];
		int[] left = new int[len];
		int pivot = input[0]; 
		int r=0, l=0, c=0;
		
		if(len ==2){
			if(input[0]>input[1]){
				temp = input[0];
				input[0]= input[1];
				input[1]= temp; 
			}
		} else {
						
			for(int i=0; i< len; i++){
				val = input[i];
				
				if(val > pivot){
					right[r]= val;
					r++;
				}else if (val < pivot){
					left[l]= val;
					l++;
				}else
					c++;
			}
			

			right = quickSort(right, r); 
			left = quickSort(left, l);
 
			
			for(int i=0; i<l; i++)
				input[i] = left[i];
			for(int i=0; i<c; c++)
				input[l+i] = pivot; 
			for(int i=0; i<r; i++)
				input[l+c+i]=right[i];
			
			
		}
	
		for(int i=0; i<len; i++)
			System.out.print(input[i]+" ");
		System.out.println();
		
		return input;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		int N = in.nextInt(); 
		int [] input = new int [N];
		for(int i=0; i<N ; i++){
			input[i]= in.nextInt(); 
		}
		
		quickSort(input, N);
	}

}
