package java_test;

public abstract class Employee {
		  protected String name;
		    protected double baseSalary;

		    public Employee(String name, double baseSalary) {
		        this.name = name;
		        this.baseSalary = baseSalary;
		    }
		    public abstract double calculateSalary();

		    public String getName() {
		        return name;
		    }
		}
		class Manager extends Employee {
		    private double bonus;

		    public Manager(String name, double baseSalary, double bonus) {
		        super(name, baseSalary);
		        this.bonus = bonus;
		    }

		    @Override
		    public double calculateSalary() {
		        return baseSalary + bonus; 
		    }
		}

		class Programmer extends Employee {
		    private double overtimeHours;
		    private double overtimeRate;

		    public Programmer(String name, double baseSalary, double overtimeHours, double overtimeRate) {
		        super(name, baseSalary);
		        this.overtimeHours = overtimeHours;
		        this.overtimeRate = overtimeRate;
		    }

		    @Override
		    public double calculateSalary() {
		        return baseSalary + (overtimeHours * overtimeRate); 
		    }
		}
