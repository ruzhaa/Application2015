package points;

public class CoordinateSystem {
	
	private Point point;
	private int counter = 0;

	public CoordinateSystem() {
		point = new Point(0, 0);
	}

	public Point direction(String str) {
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case '>':
				point.moveRight();
				break;
			case '<':
				point.moveLeft();
				break;
			case '^':
				point.moveUp();
				break;
			case 'V':
				point.moveDown();
				break;
			case '~':
				changeDirection(str, i);
				i = i + counter + 1;
				break;
			}
		}
		Point resultPoint = new Point(point.getX(), point.getY());
		return resultPoint;
	}

	public void changeDirection(String str, int startIndex) {
		for (int i = startIndex + 1; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case '>':
				point.moveLeft();
				counter++;
				break;
			case '<':
				point.moveRight();
				counter++;
				break;
			case '^':
				point.moveDown();
				counter++;
				break;
			case 'V':
				point.moveUp();
				counter++;
				break;
			case '~':
				return;
			}
		}
	}
}
