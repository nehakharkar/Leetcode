import java.io.BufferedReader;
import java.io.*;
import java.util.TreeSet;

public class dota2Senate {
	
    public static void main(String[] args) throws IOException {
       
            String senate = "RD" ;
            
            String ret = new Solution6().predictPartyVictory(senate);
            
            String out = (ret);
            
            System.out.print(out);
        
    }
}
class Solution6 {
    public String predictPartyVictory(String senate) {
        TreeSet<Integer> rSet = new TreeSet<Integer> ();
        TreeSet<Integer> dSet = new TreeSet<Integer> ();

        for(int i=0; i<senate.length(); i++) {
            if(senate.charAt(i) == 'R') rSet.add(i);
            else 
            {
            	
            	dSet.add(i);
            
            }
            	
        }
        System.out.println(senate.length());

        while(!rSet.isEmpty() && !dSet.isEmpty()) {
            int rFirst = rSet.pollFirst();
            
            int dFirst = dSet.pollFirst();

            if(rFirst > dFirst) {
                dSet.add(dFirst + senate.length());                
            } else {
                rSet.add(rFirst + senate.length());                
            }
        }
        
        return rSet.isEmpty()? "Dire" : "Radiant";
    }
}
