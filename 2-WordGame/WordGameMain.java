package word.game;

import java.util.Scanner;

public class WordGameMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String searchWord = scanner.next();
        char [][] map;
        int row, col;
        row = scanner.nextInt();
        col = scanner.nextInt();
        map = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                map[i][j] = scanner.next().charAt(0);
            }
        }
        System.out.println(WordGame.countTheWords(map, row, col, searchWord));
        scanner.close();
        

	}

}
