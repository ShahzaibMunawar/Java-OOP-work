package Arraylist;

import java.util.ArrayList;

public class tutorialpoint {
	public static void main(String args[]) {
	      // create an array list
	      ArrayList<String> al = new ArrayList<String>();
	      ArrayList<Integer> all = new ArrayList<Integer>();
	      System.out.println("Initial size of al: " + al.size());

	      // add elements to the array list
	      all.add(11);
	      all.add(0,20); 
	      System.out.println(all);
	      al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("B");
	      al.add("D");
	      al.add("F");
	      all.set(1,11);
	      System.out.println("Size of al after additions: " + al.size());

	      // display the array list
	      System.out.println("Contents of al: " + al);

	      // Remove elements from the array list
	      al.remove("F");
	      al.remove(2);
	      System.out.println("Size of al after deletions: " + al.size());
	      System.out.println("Contents of al: " + al);
	   }
}
