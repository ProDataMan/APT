package apt;

public class Rectangle {
	private int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getArea() {
		return getWidth() * getHeight();
	}

	public int getPerimeter() {
		return (getWidth() * 2) + (getHeight() * 2);
	}

	public String getOrientation() {
		if (getWidth() > getHeight()) {
			return "Landscape";
		} else {
			return "Portrait";
		}
	}

	public boolean isSquare() {
		if (getWidth() == getHeight()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean equals(Object compareTo) {
		if (compareTo == null) return false;
		if (!(compareTo instanceof Rectangle)) return false;
		Rectangle r = (Rectangle)compareTo;
		return this.getWidth() == r.getWidth() && this.getHeight() == r.getHeight(); 
	}
}
