import java.util.HashMap;
import java.util.Map;

class romanToInt {
    public int romanToInt(String s) 
    {
        if(s == null || s.length() == 0){
            return 0;
        }    
        
        Map<Character,Integer> mp = new HashMap();
        
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
            
        int length = s.length();
        int result = mp.get(s.charAt(length - 1 ));
        
        for(int i = length -2; i>=0 ;i--)
        {
            if(mp.get(s.charAt(i)) >= mp.get(s.charAt(i+1)))
            {
                result += mp.get(s.charAt(i));
            }
            else
            {
                result -= mp.get(s.charAt(i));
            }
        }
            
        return result;
    

    }
}