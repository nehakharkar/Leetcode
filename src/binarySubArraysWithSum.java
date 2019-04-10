import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Solution7 {
    public int numSubarraysWithSum(int[] A, int S) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int sum=0,res=0;
        map.put(0,1);
        for(int k:A){
            sum+=k;
            System.out.println("sum" + sum + " " +map.getOrDefault(sum-S,0)+" ");
            res+=map.getOrDefault(sum-S,0);
          
            map.put(sum,map.getOrDefault(sum,0)+1);       
        }
        return res;
    }
}

public class binarySubArraysWithSum {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
            int[] A = {1,0,1,0,1};
            int S = 2;
            
            int ret = new Solution7().numSubarraysWithSum(A, S);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        
    }
}