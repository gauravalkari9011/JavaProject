package BasicJava;



public class mainMtdOveridding {

	public static void main(String args[]) {
		
		MethodOveriding2 obj= new MethodOveriding2();
		obj.addition(); // calling from 2
		obj.sub1(); // calling from 1 due to extend 1 in 2
		obj.sub2(); // calling from 2
		/*
		 * methods are called from 2nd and common mtds are called from 1  and 2
		 * */

		
		System.out.println("**********");
		
		MethodOveriding1 obj1= new MethodOveriding1();
		obj1.addition(); // calling from 1
		obj1.sub1(); // calling from 1
	//	obj1.sub2(); // unable to call from 2 
		/*
		 * methods are called from 1st
		 * */
	
		
		System.out.println();
		System.out.println("**********");
		MethodOveriding1 obj2= new MethodOveriding2(); // when extends keyword used in Methodoveriding 2 class 
		obj2.addition(); // Calling from 2
		obj2.sub1(); // calling from 1 due to extend
		/*
		 * Common methods are called from 1 and 2 mtds
		 * Methods from 1
		 * */
		
	//	MethodOveriding2 obj3= new MethodOveriding1(); // when extends keyword used in Methodoveriding 1 class
		
	}
}
