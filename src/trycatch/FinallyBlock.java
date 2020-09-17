package trycatch;



public class FinallyBlock {

	public static void main(String[] args) {
		
			System.out.println("********************1st Example - Catch and Finally executed with try error***************************************");
		try {
			int x= 10/0;
			System.out.println(x);
		}
		catch(ArithmeticException e)
		{
	         System.out.println("Number should not be divided by zero");
	    } 
		finally 
		{
			System.out.println("Finally Block executed");
		}
    // catch executed first then finally block due to exception error
	
	System.out.println("*******************2nd Example ******Try correct and Finally executed and catch skipped***************************");
		
		try {
			int a1[]= new int[4];
			a1[2]=5;
			System.out.println("Array correct");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Array index limit");
		}
		finally 
		{
			System.out.println("Finally executed");
		}
		
		System.out.println("*******************3rd Example- try correct and Finally executed without catch*********************************");
		
		try {
			int h= 12/1;
			System.out.println(h);
		    }
		    finally{
		    	System.out.println("Finally block 2nd executed");
		    }
		// Finally executed first then try block exception is displayed
		// try with finally is possible without catch block
		
		

System.out.println("*******************4th Example- try incorrect and Finally executed with incorrect catch exception*********************************");
		
		try {
			int h= 12/0;
			System.out.println(h);
		    }catch (ArrayIndexOutOfBoundsException e) {
		    	System.out.println("Incorrect exception");
		    }
		    finally{
		    	System.out.println("Finally block 2nd executed");
		    }

		
		System.out.println("*******************5th Example- try incorrect and Finally executed without catch*********************************");
		
		try {
			int h= 12/0;
			System.out.println(h);
		    }
		    finally{
		    	System.out.println("Finally block 2nd executed");
		    }
		// Finally executed first then try block exception is displayed
		// try with finally is possible without catch block


	
	   //NOTE : System.exit(0); it is comment if it executed then finally block will get skipped
}
}