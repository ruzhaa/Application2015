package word.game;

public class Movement {

	protected static boolean moveToLeft(char[][] matrix, String searchWord,
			int i, int j) {
		int currentIndexWord = 1;
		while (currentIndexWord < searchWord.length()) {
			if (matrix[i][j - 1] == searchWord.charAt(currentIndexWord)) {
				j--;
				currentIndexWord++;
			} else {
				return false;
			}
		}
		return true;
	}

	protected static boolean moveToRight(char[][] matrix, String searchWord,
			int i, int j) {
		int currentIndexWord = 1;
		while (currentIndexWord < searchWord.length()) {
			if (matrix[i][j + 1] == searchWord.charAt(currentIndexWord)) {
				j++;
				currentIndexWord++;
			} else
				return false;
		}
		return true;

	}

	protected static boolean moveUp(char[][] matrix, String searchWord, int i,
			int j) {
		int currentIndexWord = 1;
		while (currentIndexWord < searchWord.length()) {
			if (matrix[i - 1][j] == searchWord.charAt(currentIndexWord)) {
				i--;
				currentIndexWord++;
			} else {
				return false;
			}
		}
		return true;
	}

	protected static boolean moveDown(char[][] matrix, String searchWord,
			int i, int j) {
		int currentIndexWord = 1;
		while (currentIndexWord < searchWord.length()) {
			if (matrix[i + 1][j] == searchWord.charAt(currentIndexWord)) {
				i++;
				currentIndexWord++;
			} else {
				return false;
			}
		}
		return true;
	}

	protected static boolean moveDownLeftToUpRight(char[][] matrix,
			String searchWord, int i, int j) {
		int currentIndexWord = 1;
		while (currentIndexWord < searchWord.length()) {
			if (matrix[i - 1][j + 1] == searchWord.charAt(currentIndexWord)) {
				i--;
				j++;
				currentIndexWord++;
			} else {
				return false;
			}
		}
		return true;
	}

	protected static boolean moveUpRightToDownLeft(char[][] matrix,
			String searchWord, int i, int j) {
		int currentIndexWord = 1;
		while (currentIndexWord < searchWord.length()) {
			if (matrix[i + 1][j - 1] == searchWord.charAt(currentIndexWord)) {
				i++;
				j--;
				currentIndexWord++;
			} else {
				return false;
			}
		}
		return true;
	}

	protected static boolean moveDownRightToUpLeft(char[][] matrix,
			String searchWord, int i, int j) {
		int currentIndexWord = 1;
		while (currentIndexWord < searchWord.length()) {
			if (matrix[i - 1][j - 1] == searchWord.charAt(currentIndexWord)) {
				i--;
				j--;
				currentIndexWord++;
			} else {
				return false;
			}
		}
		return true;

	}

	protected static boolean moveUpLeftToDownRight(char[][] matrix,
			String searchWord, int i, int j) {
		int currentIndexWord = 1;
		while (currentIndexWord < searchWord.length()) {
			if (matrix[i + 1][j + 1] == searchWord.charAt(currentIndexWord)) {
				i++;
				j++;
				currentIndexWord++;
			} else {
				return false;
			}
		}
		return true;
	}
}
