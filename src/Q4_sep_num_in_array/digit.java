package Q4_sep_num_in_array;

import java.util.Scanner;

public class digit {
	Scanner in = new Scanner(System.in);
	int arr[] = new int[10];
	int mod = 0;

	void cheak() {

		System.out.println("Enter a number");
		int MainNumber = in.nextInt();

		while (MainNumber > 0) {
			 mod = MainNumber % 10;
System.out.println(MainNumber);
			for (int i = 0; i < 10; i++) {
				if (i == mod) {
					arr[i] = arr[i] + 1;
				}
			} // end for loop
			MainNumber = MainNumber / 10;
		} // end of while

	}// end of cheak method

	void show() {
		for (int i = 0; i < 10; i++) {
			System.out.println("At pistion "+i+" ="+arr[i]);
		}
	}

}//end digit class