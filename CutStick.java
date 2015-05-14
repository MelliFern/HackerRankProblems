import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class CutStick  {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); 
		ArrayList <Integer>sticks = new ArrayList<Integer>();  
		for(int i=0; i<N; i++)
			sticks.add(in.nextInt());
		
		Collections.sort(sticks);
		int min, temp;
		while(sticks.size() > 0){
			min = sticks.get(0);
			for(int i=0; i<sticks.size(); i++){
				temp = sticks.get(i) - min;
				sticks.set(i,temp);
			}
			System.out.println(sticks.size());
			while(sticks.size() >0 && sticks.get(0) ==0){
				sticks.remove(0);
			}
		}
	
	}

}


