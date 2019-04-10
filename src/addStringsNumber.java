import java.io.*;
import java.util.*;
class Solution1 {

    public String addStrings(String num1, String num2) {
    	StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0 ;
        while ( i >= 0 || j >= 0 || carry > 0)
        {
            int sum = carry;
            if(i >= 0 )
                sum = sum + num1.charAt(i--) - '0';    
            if( j >= 0)
                sum = sum + num2.charAt(j--) - '0'; 
            sb.append(sum%10);
            carry = sum/10;
             
        }
        
        return sb.reverse().toString();
    }
    
}

public class addStringsNumber {
    
    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
          
        String num1 = sc.next();
        
        String num2 = sc.next();
            
        String ret = new Solution1().addStrings(num1, num2);
            
       // String out = (ret);
            
        System.out.print(ret);
        
    }
}