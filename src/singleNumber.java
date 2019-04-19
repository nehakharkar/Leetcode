class singleNumber {
	public int singleNo(int[] nums) {
		int n = 0;
		for (int no : nums) {
			n = n ^ no;
		}

		return n;

	}

}