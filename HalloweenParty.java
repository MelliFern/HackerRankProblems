import java.util.Scanner;


public class HalloweenParty {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		Long K;
		Long n,m; 
		for(int i=0; i<T; i++){
			K = (Long)in.nextLong();
			if(K%2 !=0){
				n = (Long)K/2+1;
				m = (Long)(K/2);
			}
			else{
				n = K/2;
				m= K/2;
			} 
			
			System.out.println(n*m);
		}
	}
}


