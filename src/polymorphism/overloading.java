package polymorphism;

public class overloading {
	//overloading for main mathds
	public static void main(String[] args){System.out.println("main with String[]");}  
	public static void main(String args){System.out.println("main with String");}  
	public static void main(){System.out.println("main without args");}  

}

//=======================>>>>>type permotion

//class OverloadingCalculation3{  
//	  void sum(int a,long b){System.out.println("a method invoked");}  
//	  void sum(long a,int b){System.out.println("b method invoked");}  
//	  
//	  public static void main(String args[]){  
//	  OverloadingCalculation3 obj=new OverloadingCalculation3();  
//	  obj.sum(20,20);//now ambiguity  
//	  }  
//	} 

//==========================>>>>Q) Why Method Overloading is not possible by changing the return type of method only?
//
//In java, method overloading is not possible by changing the return type of the method only because of ambiguity. Let's see how ambiguity may occur:

//class Adder{  
//static int add(int a,int b){return a+b;}  
//static double add(int a,int b){return a+b;}  
//}  
//class TestOverloading3{  
//public static void main(String[] args){  
//System.out.println(Adder.add(11,11));//ambiguity  
//}}  


//========================>>>>>QCan we overload java main() method?
//
//Yes, by method overloading. You can have any number of main methods in a class by method overloading. 
//But JVM calls main() method which receives string array as arguments only. 
//Let's see the simple example:

class TestOverloading4{  
	
}  