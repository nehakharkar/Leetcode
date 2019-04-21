
import java.util.*;
import java.lang.*;
import java.io.*;

public class longestPalindromeSubsequence {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		for(int i = 0 ; i <no ; i++) 
		{
			String str = sc.next();
			System.out.println(LPS(str.toCharArray(), 0,str.length()-1));
		}
	}
	public static int LPS(char str[] , int i , int j) {
		
		if(i == j)
		{
			return 1;
			
		}
		if((str[i] == str[j]) && (i + 1 == j) )
		{
			return 2;
		}
		if(str[i] == str[j]) 
		{
			return LPS(str ,i+1, j-1) + 2;
		}
		if(str[i] != str[j]) 
		{
			return max(LPS(str ,i, j-1) , LPS(str,i-1,j));
		}
		return 0;
		
		
	}
	public static int max(int x , int y) {
		return x>y ? x : y; 
	}
	
}
