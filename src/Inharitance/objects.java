package Inharitance;

//
//public class objects {
//public static void main(String[] args) {
//	box box=new box(5,7,8);
//	vol vol=new vol();
//
//}
//}
//class box{
//	int h=2,l=3,w=4;
//	box(int h,int l,int w){
//		this.h=h;
//		this.l=l;
//		this.w=w;
//	}
//	
//}
//class vol extends box{
//	int h,l,w;
//	vol(){
//		super(5,6,7);
//	}
//}

//a superclass variable can reference a subclass object

//public class objects {
//	int num = 2;
//
//	public static void main(String str[]) {
//		objects s = new sub();
//		// HERE: nothing changes if we write, sub s=new sub();
//		s.supermethod();
//		s.method();
//	}
//
//	void supermethod() {
//		System.out.println("supermethod as in superclass");
//	}
//
//	void method() {
//		System.out.println("num in superclass " + num);
//	}
//}
//
//class sub extends objects {
//	int num = 5;
//
//	void method() {
//		System.out.println("num is sub class " + num);
//	}
//
//	void supermethod() {
//		System.out.println("changed supermethod in sub class");
//	}
//}

//==========================================================================
class A {
	void callme() {
		System.out.println("Inside A's callmemethod");
	}
}

class B extends A {// override callme()
	void callme() {
		System.out.println("Inside B's callmemethod");
	}
}

class C extends A {
	// override callme()
	void callme() {
		System.out.println("Inside C's callmemethod");
	}
}

class objects {
	public static void main(String args[]) {
		A a = new A(); // object of type A
		B b = new B(); // object of type B
		C c = new C(); // object of type C
		A r; // obtain a reference of type A
		r = a; // r refers to an A object
		r.callme(); // calls A's version of callme
		r = b; // r refers to a B object
		r.callme(); // calls B's version of callme
		r = c; // r refers to a C object
		r.callme(); // calls C's version of callme
		System.out.println("prack");
 int a1=40;


	}
}