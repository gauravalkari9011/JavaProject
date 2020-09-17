package array;

import java.util.Arrays;

public class ArrayProgSortingAscDesc {

	/*
	 * Ascending/ Descending order of an array using 2 methods
	 * 
	 * Sorting using below methods -
	 * A. Using the sort() Method
B. Without using the method
- Using the for Loop
- Using the User Defined Method
	 * 
	 * An array derived from the array is known as subarray.  
	 * For Ex. / sorts subarray form index 2 to 7   Arrays.sort(a, 2, 7);   
	 * */
	public static void main(String[] args) {
		   // Sort the array in ascending  using method 1 / descending order    
        int [] array8 = new int [] {10, 60, 20, 80, 10};
              //Arrays.sort(array8);
        int temp=0;
        	for(int e=0;e< array8.length;e++) {
        		for(int t=e+1; t<array8.length;t++) {
        			if(array8[e]>array8[t]) {  // for ascending order 
        				temp = array8[e];
        			array8[e]=array8[t];
        			array8[t]=temp;
        		}
        	}
	}
    		System.out.println("Print using method 1");
        	for (int e = 0; e < array8.length; e++) {
               System.out.print(array8[e] + " ");  
               System.out.println();
	}
        	System.out.println("**************************************************************");
        	// 2n method of Ascending sorting of an array
        	Arrays.sort(array8, 0, array8.length);
    		System.out.println("Print using method 2");
        	for (int e1 = 0; e1 < array8.length; e1++) {
                System.out.print(array8[e1] + " ");    
 	}
    
        	System.out.println();
        	System.out.println("****************************DESCENDING *************************************");
        	
 		   // Sort the array in descending  using method 1    
            int [] array9 = new int [] {10, 60, 20, 80, 10, 100, 143, 2, 4, 50};
                  
            int temp1=0;
            	for(int e2=0;e2< array9.length;e2++) {
            		for(int t1=e2+1; t1<array9.length;t1++) {
            			if(array9[e2]<array9[t1]) {  // for Descending order, it is < condition
            				temp1 = array9[e2];
            			array9[e2]=array9[t1];
            			array9[t1]=temp1;
            		}
            	}
    	}
        		System.out.println("Print using method 1");
            	for (int ed = 0; ed < array9.length; ed++) {
                   System.out.print(array9[ed] + " ");  
                   System.out.println();
    	}
            	System.out.println("**************************************************************");

            	// 2n method of Descending sorting of an array
            	Arrays.sort(array9);
        		System.out.println("Print using method 2");
            	for (int ed1 = array9.length-1; ed1>0 ; ed1--) {
                    System.out.print(array9[ed1] + " ");    
     	}
    }        		
}
