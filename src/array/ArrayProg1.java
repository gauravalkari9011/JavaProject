package array;

import java.util.Arrays;

import org.testng.Assert;

public class ArrayProg1 {

	public static void main(String[] args) {
		
		int [] arr1 = new int [] {1, 2, 3, 4, 5};     
        //Create another array arr2 with size of arr1    
       int arr2[] = new int[arr1.length];    
       //Copying all elements of one array into another    
       for (int i = 0; i < arr1.length; i++) {     
           arr2[i] = arr1[i];     
       }      
        //Displaying elements of array arr1     
       System.out.println("Elements of original array: ");    
       for (int i = 0; i < arr1.length; i++) {     
          System.out.print(arr1[i] + " ");    
       }     
           
       System.out.println();    
           
       //Displaying elements of array arr2     
       System.out.println("Elements of new array: ");    
       for (int i = 0; i < arr2.length; i++) {     
          System.out.print(arr2[i] + " ");    
       }
       
       // verify array matched or not
       for(int h=0;h<arr1.length;h++) {
    	   for(int j=0;j<arr2.length;j++) {
    		      if(arr2[j]==arr1[h]) 
    		    	  System.out.println("Array Matched...");
    		      		// OR
    		      Assert.assertEquals(arr1, arr2,"Array Matched again...");
         }
       }
       
       // to print the duplicate elements of an array
   	int [] array1 = new int [] {1, 2, 3, 4, 5,1,3,4};     
       for(int f=0; f<array1.length;f++) {
    	   for(int g=1+f; g<array1.length; g++) {
    		   if(array1[f]==array1[g])
    			   System.out.println(array1[g]);
    	   }
       }
       
    // to print the reverse elements of an array
      	int [] array2 = new int [] {1, 2, 3, 4, 5,6,7,8};
      	for(int p=array2.length-1;p>=0;p--)
      		System.out.println(array2[p]);

        // to print the elements of an array present at odd position
      	int [] array3 = new int [] {10, 12, 23, 34};
       for(int c=1;c<array3.length;c=c+2)
    	   System.out.println(array3[c]);
       
       // to print the elements of an array present at even position
     	int [] array4 = new int [] {10, 12, 23, 34};
      for(int c=0;c<array4.length;c=c+2)
   	   System.out.println(array4[c]);
      
      // to print the 1st, 2nd, 3rd largest elements present
   	int [] array5 = new int [] {10, 42, 23, 34};
   	int max =array5[0];
      for(int w=0;w<array5.length;w++) {
    		  if(array5[w]>max)
    			  max=array5[w];
      }
      System.out.println("Largest element :"+max);
      
      //2nd Method
      Arrays.sort(array5);
      System.out.println("Largest element using 2nd method :"+array5[array5.length-1]);
      System.out.println("2nd Largest element using 2nd method :"+array5[array5.length-2]);
      System.out.println("3rd Largest element using 2nd method :"+array5[array5.length-3]);
      
      // to print the 1st, 2nd, 3rd smallest elements present
   	int [] array6 = new int [] {10, 42, 23, 34};
   	int small =array6[0];
      for(int w=0;w<array6.length;w++) {
    		  if(array6[w]<small)
    			  max=array6[w];
      }
      System.out.println("smallest element :"+small);  
      
      //2nd Method
      Arrays.sort(array6);
      System.out.println("Smallest element using 2nd method :"+array6[0]);
      System.out.println("2nd Smallest element using 2nd method :"+array6[1]);
      System.out.println("3rd Smallest element using 2nd method :"+array6[2]);
      // to print the sum of elements present
   	int [] array7 = new int [] {10, 20, 30, 60, 10};
   	int sum = 0;
         for(int q=0;q<array7.length;q++)
        	 sum = sum + array7[q];
         System.out.println("Sum of an array : "+sum);

         // to find Odd number and even number
         int a[]={1,4,5,2,3,8};  
         System.out.println("Odd Numbers:");  
         for(int i=0;i<a.length;i++){  
         if(a[i]%2!=0){  
         System.out.println(a[i]);  
         }  
         }  
         System.out.println("Even Numbers:");  
         for(int i=0;i<a.length;i++){  
         if(a[i]%2==0){  
         System.out.println(a[i]);  
         }  
         }     
}
}
