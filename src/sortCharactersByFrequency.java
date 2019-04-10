import java.util.*;

public class sortCharactersByFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(frequencySort(str));

	}

	static String frequencySort(String s) {
		char[] ch = s.toCharArray();
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
        StringBuilder sb = new StringBuilder();
        
        LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();
        hm.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedMap.put(x.getKey(),x.getValue()));
         
       for (Map.Entry e : sortedMap.entrySet()) {
       int v = (int)e.getValue() ;
       char c = (char)e.getKey();
        for(int i = 0 ; i<v ;i++){
            sb.append(c);
        }
       }
   
        return sb.toString();
    }
    }


