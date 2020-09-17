package BasicJava;

import org.testng.annotations.Test;

public class MethodOveriding2 extends MethodOveriding1{
	
	@Test
	public void addition() {
		System.out.println("testing in Method Overring 2");
	}

	public void sub2() {
		System.out.println("Sub from Method Overring 2");
	}

}
