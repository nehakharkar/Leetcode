import java.util.*;

public class nimGame {

	public static void main(String[] args) {
		// TODO Autoint noOfTestcases,N;
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		System.out.println(canWinNim(noOfTestcases));

}
	static boolean canWinNim(int n) {
	    
		   
		   if( n % 4 == 0 ) 
		   {
			   return false;
		   }
		   else 
		   {
			   return true;
		   }
	    }
}