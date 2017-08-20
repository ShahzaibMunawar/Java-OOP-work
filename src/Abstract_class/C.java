package Abstract_class;

public class C extends B {
	C(int a, int b) {
		super(a, b);
	}

	@Override
	void mthdc() {
		// TODO Auto-generated method stub
		System.out.println("mthd c");
	}

	@Override
	void mthda() {
		// TODO Auto-generated method stub
		System.out.println("mthd a");
	}

	@Override
	void mthdb() {
		// TODO Auto-generated method stub
		System.out.println("mthd b");
	}

}

class D {
	public static void main(String[] args) {
		A a = new C(10, 20);
		a.mthda();
		a.mthdb();
		B b = new C(30, 40);
		b.mthdc();
		b.mthdb();
		b.mthda();
	}
}
