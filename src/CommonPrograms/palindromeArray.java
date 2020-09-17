package CommonPrograms;

import java.util.Scanner;

public class palindromeArray {

	/*
	 * A palindrome number is a number that is same after reverse. 
	 * For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
	 * It can also be a string like LOL, MADAM etc. 
	 * */
	
	public static void main(String[] args) {
		
		String original, reverse="";
        Scanner sc= new Scanner(System.in);
        original = sc.nextLine();
        System.out.println(sc);
		
        for(int i=original.length()-1;i>=0;i--) {
        	reverse= reverse + original.charAt(i);
        }
        if (original.equals(reverse))  
            System.out.println("Entered string/number is a palindrome.");  
         else  
            System.out.println("Entered string/number isn't a palindrome.");   
        
        // 2nd Method
        
        int j=121;
        int temp=j;
        int r=0, sum=0;
        while(j>0) {
        	r=j%10;
        	sum=(sum*10)+r;
        	j=j/10;
        }
        System.out.println(sum==temp); // 121==121
        }
	}


