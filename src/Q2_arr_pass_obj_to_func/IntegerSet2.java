package Q2_arr_pass_obj_to_func;

public class IntegerSet2 {
	private static final int Length = 10;
	private int[] a;
	// class objects
	IntegerSet2 mset, mset2, mset3;

	// setting the array with specified length
	public IntegerSet2() {
		a = new int[Length];
	}

	public int getElement(int i) {
		return a[i];
	}

	// inserting element by settin gvalue to 1
	public void insertElement(int k) {
		a[k] = 1;
	}

	// element by settin gvalue to 1
	public void deleteElement(int k) {
		a[k] = 0;
	}

	// intersection by cheaking the values in both side have 1
	public void intersection(IntegerSet2 inttsec) {
		mset3 = new IntegerSet2();
		for (int j = 0; j < Length; j++) {
			if (inttsec.getElement(j) == 1 && this.getElement(j) == 1) {
				mset3.insertElement(j);
			}
		}
	}

	public void isEqual() {
		mset2 = new IntegerSet2();
		for (int j = 0; j < Length; j++) {
			if (this.getElement(j) == 1) {
				mset2.insertElement(j);
			}
		}
	}

	public void Generate_union(IntegerSet2 integerSet2) {
		mset = new IntegerSet2();

		for (int j = 0; j < Length; j++) {
			if (this.getElement(j) == 1) {
				mset.insertElement(j);
			}
		}

		for (int j = 0; j < Length; j++) {
			if (integerSet2.getElement(j) == 1) {
				mset.insertElement(j);
			}
		}
	}

	// convert to String
	public String toString(IntegerSet2 unionSet) {
		String StString = "";
		for (int j = 0; j < Length; j++) {
			if (unionSet.getElement(j) == 1) {
				StString = StString + " " + j;
			}
		}
		StString = StString + ".";
		return StString;
	}

	// Display
	public void printString() {
		String stringResults = toString(mset);
		String stringResults2 = toString(mset3);
		System.out.printf("Union Set: %s\n", stringResults);
		System.out.printf("Intersection Set: %s\n ", stringResults2);
	}
}
