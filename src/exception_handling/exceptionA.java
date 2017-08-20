package exception_handling;

class exceptionA extends Exception { // this class extend from main cl

	public exceptionA(String string) {
		super("THis is error");
	}

}

class exceptionB extends exceptionA {
	exceptionB(String string) {
		super("out of range");
	}

}

class exceptionC extends exceptionB {
	exceptionC() {
		super("invalid");
	}
}

class runner {
	public static void main(String[] args) {
		int radius = -5;
		try {
			if (radius < 0)
				throw new exceptionA("a");
			else if (radius > 0)
				throw new exceptionB("b");
			else
				throw new exceptionC();
		} catch (exceptionB A) {
			System.out.println(A);
		}

	}
}