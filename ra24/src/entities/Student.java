package entities;

public class Student {
	
	public String name;
	public double grade_1;
	public double grade_3;
	public double grade_2;
	
	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade_1() {
		return grade_1;
	}

	public void setGrade_1(double grade_1) {
		this.grade_1 = grade_1;
	}

	public double getGrade_3() {
		return grade_3;
	}

	public void setGrade_3(double grade_3) {
		this.grade_3 = grade_3;
	}

	public double getGrade_2() {
		return grade_2;
	}

	public void setGrade_2(double grade_2) {
		this.grade_2 = grade_2;
	}
	
	
	public double finalGrade() {
		return (grade_1 + grade_2 + grade_3);
	}
	
	public String situation() {
		if (finalGrade() >= 60.00) {
			return "PASSED!"; 
		} else {
			double points = 60.00 - finalGrade();
			return "FAILED!" + String.format("\nMISSING %.2f POINTS", points);
		}
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
		
}
