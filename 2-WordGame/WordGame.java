package word.game;

public class WordGame extends Movement {
	private static int indexWord = 0;
	private static int counterWord = 0;

	public static int countTheWords(char[][] matrix, int row, int col,
			String searchWord) {
		int vertically = row - searchWord.length();
		int horizontal = col - searchWord.length();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (matrix[i][j] == searchWord.charAt(indexWord)) {
					if (j <= horizontal) {
						if (moveToRight(matrix, searchWord, i, j)) {
							counterWord++;
						}
					} else if ((j <= horizontal) && (i <= vertically)) {
						if (moveUpLeftToDownRight(matrix, searchWord, i, j)) {
							counterWord++;
						}
					} else if (j >= searchWord.length() - 1) {
						if (moveToLeft(matrix, searchWord, i, j)) {
							counterWord++;
						}
					} else if ((j >= searchWord.length() - 1)
							&& (i >= searchWord.length() - 1)) {
						if (moveDownRightToUpLeft(matrix, searchWord, i, j)) {
							counterWord++;
						}
					} else if (i <= vertically) {
						if (moveDown(matrix, searchWord, i, j)) {
							counterWord++;
						}
					} else if ((i <= vertically) && (j >= searchWord.length() - 1)) {
						if (moveUpRightToDownLeft(matrix, searchWord, i, j)) {
							counterWord++;
						}
					} else if (i >= searchWord.length() - 1) {
						if (moveUp(matrix, searchWord, i, j)) {
							counterWord++;
						}
					} else if ((i >= searchWord.length() - 1) && (j <= horizontal)) {
						if (moveDownLeftToUpRight(matrix, searchWord, i, j)) {
							counterWord++;
						}
					}
				}
			}
		}
		if(isPalindrome(searchWord)) {
			counterWord = counterWord/2;
		}
		return counterWord;
	}

	private static boolean isPalindrome(String searchWord){
        int searchWordLength = searchWord.length();
        for(int i = 0; i < searchWordLength; i++){
               if(searchWord.charAt(i) != searchWord.charAt(searchWordLength - (i + 1))){
                   return false;
               }
        }
        return true;
    }
}
