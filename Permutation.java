import java.util.Scanner;


public class Permutation {
	
	public static void permutation(int var[], int idx,int n){
		
		int temp; 
		if(idx == n){
			for(int i=0; i<n; i++)
				System.out.print(var[i]+" ");
			System.out.println();
		}else{
				for(int i=idx; i<n; i++)
				{
					temp = var[idx]; var[idx]= var[i]; var[i] =temp; 
					permutation(var, idx+1, n);
					temp = var[idx]; var[idx] = var[i] ; var[i] = temp; 
				}
		}
	}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int var[] = {1,2,3,4};
		permutation(var, 0, 4);
		

	}

}
