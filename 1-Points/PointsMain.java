package points;

import java.util.Scanner;

public class PointsMain {

	public static void main(String[] args) {
		System.out.print("Starting point: ");
		Scanner scanner = new Scanner(System.in);
		Point point = new Point(0, 0);
		CoordinateSystem cord = new CoordinateSystem();
		System.out.println(point);
		Scanner scannerStr = new Scanner(System.in);
		String stringDirection = scannerStr.nextLine();

		System.out.println(cord.direction(stringDirection));

//		scanner.close();
//		scannerStr.close();
	}
}
