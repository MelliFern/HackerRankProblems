import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class AlternatingChar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s; 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = br.readLine();
			Integer T = Integer.parseInt(input);
			
			int deletions; 
			
			for(int t=0; t<T; t++){
				deletions =0;
				s= br.readLine();
				int i=0;
				int j=0;
				for(i=0, j=1; i<s.length()-1 && j<s.length();){
				
					if(s.charAt(i)== s.charAt(j)){
						j++; 
						deletions++;
					}else{
						j++;
						i=j-1;
					}
					
				}
				
				System.out.println(deletions);
			}
		} catch (IOException e) {
				e.printStackTrace();
		}

	}

}

