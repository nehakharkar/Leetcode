import java.io.*;
import java.util.*;
class groupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        
        if(strs.length == 0 ) return new ArrayList();
        Map<String,List> mp = new HashMap<String,List>();
        for( String s : strs)
        {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String str = String.valueOf(ch);
            if(!mp.containsKey(str)) mp.put(str,new ArrayList());
            
            mp.get(str).add(s);
        
        }
        return new ArrayList(mp.values());
    }
    
}