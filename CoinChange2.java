import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class CoinChange2 {
	public static int coins[];
	public static int combination[] ; 
	public static Long count =0L;
	//public static int idx =0;
	
	public static void getAllCombinations(int value, int st, int idx){
		if(value ==0 ){
			count ++;
			return;
		}
		
		int valueCopy; 
		for(int i=st; i< coins.length;i++){
			valueCopy = value;
			valueCopy -= coins[i];
			if(valueCopy >=0){
				getAllCombinations(valueCopy, i, idx);
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		int M = in.nextInt(); 
		int N = in.nextInt();
		coins = new int[N];
		Long len =1L;
		int factorial=1;
		for(int i=0; i<N; i++){
			coins[i] = in.nextInt();
		}
		Arrays.sort(coins);
		getAllCombinations(M, 0, 0); 
		System.out.println(count);
	}

}
