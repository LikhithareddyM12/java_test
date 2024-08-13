package java_test;

public class LoopPattern1 {

	public static void main(String[] args) {
	    int num = 8;  
		        int count = 1;

		        for (int i = 0; i < 4; i++) {  
		            for (int j = 0; j < count; j++) {  
		                System.out.print(num + " ");
		                num++;
		            }
		            System.out.println();  
		            count *= 2;  
		        }
		    }
	}


