import java.util.Arrays;
public class largestPerimeterTriangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = { 3, 2, 3, 4 };
		System.out.println(largest(s));
	}
	static int largest(int[] s) {
		Arrays.sort(s);
		int sum = 0;
		for (int i = s.length - 1; i > s.length - 4; i--) {
			System.out.println(sum);
			sum += s[i];

		}
		return sum;
	}
}