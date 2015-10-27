package points;

public class Point {
	private int x;
	private int y;

	public Point(int currentX, int currentY) {
		x = currentX;
		y = currentY;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int newX) {
		x = newX;
	}

	public void setY(int newY) {
		y = newY;
	}

	public void moveLeft() {
		setX(getX() - 1);
	}

	public void moveRight() {
		setX(getX() + 1);
	}

	public void moveUp() {
		setY(getY() - 1);
	}

	public void moveDown() {
		setY(getY() + 1);
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
