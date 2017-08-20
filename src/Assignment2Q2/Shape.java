package Assignment2Q2;

public abstract class Shape {
	double LeftSide, RightSide, UpSide, DownSide, Area, perameter;

	Shape() {
		LeftSide = 10;
		RightSide = 10;
		UpSide = 20;
		DownSide = 20;

	}

	public double getLeftSide() {
		return LeftSide;
	}

	public void setLeftSide(double leftSide) {
		LeftSide = leftSide;
	}

	public double getRightSide() {
		return RightSide;
	}

	public void setRightSide(double rightSide) {
		RightSide = rightSide;
	}

	public double getDownSide() {
		return DownSide;
	}

	public void setDownSide(double downSide) {
		DownSide = downSide;
	}

	public double getUpSide() {
		return UpSide;
	}

	public void setUpSide(double upSide) {
		UpSide = upSide;
	}

	abstract double getArea();

	abstract double getPeremeter();
}
