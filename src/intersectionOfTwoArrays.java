import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class intersectionOfTwoArrays {
	public int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList();
		Map<Integer, Integer> mp = new HashMap();
		for (int n : nums1) {
			mp.put(n, mp.getOrDefault(n, 0) + 1);
		}
		int i = 0;
		for (int n : nums2) {
			if (mp.containsKey(n) && mp.get(n) != 0) {
				mp.put(n, mp.get(n) - 1);
				list.add(n);
				i++;
			}

		}
		int[] ret = new int[list.size()];
		for (int j = 0; j < list.size(); j++)
			ret[j] = list.get(j);
		return ret;

	}

}