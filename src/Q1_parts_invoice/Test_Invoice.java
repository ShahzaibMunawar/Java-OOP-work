package Q1_parts_invoice;

import java.util.Scanner;

public class Test_Invoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice invoice = new Invoice();

		Scanner in = new Scanner(System.in);

		// intializing vaiable with setter
		System.out.println("Enter the part Discription ( String )");
		String inPD = in.nextLine();
		invoice.set_pDisctription(inPD);
		
		System.out.println("Enter the part Name ( String )");
		String inPN = in.nextLine();
		invoice.set_partnumber(inPN);

		System.out.println("Enter the part Quantity ( number)");
		int inpq;
		inpq = in.nextInt();
		invoice.set_pQuantity(inpq);

		System.out.println("Enter the price of Item ( number)");
		double inpp=in.nextDouble();
		invoice.set_price_perItem(inpp);
		


		// calling varable value with getters
		System.out.println("---------Receipt----------");
		System.out.println("Part Number   : " + invoice.get_partnumber());
		System.out.println("pQuantity     : " + invoice.get_pQuantity());
		System.out.println("pDisctription : " + invoice.get_pDisctription());
		System.out.println("price_perItem : " + invoice.get_price_perItem());

		//Display total

		double total = invoice.get_invoiceAmount();
		System.out.println("--------------------------");
		System.out.println(" Total = " + total);
		System.out.println("--------------------------");
	}

}
