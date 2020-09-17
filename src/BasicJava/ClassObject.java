package BasicJava;

public class ClassObject {
	/*
	 * Static methods allows static and Non-Static method (using object)
	 * Non- Static methods allows static and non-static method directly
	 */
	int t1=10;
	String t2="Gaurav";
	
	static int t3=56;
	
	static String t4="Komal";
	
	public static void main(String args[]) {
		// Direct calling static mtd
		sum(2, 3);	
		System.out.println(sum(2,3));
		
		// Using class Name calling static mtd
		ClassObject.sum(10,5);
		System.out.println(ClassObject.t4);
		
		// Create object and then calling 
		ClassObject obj=new ClassObject();
		
		// calling non static mtd in static mtd
		obj.minus(5,3);
		
		// calling non-static variable in static var
		System.out.println(obj.t2);
		System.out.println(obj.t1);
		
		// Static can direct call
		System.out.println(t3);
		
		// Calling non static mtd into static using obj
		obj.test();
	}
	
	public static int sum(int x, int y) {
		return x+y;
	}

	public int minus(int a, int b) {
		return a-b;
	}
	
	public void test() {
		System.out.println(sum(2,3)); // static
		System.out.println(minus(4,2));	 // Non-Static	
	}
}
