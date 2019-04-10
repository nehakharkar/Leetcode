import java.util.Scanner;

public class toLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(LowerCase(str));
	}
	 static String LowerCase(String str) {
	        String s = str.toLowerCase();
	        return s;
	    }

}
