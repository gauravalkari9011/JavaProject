package String;

import org.testng.Assert;

public class stringPalindrome {

	/*
	 * A palindrome number is a number that is same after reverse. 
	 * For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
	 * It can also be a string like LOL, MADAM etc. 
	 * */
	
	public static void main(String[] args) {
	
		String str1= "MADAM";
		
		String rev = "";
		for(int i=str1.length()-1;i>=0;i--) 
		{
			rev= rev + str1.charAt(i);
		}
		System.out.println(rev);
		Assert.assertEquals(rev,str1);
		
		String str2="12321";
		String rev1="";
		for(int j=str2.length()-1;j>=0;j--) 
		{
		rev1=rev1+str2.charAt(j);
		}
		System.out.println(rev1);
		Assert.assertEquals(rev1,str2);
	}	 

}
