package BasicJava;

public class MethodOverloading {

	public static void main(String[] args) {
    /*
     * Same method with different return date is not allowed in method overloading.
     * 
     */		
		}
	
	public void startSent() {
		System.out.println("test the 1st sentence");
	}
	
	public void startSent(int a) {
		int b=10*a;
		System.out.println(b);
	}
	
	public void startSent(double a) {
		double b=10*a;
		System.out.println(b);
	}
	
	public int startSent(int a, int b) {
		return a+b;
	}

}
