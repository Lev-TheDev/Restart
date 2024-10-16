package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramA70e2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student st = new Student();
		
		st.name = sc.nextLine();
		st.grade_1 = sc.nextDouble();
		st.grade_2 = sc.nextDouble();
		st.grade_3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + st.finalGrade());
		System.out.printf(st.situation());
		
		sc.close();
	}

}
