package String;

public class stringBasic {

	/**
	 * Length / Total number of character in a sentence , Character at CharAt, position - indexOf, Print array ORIndividual characters from given string, 
	 * reverse array
	 * */
	public static void main(String[] args) {
        
		
		// Length
		String t1= "Gaurav";
		int s= t1.length();
		System.out.println("Length of string :"+s);
		
		
		// Total number of character in a sentence
		String string = "The best of both worlds";    
		int cot=0;
		
		for(int y=0;y< string.length();y++) 
		{
			if((string.charAt(y))!= ' ') 
				cot++;		
		}
		System.out.println("Count :"+cot);
		
		
		// print charAt 
		for(int i=0;i<t1.length();i++) {
			System.out.println("Character at "+i+":"+(t1.charAt(i)));  // Get Character by passing position number
		}
		System.out.println("Position of letter :"+t1.indexOf('u')); // Get position number of character by passing character
		
		
		// Print the convert to array  OR Individual characters from given string
		char ch[]= t1.toCharArray();
		for (char c : ch) { 
            System.out.println("Array :"+c); 
		}   
		
		
		// Reverse the String
		String rever="";
		for(int z=(s-1);z>=0;z--) {
			System.out.println(t1.charAt(z));
			 rever= rever+ (t1.charAt(z));
			 //System.out.println(rever);
		}			 
		System.out.println(rever);
	
	}
	}
			 