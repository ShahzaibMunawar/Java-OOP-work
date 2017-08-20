package polymorphism;

public class runtimePolyhmorphism {

}
// ==========example 1=============
// class Bike {
// void run() {
// System.out.println("running");
// }
// }
//
// class Splender extends Bike {
// void run() {
// System.out.println("running safely with 60km");
// }
//
// public static void main(String args[]) {
// Bike b = new Splender();// upcasting
// b.run();
// }
// }

// ==============example 2=============
// class Shape {
// void draw() {
// System.out.println("drawing...");
// }
// }
//
// class Rectangle extends Shape {
// void draw() {
// System.out.println("drawing rectangle...");
// }
// }
//
// class Circle extends Shape {
// void draw() {
// System.out.println("drawing circle...");
// }
// }
//
// class Triangle extends Shape {
// void draww() {//not over riding
// System.out.println("drawing triangle...");
// }
// }
//
// class TestPolymorphism2 {
// public static void main(String args[]) {
// Shape s;
// s = new Rectangle();
// s.draw();
// s = new Circle();
// s.draw();
//
//
// s = new Triangle();
// s.draw(); //here method of parent class will be called
// }
// }

// ==========================example 3============
class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("eating bread...");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("eating rat...");
	}
}

class Lion extends Animal {
	void eat() {
		System.out.println("eating meat...");
	}
}

class TestPolymorphism3 {
	public static void main(String[] args) {
		Animal a;
		a = new Dog();
		a.eat();
		a = new Cat();
		a.eat();
		a = new Lion();
		a.eat();
	}
}
