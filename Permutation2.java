
public class Permutation2 {

	public static void permutation(int input[], int idx, int n){
		int temp; 
		
		if(idx == n){
			for(int i=0; i<n; i++)
				System.out.print(input[i]+ " ");
			System.out.println();
			return ;
		}
		 for(int i=idx; i<n ; i++){
			 temp = input[i]; input[i] = input[idx]; input[idx] = temp;
			 permutation(input, idx+1, n);
			 temp = input[i]; input[i] = input[idx]; input[idx] = temp;
		 }
		
		
	}
	public static void main(String[] args) {
		int input[] = {1,2,3,4};
		
		permutation(input,0,4);

	}

}
