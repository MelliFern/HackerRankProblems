import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


public class BigGreaterLexicography {

	public static void findNextPermutation(String str){
		// find max index s[i]> s[i+1]
		int strLen = str.length()-1;
		int maxi=-1, k = str.length()-1; 
		int nextIdx = -1; 
		char result [] = new char[str.length()];
		char temp;
		
		//-------------------------------------------
			for(int i=0; i<=strLen; i++)
				result[i] = str.charAt(i);
		//-------------------------------------------
		for(int i=str.length()-2; i>=0;i--){
			if(str.charAt(i) < str.charAt(k)){
				maxi = i; 
				break;
			} else {
				if (str.charAt(k) < str.charAt(i))
					k= i;
			}
		}
		
		if(maxi >=0){
			for(int i=strLen; i>=0; i--){
				if(str.charAt(i)> str.charAt(maxi)){
					nextIdx = i;
					break;
				}
			}
			
			// swap
			temp = str.charAt(nextIdx);
			result[nextIdx] = result[maxi];
			result[maxi] = temp;
	
			// reverse array
			int revLen = result.length -maxi-1; 
			
			int val=0;
			for(int i=maxi+1; i<=(strLen -revLen/2);i++){
				temp = result[strLen-val]; 
				result[strLen- val] = result[i]; 
				result[i] = temp;
				val++;
			}
			System.out.println(String.valueOf(result));
		}
		else{
			System.out.println("no answer");
		}
	}
	
	
	public static void main(String[] args) {
			
		String s; 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = br.readLine();
			Integer T = Integer.parseInt(input);
			String str1;
			for(int t=0; t<T; t++){
				str1= br.readLine();
				if(str1.length()>1)
					findNextPermutation(str1);
				else
					System.out.println("no answer");
		
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
