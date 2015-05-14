import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next(); 
		str = str.replace(" ", "");
		int len =0; 
		int x = (int)Math.sqrt(str.length());
	//	System.out.println(str.length()+ "   "+Math.sqrt(str.length()));
		
	//	System.out.println(x);
		
		int r=x, c=x;  
		while(r*c < str.length() ){
			c++;
			if(r*c <str.length())
				r++;	
		}
		
		char output [][]= new char [r][c]; 
		int idx =0; 
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				if(idx<str.length()){
					output[i][j] = str.charAt(idx); 
					idx++; 
				}
				else
					output[i][j] = 0;
				
			}	
		}
		char result[]= new char [(r*c)+c] ; 
		idx =0;
	//	System.out.println("r: "+ r+" c: "+ c );
		for(int i=0; i<c; i++){
			for(int j=0; j<r; j++){
				if(output[j][i]!=0){
					result[idx]= output[j][i];
					len++; 
					idx++; 
				}
			}
			
			//if (idx < result.length){
				result[idx]=' ';
				len++;
				idx++;
			//}
		}
		int spacelen = 0;
				
		for(int i=0; i<len-1; i++)
			System.out.print(result[i]);
		
		//System.out.println("***");
		
	}

}
