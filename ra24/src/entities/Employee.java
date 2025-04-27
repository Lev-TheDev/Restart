package entities;

public class Employee implements Comparable<Employee>{
	
	private String name;
	public double grossSalary;
	public double tax;
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percentage) {
		this.grossSalary = grossSalary + (grossSalary * (percentage / 100));
	}

	@Override
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}

	@Override
	public int compareTo(Employee o) {
		return name.compareTo(o.getName());
	}

}
