package DataTypes;

import java.util.Scanner;

public class ch_intASCII {
    /*
     * ASCII Value in Java OR ch to int
     * 
     * */
	public static void main(String[] args) {
		
		// Assigning a Variable to the int Variable
		char ch1 = 'a'; 
		System.out.println(ch1);// a
		
		int a= ch1;
		System.out.println(a); // ASCII value - 97
		
		
		int ch2='c';
		System.out.println(ch2); // ASCII value - 99
		
	//Using Type-Casting
	//Type-casting is a way to cast a variable into another datatype.	
		
		//characters whose ASCII value to be found  
		char ch11 = 'a';  
		char ch22 = 'b';  
		//casting or converting a charter into int type  
		int ascii1 = (int) ch11;  
		int ascii2 = (int) ch22;
		System.out.println("1 :"+ascii1+" : 2 :"+ascii2);  //97, 98
		
		
		// Using Scanner -
		System.out.print("Enter a character: ");  
		Scanner s = new Scanner(System.in);  
		char chr = s.next().charAt(0);  
		int asciiValue = chr;  
		System.out.println("ASCII value of given number is "+asciiValue); // 11-> 49
	
	
	
	for(int i = 0; i <= 255; i++)  
	{  
	System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  
	}  
		
	System.out.println("******************************************************************************");
	
	{	
	for(int i = 65; i <= 90; i++)  
	{  
	System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  
	}  
	}  
}
}