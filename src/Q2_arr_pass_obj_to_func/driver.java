package Q2_arr_pass_obj_to_func;

public class driver {
	public static void main(String[] args) {
		IntegerSet2 set1 = new IntegerSet2();
		IntegerSet2 set2 = new IntegerSet2();
//1st set
		set1.insertElement(3);
		set1.insertElement(9);
		set1.insertElement(2);
		set1.insertElement(7);
		set1.insertElement(8);
//2nd set	
		//inset element
		set2.insertElement(6);
		set2.insertElement(7);
		set2.insertElement(3);
		set2.insertElement(9);
		//delete element
		set2.deleteElement(9);
//union
		set1.Generate_union(set2);
		set1.intersection(set2);
		set1.printString();

	}
}
