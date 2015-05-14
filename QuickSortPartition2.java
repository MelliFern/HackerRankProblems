import java.util.ArrayList;
import java.util.Scanner;


public class QuickSortPartition2 {

	public static ArrayList<Integer> quickSort(ArrayList<Integer> input){
		if(input.size() < 2)
			return input;
		
		int temp, val;
		ArrayList<Integer> right = new ArrayList<Integer>();
		ArrayList<Integer> left = new ArrayList<Integer>();
		int pivot = input.get(0); 
		int r=0, l=0, c=0;
		
		if(input.size() ==2){
			if(input.get(0)>input.get(1)){
				temp = input.get(0);
				input.set(0, input.get(1));
				input.set(1, temp); 
			}
		} else {
						
			for(int i=0; i< input.size(); i++){
				val = input.get(i);
				
				if(val > pivot){
					right.add(r,val);
					r++;
				}else if (val < pivot){
					left.add(l,val);
					l++;
				}else
					c++;
			}
			

			right = quickSort(right); 
			left = quickSort(left);
 
			
			for(int i=0; i<l; i++)
				input.set(i,left.get(i));
			for(int i=0; i<c; c++)
				input.set((l+i), pivot); 
			for(int i=0; i<r; i++)
				input.set((l+r+i),right.get(i));
			
			
		}
	
		for(int i=0; i<input.size(); i++)
			System.out.print(input.get(i)+" ");
		System.out.println();
		
		return input;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		int N = in.nextInt(); 
		ArrayList<Integer> input = new ArrayList<Integer>();
		for(int i=0; i<N ; i++){
			input.add(i, in.nextInt()); 
		}
		System.out.println(input.get(0));
		quickSort(input);
	}

}
