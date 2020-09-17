package operators;

public class operators2 {

	public static void main(String[] args) {
		
		System.out.println("*****************Bitwise Operators**********************");
		// There are six bitwise Operators: &, |, ^, ~, <<, >> 
		int num1 = 11;  /* 11 = 00001011 */
	     int num2 = 22;  /* 22 = 00010110 */
	     int result = 0;

	     result = num1 & num2;   
	     System.out.println("num1 & num2: "+result);

	     result = num1 | num2;   
	     System.out.println("num1 | num2: "+result);
	    
	     result = num1 ^ num2;   
	     System.out.println("num1 ^ num2: "+result);
	    
	     result = ~num1;   
	     System.out.println("~num1: "+result);
	    
	     result = num1 << 2;   
	     System.out.println("num1 << 2: "+result); result = num1 >> 2;   
	     System.out.println("num1 >> 2: "+result);

	     System.out.println("*************Ternary Operator******************");
	     
	     //This operator evaluates a boolean expression and assign the value based on the result
	     
	    int num10, num20;
	    num10 = 25;
	    /* num1 is not equal to 10 that's why the second value after colon is assigned to the variable num2 */
		
	    num20 = (num10 == 10) ? 100: 200;  // if wrong, select 2nd option
		
	    System.out.println( "num20: "+num20);

		/* num1 is equal to 25 that's why the first value is assigned to the variable num2 */
		num20 = (num10 == 25) ? 100: 200; // if ans correct, select 1st option
		
		System.out.println( "num20: "+num20);
	}

}
