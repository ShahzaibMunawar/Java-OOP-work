package Assignment2Q2;

public class RtTriangle extends Shape {
	double Wigth, height;
	
	
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
		Area = (Wigth * height)/2;
		return Area;
	}

	double getPeremeter() {
		perameter = getRightSide()+getDownSide()+getLeftSide();
		return perameter;
	}
}
