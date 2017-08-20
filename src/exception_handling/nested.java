package exception_handling;

public class nested {

}

class Excep6 {
	public static void main(String args[]) {
		//1
		try {

			// 2
			try {
				System.out.println("going to divide");
				int b = 39 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			// 3
			try {
				int a[] = new int[5];
				a[5] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

		} catch (Exception e) {
			System.out.println("handeled");
		}

		System.out.println("normal flow..");
	}
}