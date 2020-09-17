package collectionsJava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiFunction;

public class Hashmap1 {

	public static void main(String[] args) {

HashMap<Integer, String> hm= new HashMap<Integer, String>();
 hm.put(0,"Gaurav"); 
 hm.put(1, "Gaurav1");
 hm.put(2, "Gaurav2");
 
 System.out.println("List"+hm);
 
 String r= hm.get(2);
 System.out.println("hashmap list :"+r);
 
 Set<Integer> r1= hm.keySet();
 System.out.println("Key Integer list :"+r1);
 
 Collection<String> r2= hm.values();
 System.out.println("Collection of String list:"+r2);
 
 if(hm.isEmpty()) System.out.println("List is empty");
 else System.out.println("List is not empty");
 
 System.out.println(hm.size());
 
 hm.replace(2, "Komal");
 System.out.println("Updated list :"+hm);
  
 boolean h= hm.containsKey(2);
 if(h) System.out.println("Keys is valid");
 else System.out.println("Key is not valid");
 
 boolean h2= hm.containsValue("Gaurav1");
 if(h2) System.out.println("value is valid");
 else System.out.println("value is not valid");
 
 
 HashMap<Integer, String> hm1= new HashMap<Integer, String>();
 hm1.putAll(hm);
 System.out.println("Updated New list :"+hm1);
 
 
 hm1.put(3,"ABC"); 
 hm1.put(4, "GHJ");
 hm1.put(5, "NMB");
 
 hm1.putAll(hm);
 System.out.println("Updated New List :"+hm1);
 
 System.out.println(hm1.size());
 
 // replace 
 hm1.replace(3,"ABC","CCC");
 System.out.println("Updated once replaced new list :"+hm1);
 
 hm1.remove(5);
 System.out.println("Updated once removed new list :"+hm1);
 
 hm1.putIfAbsent(5, "kaurav1222");
 System.out.println(hm1);
 
 System.out.println("**********1st Method to Print************");
 for(Map.Entry b : hm1.entrySet())
	 System.out.println(b.getKey()+" "+b.getValue());
 
 System.out.println("**********2nd Method to Print************");
 Set<Entry<Integer, String>> t= hm1.entrySet();
 Iterator<Entry<Integer, String>> itr= t.iterator();
 while(itr.hasNext()) {
	 Map.Entry n= itr.next();
	 System.out.println(n.getKey()+" "+n.getValue());
 } 
}
}
