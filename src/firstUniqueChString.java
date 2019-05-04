import java.util.*;

public class firstUniqueChString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(Unique(str));
	}
	static int Unique(String S) {
		char[] ch =S.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
       
        
        for ( char c : ch) {
        	if(hm.containsKey(c)) 
        	{
        		hm.put(c, hm.get(c) + 1);
        		
        	}
        	else {
        		hm.put(c, 1);	
        	}
        }	
		for(int i = 0 ;i < ch.length ; i ++) {
			if(hm.get(ch[i]) == 1) {
				return i;
			}
		}
		return -1;
	}
}	
