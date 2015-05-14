import java.util.Scanner;


public class ServiceLane {
	
	public static int vehicalSize(int start, int end, int width[]){
		int size = width[start]; 
		for(int i=start+1; i<=end; i++){
			if(size > width[i])
				size = width[i]; 
		}
		return size; 
	} 
	

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int lengthOfFreeway = in.nextInt();
		int width[]				= new int[lengthOfFreeway];
		int test 			= in.nextInt();
		int start=0, end=0;
		for(int i=0; i<lengthOfFreeway ; i++){
			width[i] = in.nextInt();
		}
		
		for(int i=0; i< test; i++){
			start 	= in.nextInt();
			end 	= in.nextInt(); 
			System.out.println(vehicalSize (start, end, width)); 
			
		}
			
		

	}

}
