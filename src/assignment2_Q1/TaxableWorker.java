package assignment2_Q1;

public class TaxableWorker {

	private String name;
	private double taxRate = 0.25;
	private double FedPayRate;
	 double taxWithHeld;
	private double hoursWorked;
	double grossPay;

	TaxableWorker(String name, double HPR, double FPR) {
		this.name = name;
		taxRate = HPR;
		FedPayRate = FPR;
	}

	// getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHrPayRate() {
		return taxRate;
	}

	public void setHrPayRate(double hrPayRate) {
		taxRate = hrPayRate;
	}

	public double getFedPayRate() {
		return FedPayRate;
	}

	public void setFedPayRate(double fedPayRate) {
		FedPayRate = fedPayRate;
	}

	public void setgrossPay(double gpr) {
		grossPay = gpr;
	}

	public double getgrossPay() {
		return grossPay;
	}

	public void sethours(double gpr) {
		hoursWorked = gpr;
	}
	public double gethours() {
	 return hoursWorked;
	}

	// ================================================
	public String workerInfo() {
		return "Name=" + name + " \nHourly Pay Rate =" + taxRate + " \nFederal Pay Rate =" + FedPayRate;
	}

	double grossPay(double hr) {
		grossPay = hr * taxRate;
		return grossPay;
	}

	double taxWithheld() {
		taxWithHeld = taxRate * grossPay;
		return taxWithHeld;
	}

}
