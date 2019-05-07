import java.util.HashSet;
import java.util.Set;

class happyNumber {
	Set<Integer> s = new HashSet();

	public boolean isHappy(int n) {
		if (s.contains(n))
			return false;
		if (n == 1)
			return true;
		s.add(n);
		int sum = 0;
		while (n != 0) {
			sum = sum + ((n % 10) * (n % 10));
			n = n / 10;

		}
		return isHappy(sum);
	}
}