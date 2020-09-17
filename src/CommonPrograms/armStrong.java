package CommonPrograms;

public class armStrong {

	/*A positive number is called armstrong number 
	 * if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407, 1634 etc.
	 * */
	
	public static void main(String[] args) {
   
		 int c=0,a,temp;  
		    int n=153;//It is the number to check armstrong  		    
		    
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  // if digit count is 4 like 1634 -> a*a*a*a
		    
		    }  
		    System.out.println(c);
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   
		  
		    
		    }
		    
	}
