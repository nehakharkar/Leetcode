import java.util.*;

public class reorganizeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(reorganize(str));
	}
	static String reorganize(String S) {
	
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        char[] ch = S.toCharArray();
        
        for ( char c : ch) {
        	if(hm.containsKey(c)) 
        	{
        		hm.put(c, hm.get(c) + 1);
        		
        	}
        	else {
        		hm.put(c, 1);	
        	}
        }
        StringBuilder sb = new StringBuilder();
        int max = 0;
        char maxChar;
        for (Map.Entry e : hm.entrySet()) {
        	if((int)e.getValue() > max) {
        		max = (int)e.getValue();
        		maxChar = (char) e.getKey();
        //		sb.insert(offset, obj)
        	}
        	else {
        	//	sb.insert(, e.getKey())
        	}
        }
		
		
		
		
		return S;
		
		
		
	}
}
