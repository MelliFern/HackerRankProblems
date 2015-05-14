import java.util.Scanner;


public class StrangeGrid {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		//System.out.println(" Enter row and col :");
		Long row = in.nextLong()-1; 
		Long col = in.nextLong()-1;		
		Long val; 
	
		if ( row%2 ==0)
			val = col*2; 
		else
			val = col*2+1; 
		
		System.out.println((row/2)*10 + val); 
	}
}
