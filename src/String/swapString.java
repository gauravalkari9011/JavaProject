package String;
 /*
  * Swapping of a number
  * 
  * */

public class swapString {

	public static void main(String[] args) {
		
		swap("Good", "Morning");
		swap("Excellent", "Evening");
	}
	
	static void swap(String str1, String str2) 
	{	
	int len1= str1.length();
	System.out.println(len1);
	
	str1= str1 + str2;
	System.out.println("String total :"+str1);

	str2=str1.substring(0,len1);
	System.out.println("String 2 :"+str2);
	 
	str1=str1.substring(len1,str1.length());
	System.out.println("String 1 :"+str1);
	}
}
