package collectionsJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {

		HashSet<String> s1= new HashSet<String>();
		s1.add("Jay");
		s1.add("Viru");
		s1.add("Gabbar");
		
		Iterator <String > itr= s1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(s1.size());

		if(s1.isEmpty()) System.out.println("List is empty");
		else System.out.println("List is not empty");
		
		s1.remove("Jay"); // Pass the String not an Integer
		System.out.println("After removed item :"+s1);
		
		if (s1.contains("Gabber")) System.out.println(" this item is present");
		else System.out.println("this item is not found");
		
		HashSet <String> s2= new HashSet<String>();
		s2=(HashSet<String>) s1.clone();
		System.out.println("After clone created :"+s2);
		
		s2.clear();
		System.out.println("After cleared  :"+s2.isEmpty());
		
      // removeIf
				
	}
	

}
