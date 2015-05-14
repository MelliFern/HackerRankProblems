import java.util.Scanner;


public class SortIntro {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int V = in.nextInt();
		int N = in.nextInt(); 
		int a[]=new int[N];
		
		for(int i=0; i< N; i++){
			a[i]= in.nextInt();
			if(a[i] == V){
				System.out.println(i);
				break;
			}
			
		}
	}

}
