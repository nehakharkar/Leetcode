class removeOutermostParantheses {
	public String removeOuterParentheses(String S) {
		if (S == null || S.length() == 0)
			return "";
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(') {
				count++;
				if (count != 1) {
					sb.append("(");
				}
			} else {
				count--;
				if (count != 0) {
					sb.append(")");
				}
			}

		}
		return sb.toString();
	}
}