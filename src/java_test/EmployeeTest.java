package java_test;

public class EmployeeTest {

	public static void main(String[] args) {
	
		        Manager manager = new Manager("likhi", 80000, 15000);
		        System.out.println("Manager: " + manager.getName());
		        System.out.println("Salary: " + manager.calculateSalary());
		        
		        Programmer programmer = new Programmer("lasa", 60000, 10, 50);
		        System.out.println("Programmer: " + programmer.getName());
		        System.out.println("Salary: " + programmer.calculateSalary());
		    }
		}
