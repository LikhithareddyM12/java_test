package java_test;

	abstract class BankAccount {
	    protected double balance;

	    public BankAccount() {
	        this.balance = 0.0; 
	    }

	    public double getBalance() {
	        return balance; 
	    }

	    // Abstract method for deposit
	    public abstract void deposit(double amount);

	    // Abstract method for withdraw
	    public abstract void withdraw(double amount);
	}

	// SavingsAccount class extending BankAccount
	class SavingsAccount extends BankAccount {

	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount; // Add amount to balance
	            System.out.println("Deposited into Savings Account: " + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount; // Subtract amount from balance
	            System.out.println("Withdrawn from Savings Account: " + amount);
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }
	}

	// CurrentAccount class extending BankAccount
	class CurrentAccount extends BankAccount {

	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount; // Add amount to balance
	            System.out.println("Deposited into Current Account: " + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount > 0) {
	            balance -= amount; // Subtract amount from balance
	            System.out.println("Withdrawn from Current Account: " + amount);
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }
	}
	

	

