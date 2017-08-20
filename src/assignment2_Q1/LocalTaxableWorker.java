package assignment2_Q1;

public class LocalTaxableWorker extends TaxableWorker {

	String CityName;
	double CityTaxRate = 0.025;

	LocalTaxableWorker(String name, double HPR, double FPR, String cityName, double citytaxrate) {
		super(name, HPR, FPR);
		this.CityName = cityName;
		this.CityTaxRate = citytaxrate;
	}

	public String workerInfo() {
		return "City Name=" + getName() + "\nHourly Pay Rate =" + getHrPayRate() + "\nFederal Pay Rate ="
				+ getFedPayRate() + "\nCity Name=" + CityName + "\nCity Tax Rate =" + CityTaxRate
				+ "\nNo of hours worked =" + gethours();
	}

	double taxWithheld() {
		taxWithHeld = grossPay * CityTaxRate;
		return taxWithHeld;
	}

}
