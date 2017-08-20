package compositionn;

public class tuna {
	private int month;
	private int day;
	private int year;

	public tuna(int m, int d, int y) {
		month = m;
		day = d;
		year = y;

		System.out.printf("The constructor to this class is %s \n ", this);
	}

	public String toString() {
		return String.format("%d/%d/%d,", month, day, year);
	}

}
