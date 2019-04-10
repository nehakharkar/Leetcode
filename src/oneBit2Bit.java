import java.io.*;
import java.util.*;
public class oneBit2Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] bits = new int[n];
	for(int i = 0; i< n ; i++) {
		bits[i] = sc.nextInt();
	}
	System.out.println(isOneBitCharacter(bits));
	}


static boolean isOneBitCharacter(int[] bits) {
    int i;
  for (  i= 0 ; i< bits.length ; i++)
  {
      i = i + bits[i];
      System.out.println("after i"+i);
     
  }  
  if(i== bits.length){
      return false;
  }
  else{
      return true;
  }
}
}