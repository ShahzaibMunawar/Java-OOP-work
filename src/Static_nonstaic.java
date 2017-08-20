
public class Static_nonstaic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		number p1 = new number();
		number p2 = new number();
		p1.count();
		p2.count();
		p2.static_show();
		p1.non_show();
	}

}

class number {
	static int k = 0;
	int c = 0;

	void count() {
		k++;
		c++;
	}

	static void static_show() {
		System.out.println(k);
	}

	void non_show() {
		System.out.println(c);
	}
}
