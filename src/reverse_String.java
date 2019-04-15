import java.util.*;
public class reverse_String {

public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] ch =str.toCharArray();
        int i = 0;
        while(i < str.length()/2)
        {
            if(ch[i] != ch[str.length()-1-i])
            {
                System.out.print ("No");
                break;
            }
            i++;
        }

                System.out.print ("Yes");

        
    }
	
}
