package java_test;

public class NumberPredicateTest {

	    public static void main(String[] args) {
	        NumberPredicate isPositive = (number) -> number > 0;
	        NumberPredicate isNegative = (number) -> number < 0;
	        NumberPredicate isEven = (number) -> number % 2 == 0;

	       
	        int[] numbers = {5, -3, 0, 12, -8};

	        System.out.println("Checking numbers:");
	        for (int number : numbers) {
	            System.out.println("Number: " + number);
	            System.out.println("Is Positive: " + isPositive.test(number));
	            System.out.println("Is Negative: " + isNegative.test(number));
	            System.out.println("Is Even: " + isEven.test(number));
	            System.out.println();
	        }
	    }
	}

