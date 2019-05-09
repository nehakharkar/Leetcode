import java.util.HashMap;
import java.util.Map;

class jewelsAndStones {
	public int numJewelsInStones(String J, String S) {
		if (S == null || J == null || S.length() == 0 || J.length() == 0)
			return 0;
		int count = 0;
		char[] s = S.toCharArray();
		char[] j = J.toCharArray();
		Map<Character, Integer> mp = new HashMap();
		for (Character ch : s) {
			mp.put(ch, mp.getOrDefault(ch, 0) + 1);
		}

		for (Character ch : j) {
			if (mp.containsKey(ch)) {
				count += mp.get(ch);
			}
		}

		return count;
	}
}