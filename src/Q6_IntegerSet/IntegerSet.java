package Q6_IntegerSet;

public class IntegerSet {
	private static final int Length = 99;
	private boolean[] a, b;
	IntegerSet mset, mset2;

	public IntegerSet() {
		a = new boolean[Length];
	}
// the value will be added to the Index value
	public boolean getElement(int i) {
		return a[i];
	}

	// insert the element
	public void insertElement(int k) {
		a[k] = true;
	}

	// delete the element
	public void deleteElement(int k) {
		a[k] = false;
	}

	// Uniion of 2 set
	public void Generate_union(IntegerSet integerSet2) {
		mset = new IntegerSet();

		for (int j = 0; j < Length; j++) {
			if (this.getElement(j)) {
				mset.insertElement(j);
			}
		}

		for (int j = 0; j < Length; j++) {
			if (integerSet2.getElement(j)) {
				mset.insertElement(j);
			}
		}
	}
//Intersection of 2 sets

	public void Intersection(IntegerSet inttset) {
		mset2 = new IntegerSet();
		for (int j = 0; j < Length; j++) {
			if (inttset.getElement(j) == true && this.getElement(j) == true) {
				mset2.insertElement(j);
			}
		}
	}

	public String toString(IntegerSet unionSet) {
		String StString = "";
		for (int j = 0; j < Length; j++) {
			if (unionSet.getElement(j)) {
				StString = StString + " " + j;
			}
		}
		StString = StString + ".";
		return StString;
	}

	public void printString() {
		String stringResults = toString(mset);
		String stringResults2 = toString(mset2);
		System.out.printf("Union Set: %s\n", stringResults);
		System.out.printf("Intersection Set: %s\n", stringResults2);
	}
}