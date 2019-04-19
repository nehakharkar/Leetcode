import java.util.HashSet;
import java.util.Set;

class containsDuplicate{
	public boolean Duplicate(int[] nums) {
		Set<Integer> s = new HashSet();
		for(int n :nums) {
			if(s.add(n) == false)
				return true;
		}
		return false;
	}
	
}

