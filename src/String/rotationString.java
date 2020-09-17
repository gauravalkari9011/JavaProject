package String;

public class rotationString {

	public static void main(String[] args) {
		String st1= "abcde";  
		String st2= "deabc";
		
		if(st1.length()!=st2.length()) {
			System.out.println("Length is not matched");
		}else {
			String str= st1.concat(st1);
			System.out.println("String one :"+str);
			if(str.indexOf(st2)!=-1) {
				System.out.println("String 1 is rotaion of another String");
			}else    
                System.out.println("Second string is not a rotation of first string");    
	}
	}
}
