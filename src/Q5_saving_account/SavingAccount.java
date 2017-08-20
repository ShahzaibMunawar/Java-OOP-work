package Q5_saving_account;

public class SavingAccount {
	static double AIR;
	private double SavaingAmount;
	double MonthInt;

	SavingAccount(double TA) {
		double AIR = 0;
		SavaingAmount = TA;
	}

	void CalculateMonthlyInterest() {
		System.out.println("Before Interest = "+ SavaingAmount);

		MonthInt = (AIR * SavaingAmount) / 12;
		SavaingAmount = SavaingAmount + MonthInt;
		System.out.println("Monthly interest = "+ MonthInt);
		System.out.println("Total amount with interest = " + SavaingAmount);
	}

	void set_AIR(double AIR) {
		this.AIR = AIR;
	}

}
