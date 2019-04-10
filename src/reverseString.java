import java.util.*;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] s = {'h','e','l','l','o'};
		System.out.println(reverse(s));
	}
	 static char[] reverse(char[] s) {
		 int low = 0;
		 int high = s.length -1;
		 while(low < high)
	        {
	            char tmp;
	            tmp= s[low];
	            s[low]=s[high];
	            s[high] = tmp;
	            low++;
	            high--;
	            
	        }
		
		 
		 
		 return s;
	 }

}
