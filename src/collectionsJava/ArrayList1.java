package collectionsJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.testng.Assert;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<Integer>();
			list.add(1);
		    list.add(2);
		    list.add(3);
		    list.add(4);
		    list.add(5);
		    
	System.out.println("******Using For Loop**********");	    
	for(Integer obj: list) {
		System.out.println(obj);
	}	    
		    
	System.out.println("Using Iterator print data");
	Iterator<Integer> itr= list.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
	System.out.println("************Get value of the position******************");
	int t1= list.get(0);
	System.out.println(t1); // get value of that position
	
	System.out.println("********************REMOVE correct value : *****************************");
	list.remove(0);
	System.out.println("Updated ArrayList :"+list);
	
	System.out.println("********************REMOVE incorrect value : *****************************");
	int f= list.indexOf(22);
	System.out.println("Get Index value of :"+f);
	
	
	System.out.println("****************Add new option ***************************");
	list.add(0, 10);
	System.out.println("Updated ArrayList :"+list);
	
	System.out.println("**********************Check list has XYZ value***********************");
	 if(list.contains(100)) System.out.println("WRONG ENTRY");
	 else System.out.println("CORRECT ENTRY");
	
	System.out.println("**********************Update a value*************************");
	list.set(1, 11);
	System.out.println("Updated ArrayList :"+list);
	
	System.out.println("****************SIZE of ARRAY***************");
	System.out.println(list.size());
	
	System.out.println("******************ARRANGE in ASC ORDER****************");
	Collections.sort(list);
	System.out.println("Updated list :"+list);
	
	System.out.println("*****************CLEAR********************");
	list.clear();
	System.out.println("Updated List" +list);
	
	System.out.println("***********Empty***************");
	if (list.isEmpty()) System.out.println("LIST is EMPTY");
	else System.out.println("LIST IS NOT EMPTY");
	
	
	ArrayList<String> list11= new ArrayList<String>();
	list11.add("Gaurav");
	list11.add("Gaurav1");
	list11.add("Gaurav2");
	list11.add("Gaurav3");
	
	System.out.println("Updated list :"+list11);
	
	ArrayList<String> list12= new ArrayList<String>();
	list12.add("ABC");
	list12.add("ABC1");
	list12.add("ABC2");
	list12.add("ABC3");
	
	System.out.println("NEW ARRAY :"+list12);
	System.out.println("****************TWO ARRAY ADDED************************");
	list12.addAll(list11); // first list 11 array added then list 12 gets added
	System.out.println("Updated array :"+list12);
	
	System.out.println("*******************REMOVE ARRAY*****************************");
	list12.removeAll(list11);
	System.out.println("Updated array :"+list12);
	
	Assert.assertNotSame(list11, list12);
	}
}
