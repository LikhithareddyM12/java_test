package java_test;

public class BankAccountTest {

	public static void main(String[] args) {
	
		        SavingsAccount savings = new SavingsAccount();
		        savings.deposit(500);
		        savings.withdraw(200);
		        System.out.println("Savings Account Balance: " + savings.getBalance());
		        
		        CurrentAccount current = new CurrentAccount();
		        current.deposit(1000);
		        current.withdraw(300);
		        System.out.println("Current Account Balance: " + current.getBalance());
		    }
		}

	