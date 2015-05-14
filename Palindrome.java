import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input ;
		//System.out.println("Enter value of T (Test Cases) :");
		int T = in.nextInt();
		int steps = 0; 
		for(int j= 0; j<T; j++){
			//System.out.println("Enter String"); 
			input = in.next(); 
			char[] inputArray = input.toCharArray();
			int len = inputArray.length-1; 
			for(int i=0; i<(len+1)/2; i++){
				steps += Math.abs((int)inputArray[i]-(int)inputArray[len-i]);
			}
			System.out.println(steps);
			steps = 0; 
		}
	}
	

}
