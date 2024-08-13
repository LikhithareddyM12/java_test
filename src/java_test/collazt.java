package java_test;

public class collazt {

	public static void main(String[] args) {
		{
			int n = 6;
		        while (n != 1)
		        {
		            System.out.print(n + " ");
		            if ((n & 1) == 1)
		                n = 3 * n + 1;
		            else
		                n = n / 2;
		        }
		     
		               System.out.print(n);
		
	}
		   
	}
}