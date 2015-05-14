import java.util.Scanner;


public class XOR {
	public static int xor(int val1, int val2){
		//System.out.println(val1 + "  "+ val2);
		return (val1^val2);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int r = in.nextInt();
		int xorVal = 0;
		int max =0; 
		for(int i=l; i<=r; i++){
			for(int j=l; j<=r; j++){
				xorVal = xor(i,j);
				//System.out.println(xorVal);
				if (max < xorVal)
					max = xorVal; 	
			}
		}
		System.out.println(max);	
		
	}

}
