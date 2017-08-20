package assignment2_Q1;

public class test {
	void display() {
		String WorkerInfo;
		double grosspay, taxWithHeld;
		TaxableWorker STW = new StateTaxableWorker("Akram", 20, 0.25, "Califonia", 0.5);
		TaxableWorker LTW = new LocalTaxableWorker("Ali", 10, 0.11, "Islamabad", 0.05);

		STW.sethours(20);
		WorkerInfo = STW.workerInfo();
		grosspay = STW.grossPay(20);
		taxWithHeld = STW.taxWithheld();

		System.out.println("======Stateable Worker Information =====\n" + WorkerInfo);
		System.out.println("Gross pay of the Worker =" + grosspay);
		System.out.println("Tax With Held for worker = " + taxWithHeld);

		LTW.sethours(23);
		WorkerInfo = LTW.workerInfo();
		grosspay = LTW.grossPay(20);
		taxWithHeld = LTW.taxWithheld();

		System.out.println("======Local Worker Information =====\n" + WorkerInfo);
		System.out.println("Gross pay of the Worker =" + grosspay);
		System.out.println("Tax With Held for worker = " + taxWithHeld);

	}

}
