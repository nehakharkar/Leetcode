import java.util.HashMap;
import java.util.Map;

class singleNumberSolution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    
        
        for ( int n : nums) {
        	hm.put(n, hm.getOrDefault(n,0)+1);
        }
        for (Map.Entry e : hm.entrySet())
        {
            int key = (int)e.getKey();
            int value = (int)e.getValue();
            if(value == 1)
            {
                return key;
            }
           
        }
        return 0;       
    }
}