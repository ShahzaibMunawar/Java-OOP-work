package assignment2_Q1;

public class StateTaxableWorker extends TaxableWorker {

	double StateTaxRate = 0.5;
	String StateName;

	StateTaxableWorker(String name, double HPR, double FPR, String StateName, double str) {
		super(name, HPR, FPR);
		this.StateName = StateName;
		this.StateTaxRate = str;
	}

	public String workerInfo() {
		return super.workerInfo()+ " \nState Name=" + StateName + "\nState Tax Rate =" + StateTaxRate+ "\nNo of hours worked =" + gethours();
	}

	double taxWithheld() {
		taxWithHeld= grossPay * StateTaxRate;
		return taxWithHeld;
	}

}
