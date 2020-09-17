package String;

import java.util.Random;

/*
 * Print pattern , Random number generator
 * 
 * */

public class printPatternRandomNumber {

	public static void main(String[] args) {
		
		Random rd= new Random();
		
		for(int i=0;i<=rd.nextInt(8);i++) 
		{
		for(int j=0;j<=i;j++) 
		{
			System.out.print("* ");
		}
		System.out.println();  // For next line 
		}

		/*
		 * 
* * 
* * * 
* * * * 
	 
		 * */
		
		
		
	// Generate Random number : 
		System.out.println(Math.random());	
		
	// To generate random number between a specified range.

		int min = 200;  
		int max = 400;  
		
		//Generate random double value from 200 to 400   
		System.out.println("Random value of type double between "+min+" to "+max+ ":");  
		double a = Math.random()*(max-min+1)+min;   
		System.out.println(a);  
	
		//Generate random int value from 200 to 400   
		System.out.println("Random value of type int between "+min+" to "+max+ ":");  
		int b = (int)(Math.random()*(max-min+1)+min);  
		System.out.println(b);    			
	}

}
