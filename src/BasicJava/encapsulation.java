package BasicJava;

public class encapsulation {

	public static void main(String[] args) {
		encapsulationDemo obj = new encapsulationDemo();
	         obj.setEmpName("Mario");
	         obj.setEmpAge(32);
	         obj.setEmpSSN(112233);
	         System.out.println("Employee Name: " + obj.getEmpName());
	         System.out.println("Employee SSN: " + obj.getEmpSSN());
	         System.out.println("Employee Age: " + obj.getEmpAge());
	    } 	
	}
