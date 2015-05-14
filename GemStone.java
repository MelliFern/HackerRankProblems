import java.util.Arrays;
import java.util.Scanner;


public class GemStone {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String str[] = new String[N];
		int a[] = new int[26];
		// reset array 
		for(int i=0; i<26; i++)
			a[i]= 0; 
		
		// input string
		for(int i=0; i<N; i++)
			str[i] = in.next(); 
		int idx; 
		for(int i=0; i<N; i++){
			for(int k=0; k <str[i].length(); k++ ){
				
				idx = (int)str[i].charAt(k)-97;
				//System.out.println(idx);
				if(a[idx]== i){
					a[idx] = i+1; 
				}
			}
			//System.out.println("N :"+ i);
			
		}	
		
		
		int result = 0; 
		for(int i=0; i<26 ; i++){
			if (a[i]==N)
				result++; 
		}
		System.out.println(result);
	}

}
