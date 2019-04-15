
class increasingTripletSubsequence {
	public boolean increasingTriplet(int[] nums) {
		int firstmin = Integer.MAX_VALUE;
		int secondmin = Integer.MAX_VALUE;
		for (int n : nums) {
			if (n <= firstmin) {
				firstmin = n;
			} else if (n <= secondmin) {
				secondmin = n;
			} else {
				return true;
			}

		}

		return false;
	}
}