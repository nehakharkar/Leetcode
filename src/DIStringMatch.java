
public class DIStringMatch {
	public static int[] diStringMatch(String S) {
        int n = S.length();
        int low =0; 
        int high = n;
        int [] an = new int[n+1];
        for(int i=0;i<n;i++){
          if(S.charAt(i)=='I')
              an[i] = low++;
           else
               an[i]= high--;
        }
        
        an[n]= low;
        return an;
    }

}
