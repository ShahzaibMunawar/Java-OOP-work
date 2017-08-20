package Inharitance;

public class student {

	String name ;
	int age ;

	student(String n, int a) {
		name = n;
		age = a;
	}

}

class undergraduate extends student {
	private int year;

	undergraduate(String a, int b, int c) {
		super(a, b);
		year = c;
	}

	public void display() {
		System.out.println("Name=" + super.name +" "+ "age" + super.age +" "+ "Year" + year);
	}
}

class test {
	public static void main(String[] args) {
		undergraduate std = new undergraduate("shazaib", 1, 1);
		std.display();
	}
}
