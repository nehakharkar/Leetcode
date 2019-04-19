import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length == 1) {
        	return;
        }
       k = k%nums.length;
       int low= 0;
       int high = nums.length-1;
       reverse(nums,low,high);
       reverse(nums,low,k-1);
       reverse(nums,k,high);
      
       
        
    }
    static void reverse(int[] arr, int low , int high) {
    	while(low<=high) 
    	{
    		int temp = arr[low];
    		arr[low]= arr[high];
    		arr[high] =temp;
    		low++;
    		high--;
    	}
}

public class RotateArray {
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
    
    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            line = in.readLine();
            int k = Integer.parseInt(line);
            
            new Solution().rotate(nums, k);
            String out = integerArrayToString(nums);
            
            System.out.print(out);
        }
    }
}