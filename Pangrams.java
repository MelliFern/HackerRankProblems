import java.util.Arrays;
import java.util.Scanner;


public class Pangrams {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine(); 
		String result = "pangram";
		s=s.toLowerCase();
		s= s.replace(" ", "");
		char a[] = s.toCharArray(); 
		int asciiVal = 97;
		Arrays.sort(a);
		
		for(int i=0; i<a.length; i++){
			if(i!=0 && (a[i] == a[i-1] || a[i] ==' '))
				continue; 
			
			if ((int)a[i] != asciiVal){
				result = "not pangram";
				break;
			}
			asciiVal++;
		}
		if(asciiVal != 123)
			result = "not pangram";
		System.out.println(result);

	}

}
