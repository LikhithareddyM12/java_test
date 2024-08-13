package java_test;

import java.util.Scanner;

public class Fibonacci_series {

	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of terms: ");
	        int n = scanner.nextInt();
	        scanner.close();

	        int first = 0, second = 1;

	        System.out.print("Fibonacci Series: " + first + " " + second);

	        for (int i = 3; i <= n; i++) {
	            int nextNumber = first + second;
	            System.out.print(" " + nextNumber);
	            first = second;
	            second = nextNumber;
	        }
	    }
	}
