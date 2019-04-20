import java.util.HashMap;

class validAnagram {
    public boolean isAnagram(String s, String t) 
    {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        HashMap<Character, Integer> hm = new HashMap();
        for(char c: sc)
        {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(char ch: tc)
        {
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)-1);
            }
            else{
                return false;
            }
        }
        for(Integer i : hm.values())
        {
            if(i != 0) return false;           
        }
        
        return true;
    }
}