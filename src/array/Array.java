package array;

public class Array {
	
	// Arrays is the class defined in the java.util package
	
	// declaration, instantiation and initialization,Array printing -For Each/ For Loop, Passing array to Method, Passing Anaonymous array  
	/*
	 * Note : Traversing an array means accessing each and every element of the array for a specific purpose. 
	 * Traversing the data elements of an array A can include printing every element, counting the total number of elements, 
	 * or performing any process on these elements.
	 */

	
	public static void main(String[] args) {
		
		int[] a=new int[1]; //declaration and instantiation  
		System.out.println("Length of a :"+a.length);
		
		System.out.println("************************************************************");

		int []a1 = {1,2,3}; //declaration, instantiation and initialization  
		System.out.println("Length of a1: "+a1.length);

		System.out.println("************************************************************");

		int a2[]= {1,2,4,5,6};
		System.out.println("Length of a2 : "+a2.length);

		System.out.println("************************************************************");

		int a3[]= {0};
		System.out.println("Length of a3 : "+a3.length);

		System.out.println("************************************************************");

		int []a4=new int[0]; 
		System.out.println("Length of a4 :"+a4.length);

		System.out.println("************************************************************");

		
		// Array printing 
		for(int i=0;i<a.length;i++) {
			System.out.println("Print array of a :"+a[i]);
		}
		System.out.println("************************************************************");
		
		// Array Printing
		for(int i=0;i<a1.length;i++) {
			System.out.println("Print array of a1 :"+a1[i]);
		}
		System.out.println("************************************************************");
		
		// Printing array 
		
		for(int i:a2)  {
			System.out.println("Print array of a2 : "+i);  
	}
		System.out.println("************************************************************");
		
		// Copy array
		//declaring a source array  
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };  
        //declaring a destination array  
        char[] copyTo = new char[7];  
        //copying array using System.arraycopy() method  
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);  
        //printing the destination array  
        System.out.println(String.valueOf(copyTo));  // caffein

        
        System.out.println("************************************************************");
		
		// Copy array
        int d[]= {1,3,5};
        int f[]=new int[d.length];
        System.arraycopy(d, 0, f, 0, 3);
		System.out.println("Length of F :"+f.length);
		for(int m=0;m<f.length;m++) {
			System.out.println(f[m]); // 1,3,5
		}
		
		System.out.println("************************************************************");

		
		//Java Program to clone the array  
		 
		int arry[]={33,3,4,5};  
		System.out.println("Printing original array:");  
		for(int z:arry)  
		System.out.println(z);  
		  
		System.out.println("Printing clone of the array:");  
		int caryr[]=arry.clone();  
		for(int y:caryr)  
		System.out.println(y);  
		  
		System.out.println("Are both equal?");  
		System.out.println(arry.equals(caryr));  
		
		System.out.println("************************************************************");

		
		//getting the class name of Java array  
		int arr[]={4,1,1};  
			Class<? extends int[]> c=arr.getClass();  
		String name=c.getName();  
		//printing the class name of Java array   
		System.out.println("Class name :"+name);  
		
		System.out.println("************************************************************");

		
		// Passing Array to a Method in Java. Method is out of main loop -static void print.....
		int b[]= {0,9,8,7,6};
		print(b);
		
		System.out.println("************************************************************");

		print(new int[]{10,22,44,66});//passing anonymous array to method. Method is out of main loop -static void print..... 
		
		System.out.println("************************************************************");
			
		//calling method which returns an array  
		int array[]=get();  
		//printing the values of an array  
		for(int k=0;k<array.length;k++)  
		System.out.println(array[k]);  
		System.out.println("************************************************************");
		
	}
	// Both method Refer to '// Passing Array method...'
	static void print(int arr[]) {
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}
	
	//calling method which returns an array  continue from inide main method
	static int[] get() {
		return new int[]{10,30,50,90,60};  
		}
}
