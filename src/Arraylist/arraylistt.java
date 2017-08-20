package Arraylist;

import java.util.ArrayList;

public class arraylistt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("all");
		arr.add("all1");
		// arr.iterator();
		arr.add("shahza");
		arr.add("God help me");

		for (String takein : arr) {
			System.out.println(arr);
		}

		for (String takein : arr) {
			System.out.println(takein);
		}
	}
}
