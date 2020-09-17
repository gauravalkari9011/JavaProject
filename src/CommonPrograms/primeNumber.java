package CommonPrograms;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {

		/* 0 and 1 are not prime numbers. 
		 * The 2 is the only even prime number because all the other even numbers can be divided by 2.
		*/
		
		Scanner sc= new Scanner(System.in);
		int orgi= sc.nextInt();
		if(orgi== 0 || orgi== ' ' || orgi== 1) {
			System.out.println("Given number is not prime");
		}
		else if(orgi > 1 && orgi%2!=0) {
			   System.out.println("Prime Number :"+orgi);   // **ODD NUMBER*
		}
		   else { 
			   System.out.println("Even Number :"+orgi);
		   }
	}

}
