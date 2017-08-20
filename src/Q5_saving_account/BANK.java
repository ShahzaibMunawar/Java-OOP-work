package Q5_saving_account;

public class BANK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount server1 = new SavingAccount(2000.00);
		SavingAccount server2 = new SavingAccount(3000.00);
		System.out.println("----------------------");
		System.out.println("Server 1");
		System.out.println("----------------------");
		server1.set_AIR(0.04);
		server1.CalculateMonthlyInterest();
		System.out.println("----------------------");
		System.out.println("Server 2");
		System.out.println("----------------------");
		server2.set_AIR(0.05);
		server2.CalculateMonthlyInterest();
		
		System.out.println();
		
	}

}
