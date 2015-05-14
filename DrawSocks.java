import java.util.Scanner;


public class DrawSocks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		Long N ; 
		for(int i=0;i<T; i++){
			N = in.nextLong();
			
			System.out.println(N+1);
		}
	}

}