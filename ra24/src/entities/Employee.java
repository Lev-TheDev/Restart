package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}
