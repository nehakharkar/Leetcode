import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class mostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) 
    {
        Set<String> set = new HashSet();
        for(String s : banned){
            set.add(s);
        }
        Map<String,Integer> mp = new HashMap();
        for(String s : paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" "))
        {
            if(!set.contains(s))
                mp.put(s,mp.getOrDefault(s,0)+1);    
        }

       String result= "";
        for(String s : mp.keySet())
        {
         if(result.equals("") || mp.get(s) > mp.get(result))
             result= s;
        }
        return result.toString();
    }
}
