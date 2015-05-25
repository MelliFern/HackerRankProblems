import java.util.Scanner;


public class TwoStrings {
	
	public static int[] charInStr(String str){
		int ct[] = new int[26];
		
		for(int i=0; i< str.length() ; i++)
			ct[(int)str.charAt(i)-97]=1;
		
		return ct;
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String str1, str2, result; 
		int ct[];
		int T = in.nextInt();
		for(int t=0; t<T; t++){
			result = "NO";
			str1 = in.next(); 
			str2 = in.next();
			
			ct = charInStr(str1);
			for(int i=0; i<str2.length(); i++){
				if(ct[(int)str2.charAt(i)-97] ==1)
					result = "YES";
			}
			System.out.println(result);
		}
	}
}
