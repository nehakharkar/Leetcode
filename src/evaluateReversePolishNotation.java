import java.util.Stack;
class evaluateReversePolishNotation {
	public int evalRPN(String[] tokens) {
		Stack<Integer> s = new Stack();
		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].equals("+")) {
				s.push(s.pop() + s.pop());
			} else if (tokens[i].equals("-")) {
				int a = s.pop();
				int b = s.pop();
				s.push(b - a);
			} else if (tokens[i].equals("/")) {
				int a = s.pop();
				int b = s.pop();
				s.push(b / a);
			} else if (tokens[i].equals("*")) {
				s.push(s.pop() * s.pop());

			} else {
				s.push(Integer.parseInt(tokens[i]));
			}

		}
		return s.pop();
	}
}