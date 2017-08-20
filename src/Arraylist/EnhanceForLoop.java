package Arraylist;

public class EnhanceForLoop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "Apple", "orange", "bannana", "leaves" };
		String store = "0";
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			store = arr[i];
			System.out.println("");
		}
		System.out.println("==================Search an array using advance for loop=========");
		String SToSearch = "orange";
		boolean found = false;
		for (String element : arr) {
			if (store.equals(SToSearch))
				;
			found = true;
		}
		if (found = true) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

	}

}
