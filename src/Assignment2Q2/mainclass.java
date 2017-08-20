package Assignment2Q2;

public class mainclass {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		RtTriangle triangle = new RtTriangle();
		rectangle.setDownSide(20);
		rectangle.setUpSide(20);
		rectangle.setLeftSide(10);
		rectangle.setRightSide(10);
		rectangle.setHeight(20);
		rectangle.setWigth(30);
		System.out.println("==============Sides of rectangle==============");
		System.out.println("Top side =" + rectangle.getUpSide() + "\nBottem Side =" + rectangle.getDownSide()
				+ "\nLeft Side=" + rectangle.getLeftSide() + "\nRight Side=" + rectangle.getRightSide());
		System.out.println("========Area========");
		System.out.println("Area of Rectangle =" + rectangle.getArea());
		System.out.println("========Parameter========");
		System.out.println("Parameter of Rectangle =" + rectangle.getPeremeter());

		System.out.println("==============Sides of Triangle==============");
		triangle.setDownSide(10);
		triangle.setLeftSide(10);
		triangle.setRightSide(10);
		triangle.setHeight(20);
		triangle.setWigth(39);
		System.out.println("side 1 =" + rectangle.getLeftSide() + "\nside 2 =" + rectangle.getDownSide() + "\nside 3="
				+ rectangle.getRightSide());
		System.out.println("========Area========");
		System.out.println("Area of triangle =" + triangle.getArea());
		System.out.println("========Parameter========");
		System.out.println("Parameter of triangle =" + triangle.getPeremeter());

	}
}
