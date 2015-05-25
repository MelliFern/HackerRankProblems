import java.util.HashMap;
import java.util.Scanner;


public class MakeAnagram {

	public static int[] characterCount(String str){
		int ct[] = new int [26];
		for(int i=0; i< 26; i++)
			ct[i] = 0; 
		
		for(int i=0; i<str.length(); i++){
			ct[(int)str.charAt(i)-97]++; 
		}
		
		return ct;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		
		String str1 = in.next(); 
		String str2 = in.next();
		int deletions = 0; 
		int ct1[] = characterCount(str1);
		int ct2[] = characterCount(str2);
		
		for(int i=0; i<26; i++){
			if(ct1[i] == 0 && ct2[i]!=0)
				deletions += ct2[i]; 
			else if(ct2[i] == 0 && ct1[i]!=0)
				deletions += ct1[i]; 
			else {
				deletions += Math.abs(ct1[i] - ct2[i]);
			}
			
		}
		System.out.println(deletions);

	}

}
