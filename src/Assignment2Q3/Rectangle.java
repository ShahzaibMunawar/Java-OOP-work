package Assignment2Q3;

public class Rectangle implements Resizeable {
	private double width = 0;
	private double height = 0;
	private double area = 0;
	private double peremeter = 0;

	@Override
	public void resize(double z) {
		width = width + z;
		height = height + z;

	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	double getArea() {
		area = width * height;
		return area;
	}

	double getPeremeter() {
		peremeter = 2 * (width + height);
		return peremeter;
	}
}
