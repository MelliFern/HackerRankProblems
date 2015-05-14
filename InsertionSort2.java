import java.util.Scanner;


	public class InsertionSort2 {
		
		public static void insertSort2(int input[]){
			int temp, idx; 
			int N= input.length;
			for(int i=1; i<N; i++){
				idx = i-1;
				temp = input[idx];
					//while(idx >0 && input[idx] > input[i]){
					if(input[i-1]> input[i]){
						temp = input[i];
						while(idx>=0 && input[idx] > temp){
							input[idx+1] = input[idx]; 
							idx--; 
						}
						input[idx+1] = temp;
						for(int k=0; k < N; k++)
							System.out.print(input[k]+" ");
						System.out.println();
					}
					else {
						for(int k=0; k < N; k++)
							System.out.print(input[k]+" ");
						System.out.println();
					}
			}
		}
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int N = in.nextInt(); 
			int input[] = new int[N];
			for(int i=0; i<N; i++)
				input[i] = in.nextInt(); 
			
			insertSort2(input);
	
		}

}
