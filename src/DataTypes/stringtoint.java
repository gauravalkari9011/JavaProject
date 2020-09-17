package DataTypes;

public class stringtoint {

	public static void main(String[] args) {
		
		/*
		 * Integer.valueOf(String) works same as Integer.parseInt(String). 
		 * It also converts a String to int value. 
		 * However there is a difference between Integer.valueOf() and Integer.parseInt(), 
		 * the valueOf(String) method returns an object of Integer class whereas 
		 * the parseInt(String) method returns a primitive int value. 
		 * */		
 // Note: The parseInt() method of Integer wrapper class parses the string as signed integer number

		//  Convert String to int using Integer.parseInt(String) OR Interger.valueOf(String)
		//A
		String str="10000";
		int inum = 10000;

		int inum1 = Integer.parseInt(str); /*****/
		System.out.println("Integer value of"+Integer.valueOf(str)); /************/
		int sum = inum+inum1;
		System.out.println("Result is: "+sum); // 20000
		
		//B
		String str1 ="-500";
		int inumnew=500;
		int inum2 = Integer.parseInt(str1); /************/
		System.out.println("Integer value of"+Integer.valueOf(str1)); /************/
		int sum1 = inumnew+inum2;
		System.out.println("Result is: "+sum1); // 0 (-500+500)
	
		
		// String to int conversion with leading zeroes
		String strLead="00000678";  // 8 digits . so, %08d
	    str = String.format("%08d", Integer.parseInt(strLead)+5);
	    System.out.println("Output String: "+str);
	       
		//C - it is showing error so, commented it to run other code
	/*	String str2 ="500abc";
		int inumnew1=500;
		int inum3 = Integer.parseInt(str2);
		System.out.println("Integer value of"+Integer.valueOf(str2));
		int sum2 = inumnew1+inum3;
		System.out.println("Result is: "+sum2);  // Error : java.lang.NumberFormatException */
		
	   /* Note : 
	      A. Conversion using parseLong(String) method
	       String n1= "88888"
	       a. long num = Long.parseLong(str);
	       b. long num = Long.valueOf(str);
	   */
	    
	    /*
	     * String str="122.202";
           double dnum = Double.parseDouble(str);
           double dnum = Double.valueOf(str);
	     * 
	     * */
	}
}
