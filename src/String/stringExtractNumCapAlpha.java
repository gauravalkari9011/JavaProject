package String;

public class stringExtractNumCapAlpha {

	public static void main(String[] args) {

		/*
		 * Extract Capital Alphabet, Lower Alphabet, Number from a String 
		 * */
		
		String g="AAbCCdEEf";
		int h=g.length();
		System.out.println(h);
		
		
		for(char c1='A'; c1<='Z';c1++) 
       {
		//System.out.println(c1);
		for(int i=0;i<h;i++) 
	  {
		if(g.charAt(i)==c1) 
		{
		System.out.println(c1);
		
		}
      }		
	}	
		System.out.println("****************");
		String d="ZxCvBnM";
		System.out.println(d.length());
		
		for(char a='a';a<='z';a++) 
		{
			//System.out.println(a);
		for(int j=0;j<d.length();j++) 
		{	
		if(d.charAt(j)==a) 
		{
		 System.out.println(a);	
		}		
		}
		}
		
		String v="123456cncc";
		System.out.println(v.length());
		
		for(int q=0;q<v.length();q++) {
		{
			  if(Character.isDigit(v.charAt(q)))
				   System.out.print(v.charAt(q)+"  ");
			}
		}
   }
 }