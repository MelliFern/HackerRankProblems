import java.util.Scanner;


public class Problem2 {
	public static int sum(int val1, int val2){
		return (val1+val2);
	}
	
	public static void main(String []agr){
		Scanner in = new Scanner(System.in);
		int count  = in.nextInt();
		int val1, val2; 
		for(int i=0; i<count; i++){
			System.out.println("Enter 2 numbers to be added");
			val1 = in.nextInt();
			val2 = in.nextInt();
			System.out.println(sum(val1,val2));
		}
			
		
	}
}
