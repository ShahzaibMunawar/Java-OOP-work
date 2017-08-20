package Q6_IntegerSet;

public class LetsTestIt {
	public static void main(String[] args) {
		
// declare objects
	    IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
//        now add some values in set
        //set 1
        set1.insertElement(3);
        set1.insertElement(5);
        set1.insertElement(2);
        set1.insertElement(3);
        set1.insertElement(11);
        set1.insertElement(23);
        set1.insertElement(57);
        set1.insertElement(28);
        set1.insertElement(27);
        //set 2
        set2.insertElement(27);
        set2.insertElement(28);
        set2.insertElement(57);
        set2.insertElement(52);
        set2.insertElement(34);
        set2.insertElement(35);
        set2.insertElement(36);
        set2.insertElement(37);
        set2.deleteElement(36);
        set2.deleteElement(52);

        set1.Generate_union( set2 );
        set1.Intersection(set2);
        set1.printString();
		}
}
