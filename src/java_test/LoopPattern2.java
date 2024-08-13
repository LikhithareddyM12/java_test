package java_test;

public class LoopPattern2 {
	public static void main(String[] args) {
		        int rows = 4; 
		        int count = 0; 
		        int num = 1; 
		        for (int i = 1; i <= rows; i++) {
		            
		            for (int j = i; j < rows; j++) {
		                System.out.print(" "); 
		            }

		            for (int j = 1; j <= i; j++) {
		                num++;
		                while (!isPrime(num)) {
		                    num++;
		                }
		                System.out.print(num + "  "); 
		            }
		            System.out.println();
		        }
		    }
		    private static boolean isPrime(int n) {
		        if (n <= 1) return false;
		        for (int i = 2; i <= Math.sqrt(n); i++) {
		            if (n % i == 0) return false;
		        }
		        return true;
		    }
	}


