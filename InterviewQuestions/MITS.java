package InterviewQuestions;

public class MITS {
	public static final String LETTERS = "acegikmnoprstuvy"; 
	public static Long hash(String s){
		Long h = 7L;   
        for(int i = 0; i < s.length(); i++) { 
            h = (h * 37 + LETTERS.indexOf(s.charAt(i))); 
        } 
        return h;
	}
	
	public static String hashToString(Long val, int len){
		int mod;	
		char str[] = new char[len];
		int idx = len-1; 
		while (val >7){
			mod = (int)(val % 37); 
			//System.out.println("mod:"+ mod);
			val  = (val - mod)/37; 
			str[idx] = LETTERS.charAt(mod);
			idx--;
		}
		return String.valueOf(str);
	}
	
	
	public static void main(String[] args) {	
		System.out.println(hashToString(690336378753L,7));
		System.out.println(hash("reports"));

		System.out.println(hashToString(932246728227799L, 9));
		System.out.println(hash("mymitsapp"));
		
	}
		
}
