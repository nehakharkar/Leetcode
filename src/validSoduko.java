import java.util.HashSet;
import java.util.Set;

class validSoduko {
	public boolean isValidSudoku(char[][] board) {
		Set s = new HashSet();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				char ch = board[i][j];
				if (ch != '.') {

					if (!s.add(ch + " in rows " + i) || !s.add(ch + " in columns " + j)
							|| !s.add(ch + " in block " + i / 3 + "-" + j / 3))
						return false;
				}
			}

		}
		return true;

	}
}