package collectionsJava;

import java.util.ArrayList;
import java.util.Collections;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		
		String array[]={"Hi", "Hello", "Howdy", "Bye"};

	    /*ArrayList declaration*/
	    ArrayList<String> arraylist= new ArrayList<String>();

	    /*Conversion*/
	    Collections.addAll(arraylist, array);

	    /*Adding new elements to the converted List*/
	    arraylist.add("String1");
	    arraylist.add("String2");

	    /*Display array list*/
	    for (String str: arraylist)
	    {
	 	System.out.println(str);
	    }
	}

}
