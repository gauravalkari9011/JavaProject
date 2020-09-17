package CommonPrograms;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int yr= sc.nextInt();
		
		if(yr==0 || yr==' ')
			System.out.println("Entered Year is not leap year :"+yr);
		else if(yr%4!=0)
			System.out.println("Entered year is not a leap year :"+yr);
		else 
			System.out.println("Entered year is a leap year:"+yr);
		sc.close();
	}

}
