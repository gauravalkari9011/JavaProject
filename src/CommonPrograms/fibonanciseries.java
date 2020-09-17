package CommonPrograms;

public class fibonanciseries {

	public static void main(String[] args) {

		int n0=0, n1=1, count=10, n=0;
		System.out.println(n0);
		System.out.println(n1);
		
		for(int i=1;i<=count;++i) {
			n=n0 + n1;
			System.out.println(n);
			n0=n1;
			n1=n;
		}
	}

}
