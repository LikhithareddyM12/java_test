package java_test;

import java.util.Scanner;

public class Factor{

			public static void main(String[] args) {
				 Scanner scanner = new Scanner(System.in);
						System.out.print("Enter the number:");
						int num = scanner.nextInt();
					
					    for (int i = 1; i <= num; ++i) {

					      if (num % i == 0) {
					        System.out.print(i +" are factors of given number" );
					      }
					      System.out.println();
					    }
					  }
	
	}


