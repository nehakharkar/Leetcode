import java.util.TreeMap;

class intToRoman {
    
    public static TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
    
    static{
        tm.put(1,"I");
        tm.put(4,"IV");
        tm.put(5,"V");
        tm.put(9,"IX");
        tm.put(10,"X");
        tm.put(40,"XL");
        tm.put(50,"L");
        tm.put(90,"XC");
        tm.put(100,"C");
        tm.put(400,"CD");
        tm.put(500,"D");
        tm.put(900,"CM");
        tm.put(1000,"M");
        
        
    }
    public String intToRomanfunc(int num) {
        int  n = tm.floorKey(num);
        if(n == num){
            return tm.get(num);
        }
        return tm.get(n) + intToRomanfunc(num-n);
        
    }
}