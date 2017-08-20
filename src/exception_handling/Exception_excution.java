package exception_handling;
//Rule: At a time only one Exception is occured and at a time only one catch block is executed.

//specific to general


//Rule: All catch blocks must be ordered from most specific to most general i.e. catch for ArithmeticException must come before catch for Exception .

public class Exception_excution {
	public static void main(String args[]) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("task 2 completed");
		} catch (ArithmeticException e) {
			System.out.println("task1 is completed");
		}

		catch (Exception e) {
			System.out.println("common task completed");
		}

	}
}
