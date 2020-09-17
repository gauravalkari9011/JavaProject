package CommonPrograms;

import java.util.Random;

public class StringFactorialTable {

	public static void main(String[] args) {

		/*
		 * Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!. For example:
			4! = 4*3*2*1 = 24  
			5! = 5*4*3*2*1 = 120  
			Table of 6 -
			
		 */

		Random rd= new Random();
		int k=rd.nextInt(5);
		System.out.println(k);
		int fact=1;
		if(k==0) {
		System.out.println("rerun the execution");
		}else {
		for(int i=1;i<=k;i++) {
			fact=fact*i;

		}
		System.out.println(fact);
	}
		System.out.println("******************* Table of 6: *************");
		int table=0;
		int l=6;
		for(int j=1;j<=10;j++) {
			table=j*l;
			System.out.println(table);
		}
		
	}

	

}
