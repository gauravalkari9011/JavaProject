package DataTypes;

public class intToString {

	public static void main(String[] args) {
		
		/*
		 *String.valueOf(int i) method takes integer value as an argument and returns a string representing the int argument.
		 * 
		 */
		int ivar = 111;
		String str = String.valueOf(ivar); /*****/
		System.out.println("String1 is: "+str); 
		
		
		/*
		 * Integer.toString(int i) method works same as String.valueOf(int i) method. 
		 * It belongs to the Integer class and converts the specified integer value to String. 
		 * */
		
		int ivar1 = 111;
		String str1 = Integer.toString(ivar1); /*****/
		System.out.println("String2 is: "+str1); 
		
		/*
		 * Using Format
		 * */
		int num = 99;  
		String str2 = String.format("%d",num);  
		System.out.println("hello"+str2);  
		
		
		/*
		 * Note : 
		 * long lvar = 123;
        String str = String.valueOf(lvar);
        String str2 =Long.toString(lvar)
		 * */
		
		/*

1. Java – Convert double to string using String.valueOf(double) method.
2. Convert double to string in Java using toString() method of Double wrapper class.
3. Java – double to string conversion using String.format() method
4. Convert double to string using DecimalFormat.format()
5. Java Convert double to string using StringBuffer and StringBuilder.
   double dnum = 99.9999;  
A. 	String str = String.valueOf(dnum);  
B.	String str = Double.toString(dnum);  
C.   String str = String.format("%f", dnum);  // format
D.   DecimalFormat df = new DecimalFormat("#.000"); // DecimalFormat.format
	String str = df.format(dnum);
	
E.	String buffer : 
	StringBuffer sb = new StringBuffer();
	sb.append(dnum);
	String str = sb.toString();

F.    StringBuilder sb = new StringBuilder();
	sb.append(dnum);
	String str = sb.toString();
		 * 
		 * */
	}
}
