package String;

import java.util.Arrays;


public class stringvowelConsoantAnagram {

	public static void main(String[] args) {

    /*
     * 1.To find vowel and consonant count from a string
     * 2. Anagram (output incorrect)
     * */		

	String str = "This is a really simple sentence";
	
	int vv = 0, cc=0;
	for(int i=0;i<str.length();i++) 
	{ 
	if(str.charAt(i)== 'a'||str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i)== 'u'){
		vv++;
	} 
	else if(str.charAt(i)>='a' && str.charAt(i)<= 'z') 
	{
		cc++;	
	} 
	}
	System.out.println(vv);
	System.out.println(cc);
	
	// Anagram program  -	
	  { 
		  
		  String Str1="sab";
		  String Str2="bat";
	       // char str1[] = { 't', 'e', 'w', 't' }; 
	       // char str2[] = { 't', 't', 'e', 'w' }; 
		  char str1[] = Str1.toCharArray();
		  char str2[] = Str2.toCharArray();
	        if (areAnagram(str1, str2)) 
	            System.out.println("The two strings are"
	                               + " anagram of each other"); 
	        else
	            System.out.println("The two strings are not"
	                               + " anagram of each other"); 
	    } 
	}
	 static boolean areAnagram(char[] str1, char[] str2) 
	    { 
	        // Get lenghts of both strings 
	        int n1 = str1.length; 
	        int n2 = str2.length; 
	  
	        // If length of both strings is not same, 
	        // then they cannot be anagram 
	        if (n1 != n2) 
	            return false; 
	  
	        // Sort both strings 
	        Arrays.sort(str1); 
	        Arrays.sort(str2); 
	  
	        // Compare sorted strings 
	        for (int i = 0; i < n1; i++) 
	            if (str1[i] != str2[i]) 
	                return false; 
	  
	        return true; 
	    } 	  
		
}
