import java.util.Scanner;


public class InsertionSort1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); 
		
		int input[] = new int[N];
		
		for(int i=0; i<N; i++){
			input[i] = in.nextInt(); 
		}
		int idx, temp; 
		for(int i=1; i<N; i++){
			if (input[i-1] > input[i]){
				idx = i; 
				temp = input[i];
				while(idx>0 && input[idx-1]> temp){
					input[idx] = input[idx-1];
					idx--; 
					for(int k=0; k<N ; k++)
						System.out.print(input[k] +" ");
					System.out.println();
					
				}
				input[idx] =temp;
				for(int k=0; k<N ; k++)
					System.out.print(input[k] +" ");
				System.out.println();
			}
		}

	}

}
