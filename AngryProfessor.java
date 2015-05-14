import java.util.Scanner;


public class AngryProfessor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int T = in.nextInt(); 
		int N, K, count;
		int a[]; 
		String result; 
		for(int t=0; t<T; t++){
			N = in.nextInt(); 
			K = in.nextInt(); 
			result = "YES";
			count =0;
			a = new int[N];
			for(int i=0; i<N; i++){
				a[i] = in.nextInt();
				 if(a[i] <=0)
					 count++;
			}
			if(count>= K)
				result ="NO"; 
			System.out.println(result);
		}
	}
}
