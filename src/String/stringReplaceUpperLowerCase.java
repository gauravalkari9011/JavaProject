package String;

public class stringReplaceUpperLowerCase {

	/*
	 *  to replace the spaces of a string with a specific character
	 *  to replace the spaces of a string with a \\s  NEED to CHECK
	 *  to use trim ??
	 *  to do first convert to Upper / lower case vice-versa.
	 *  */
	public static void main(String[] args) {
		String string = "Once in a blue moon";    
        String ch = "-";    
        
        String str = string.replace(" ",ch);
        System.out.println(str);
        
        String str1="Remove white spaces";    
        String str2=str1.replaceAll(" ","\\s"); // Need to check 
        System.out.println(str2);
        
        System.out.println(str1.trim()); // to remove left/right side space if any blank space [need to verify]
        
        
        String str3="Great Power";    
       
        StringBuffer newStr=new StringBuffer(str3);    
            
        for(int i = 0; i < str3.length(); i++) {    
                
            //Checks for lower case character    
            if(Character.isLowerCase(str1.charAt(i))) {    
                //Convert it into upper case using toUpperCase() function    
                newStr.setCharAt(i, Character.toUpperCase(str3.charAt(i)));    
            }    
            //Checks for upper case character    
            else if(Character.isUpperCase(str3.charAt(i))) {    
                //Convert it into upper case using toLowerCase() function    
                newStr.setCharAt(i, Character.toLowerCase(str3.charAt(i)));    
            }    
        }    
        System.out.println("String after case conversion : " + newStr);    
	}

}
