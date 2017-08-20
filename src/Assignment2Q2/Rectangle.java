package Assignment2Q2;

public class Rectangle extends Shape {
	double Wigth, height, Area, perameter;

	public double getWigth() {
		return Wigth;
	}

	public void setWigth(double wigth) {
		Wigth = wigth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	double getArea() {
		Area = Wigth * height;
		return Area;
	}

	double getPeremeter() {
		perameter = 2 * (Wigth + height);
		return perameter;
	}
}
