package trycatch;

public class tryBasic {

	public static void main(String[] args) {

		System.out.println("******Catch with arithmetic exception**************");
		try {
			int g= 10/0;
			System.out.println(g);
		// If we don't use finally or catch here, compiler is showing to add a finally 	
		}
		catch(ArithmeticException e)    // if we declare here invalid exception  like ArrayIndexOutOfBoundsException , this will show an error. 
		{
		System.out.println("Test the arithmetic execption");
		}
		
		System.out.println("******Catch with generic exception**************");
		try {
			int g= 10/0;
			System.out.println(g);
		// If we don't use finally or catch here, compiler is showing to add a finally 	
		}
		
		catch(Exception e)
		{
			System.out.println("Generic exception");
		}
		
		System.out.println("******Catch with Arthimetic and generic exception**************");
		try {
			int g= 10/0;
			System.out.println(g);
		// If we don't use finally or catch here, compiler is showing to add a finally 	
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Test the arithmetic execption");
		}
		catch(Exception e)
		{
			System.out.println("Generic exception");
		}
		
		/*
		 *if we use generic execption first then it may show error OR specific exception is skipped. 
		 *Generic exception is just showing an error message mentioned by user not providing exact error. So, it should be place in the end place. 
		 * Exaample of error message :
		 * Compile time error: Exception in thread "main" java.lang.Error: 
		 * Unresolved compilation problems: Unreachable catch block for ArithmeticException.
		 * It is already handled by the catch block for Exception Unreachable catch block 
		 * for ArrayIndexOutOfBoundsException. It is already handled by the catch block for
		 * Exception at Example.main(Example1.java:11)
		 * */
		
		System.out.println("************Appropriate exception selection from multiple execption**************");

		try{
	         int arr[]=new int[7];
	         arr[10]=10/5;
	         System.out.println("Last Statement of try block");
	      }
	      catch(ArithmeticException e){
	         System.out.println("You should not divide a number by zero");
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println("Accessing array elements outside of the limit");
	      }

	      System.out.println("I'm out of try-catch block in Java.");
	}

}
