import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;


public class GameOfThrones1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine(); 
		
		int i, j,ii,jj; 
		String result = "YES"; 
		int a[] = new int[123]; 
		for(int k=97; k<a.length;k++)
			a[k]=0; 
		int len = s.length();
		for(i=0,j= len/2; i< len/2 && j < len; i++,j++){
			ii= (int)s.charAt(i); 
			jj= (int)s.charAt(j); 
			//System.out.println(i+"  "+j);
			a[ii]+=1;
			a[jj]+=1; 
		}
		//System.out.println(s);

		if(len %2 !=0){
			// one missed count;
			jj= (int)s.charAt(len-1); 
			a[jj]+=1; 
			
			Boolean oneOffAlphabet = false;
			for(int k=97; k<a.length; k++){
				//System.out.println("a["+k+"] : "+a[k]);
				if(a[k]>0 && a[k]%2 !=0 ){
					if(!oneOffAlphabet)
						oneOffAlphabet = true; 
					else {
						result = "NO";
						break;
					}
				}
			}
		}else{
			for(int k=97; k<a.length; k++){
				if(a[k]>0 && a[k]%2 !=0){
					//System.out.println("a["+k+"] : "+a[k]);
					result="NO";
					break;
				}
			}
		}
	System.out.println(result);
		
	}

}
