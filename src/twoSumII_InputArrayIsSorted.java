import java.util.HashMap;
import java.util.Map;

class twoSumII_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) 
    {
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
       int[] ret = new int[2];
        for(int i = 0 ; i<numbers.length ; i++)
        {
         if(hm.containsKey(target-numbers[i]) )
         {
             ret[0]= hm.get(target-numbers[i])+1;
             ret[1] = i+1;

         }  
         else
        {
                hm.put(numbers[i],i);
          }
            
        }
        return ret;
       
        
    }
}