package compositionn;

public class celebrate {

	private String name;
	private tuna birthday;

	public celebrate(String theName, tuna theDate) {
		name = theName;
		birthday = theDate;
	}

	public String toString() {
		return String.format("My name is %s , my bday is %s", name, birthday);
	}
}
