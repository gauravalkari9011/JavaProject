package operators;

public class Operators {

	public static void main(String[] args) {
		
		System.out.println("****************Basic arithmetic operators are: +, -, *, /, % ************************************");
		  int num1 = 100;
	      int num2 = 20;

	      System.out.println("num1 + num2: " + (num1 + num2) );
	      System.out.println("num1 - num2: " + (num1 - num2) );
	      System.out.println("num1 * num2: " + (num1 * num2) ); 
	      System.out.println("num1 / num2: " + (num1 / num2) );
	      System.out.println("num1 % num2: " + (num1 % num2) );
	      
	      System.out.println("*************ASSIGNMENT OPERATORS******************");
	      
	      // Assignments operators in java are: =, +=, -=, *=, /=, %=
	      
	      int num3 = 10;
	      int num4 = 20;
   /*
    * num2= num2+num1 [num2+=num1 ]
    * num2= num2-num1 [num2-=num1 ]
    * .
    * .
    * .
    * .
    * .
    * 
    * */ 

	      
	      num4 = num3;
	      System.out.println("= Output: "+num4);

	      num4 += num3;
	      System.out.println("+= Output: "+num4);
		      
	      num4 -= num3;
	      System.out.println("-= Output: "+num4);
		      
	      num4 *= num3;
	      System.out.println("*= Output: "+num4);
		      
	      num4 /= num3;
	      System.out.println("/= Output: "+num4);
		      
	      num4 %= num3;
	      System.out.println("%= Output: "+num4);
	      
	      System.out.println("***********Auto-increment and Auto-decrement Operators************************");
	      
	      /*
	       * num++ is equivalent to num=num+1;
			 num–- is equivalent to num=num-1;
	       */
	       
	      int num5=100;
	      int num6=200;
	      num5++;  // num5= num5 + 1
	      num6--; // num6 = num6 - 1
	      System.out.println("num5++ is: "+num5);
	      System.out.println("num6-- is: "+num6);
	      
	      System.out.println("************Logical Operators are used with binary variables. They are mainly used in conditional statements and loops for evaluating a condition.*****************************************************");
	     
	      /*
	       * b1&&b2 will return true if both b1 and b2 are true else it would return false.

			 b1||b2 will return false if both b1 and b2 are false else it would return true.

			 !b1 would return the opposite of b1, that means it would be true if b1 is false and it would return false if b1 is true.
	       */
	      
	      boolean b1 = true;
	      boolean b2 = false;

	      System.out.println("b1 && b2: " + (b1&&b2));
	      System.out.println("b1 || b2: " + (b1||b2));
	      System.out.println("!(b1 && b2): " + !(b1&&b2));
	      
	      System.out.println("************************** Comparison(Relational) operators***************************************************************");
	      /*
	       * == returns true if both the left side and right side are equal
			 != returns true if left side is not equal to the right side of operator.
			 > returns true if left side is greater than right.
			 < returns true if left side is less than right side.
			 >= returns true if left side is greater than or equal to right side.
			 <= returns true if left side is less than or equal to right side.
	       */
	      
	      int num11 = 10;
	      int num22 = 50;
	      if (num11==num22) {
		 System.out.println("num11 and num22 are equal");
	      }
	      else{
		 System.out.println("num11 and num22 are not equal");
	      }

	      if( num11 != num22 ){
		 System.out.println("num11 and num22 are not equal");
	      }
	      else{
		 System.out.println("num11 and num22 are equal");
	      }

	      if( num11 > num22 ){
		 System.out.println("num11 is greater than num22");
	      }
	      else{
		 System.out.println("num11 is not greater than num22");
	      }

	      if( num11 >= num22 ){
		 System.out.println("num11 is greater than or equal to num22");
	      }
	      else{
		 System.out.println("num11 is greater than num22");
	      }

	      if( num11 < num22 ){
		 System.out.println("num11 is less than num22");
	      }
	      else{
		 System.out.println("num11 is not less than num22");
	      }

	      if( num11 <= num22){
		 System.out.println("num11 is less than or equal to num22");
	      }
	      else{
		 System.out.println("num11 is greater than num22");
	      }     
	}

}
