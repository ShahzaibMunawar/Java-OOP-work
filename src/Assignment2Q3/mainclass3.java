package Assignment2Q3;

public class mainclass3 {
	public static void main(String[] args) {
		Rectangle resize = new Rectangle();
resize.setHeight(2);
resize.setWidth(3);
System.out.println("Before Resizing");
System.out.println(resize.getArea());
System.out.println(resize.getPeremeter());
resize.resize(2);
System.out.println("After Resizing");
System.out.println(resize.getArea());
System.out.println(resize.getPeremeter());

	}
}
