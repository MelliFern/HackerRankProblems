import java.util.Scanner;

// 1 1 2 3 5 8 13 21 34 ... 
public class Fibonacci {
	public static int dictionary[]=null; 

	public static int calculateFib(int n){
		int val1, val2; 
		if (n<=1)
			return 1;
		
		if(dictionary[n-1]!=0){
			val1 = dictionary[n-1]; 
		}else{
			val1 = calculateFib(n-1);
			dictionary[n-1] = val1;
		}
		
		if(dictionary[n-2]!=0){
			val2 = dictionary[n-2]; 
		}else{
			val2 = calculateFib(n-2);
			dictionary[n-2] = val2;
		}
		//System.out.println(val1+val2);
		return (val1+val2);
			
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		int nth = in.nextInt();
		dictionary = new int[nth];
		
		System.out.println(calculateFib(nth));
	
	}

}
