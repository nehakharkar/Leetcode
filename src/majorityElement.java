import java.util.HashMap;
import java.util.Map;

class majorityElement {
	public int majorityElement(int[] nums) {
		Map<Integer, Integer> mp = new HashMap();
		for (int i = 0; i < nums.length; i++) {
			mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
		}
		int max = 0;
		int key = 0;
		for (Map.Entry e : mp.entrySet()) {
			int val = (int) e.getValue();
			int k = (int) e.getKey();
			if (val > max) {
				max = val;
				key = k;
			}
		}
		return key;
	}
}
