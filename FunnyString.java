import java.util.Scanner;


public class FunnyString {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int val, reverseVal, len ;
		char a[];
		String input, result; 
		int T = in.nextInt(); 
		for(int j=0; j<T; j++){
			input = in.next(); 
			result = "Funny"; 
			a = input.toCharArray();
			len	 = a.length -1;
			
			for(int i=0; i<len; i++){
				val = Math.abs( (int)a[i] - (int)a[i+1]);
				reverseVal = Math.abs( (int)a[len-i] - (int)a[len-(i+1)]);
				if(val!= reverseVal){
					result = "Not Funny";
					break;
				}
			}
			System.out.println(result);
		 }
			
		}
		

}
