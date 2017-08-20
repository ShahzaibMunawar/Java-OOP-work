package Generics;


public class Generic_class<T> {
	   private T t;

	   public void add(T t) {
	      this.t = t;
	   }

	   public T get() {
	      return t;
	   }

	   public static void main(String[] args) {
	      Generic_class<Integer> integerBox = new Generic_class<Integer>();
	      Generic_class<String> stringBox = new Generic_class<String>();
	    
	      integerBox.add(new Integer(10));
	      integerBox.add(new Integer(20));
	      integerBox.add(new Integer(30));
	      
	      stringBox.add(new String("Hello World"));

	      System.out.printf("Integer Value :%d\n\n", integerBox.get());
	      System.out.printf("String Value :%s\n", stringBox.get());
	      try{
	      System.out.println("hello gnab");
	      int i = 0;
	      i=i/0;
	      }
	      finally{
	    	  System.out.println("hello gnab g");
	      }
	      }
	   
	}