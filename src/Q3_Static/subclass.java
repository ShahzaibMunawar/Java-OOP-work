package Q3_Static;

public class subclass {
	// this static number will hold the number of objects
	static int serialnumber;

	public subclass() {
		serialnumber++;
	}
	public void count() {
System.out.println("Total object of  class = " + serialnumber);
	}

}
