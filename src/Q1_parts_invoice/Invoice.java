package Q1_parts_invoice;

public class Invoice {
	String partnumber;
	int pQuantity;
	String pDisctription;
	double price_perItem;

	// constructor that asign values to each variable
	Invoice() {
		partnumber = "0";
		pQuantity = 0;
		pDisctription = "0";
		price_perItem = 0;

	}

	// =======================Geters & Setters=======================
	void set_partnumber(String p) {
		partnumber = p;
	}

	String get_partnumber() {
		return partnumber;
	}

	void set_pQuantity(int pq) {
		pQuantity = pq;
	}

	int get_pQuantity() {
		return pQuantity;
	}

	void set_pDisctription(String pd) {
		pDisctription = pd;
	}

	String get_pDisctription() {
		return pDisctription;
	}

	void set_price_perItem(double ppi) {
		price_perItem = ppi;
	}

	double get_price_perItem() {
		return price_perItem;
	}
	// ==============================================

	double get_invoiceAmount() {
		double total = 0.0;
		//true when both price and quantity is positive
		if (price_perItem <= 0.0 || pQuantity <= 0) {
			System.out.println("Either Item price or Item Quantity Invalid");
			price_perItem = 0;
			pQuantity = 0;
		} else {
			total = price_perItem * pQuantity;

		}

		return total;

	}// end calculation method

}
