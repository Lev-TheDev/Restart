package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class ProgramA188ExSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		Set<Integer> set = new HashSet<>();
		
		System.out.println("How many students for course A?");
		int studentsA = sc.nextInt();
		for (int i = 0; i < studentsA; i++) {
			int studentCode = sc.nextInt();
			set.add(studentCode);
		}
		
		System.out.println("How many students for course B?");
		int studentsB = sc.nextInt();
		for (int i = 0; i < studentsB; i++) {
			int studentCode = sc.nextInt();
			set.add(studentCode);
		}
		
		System.out.println("How many students for course C?");
		int studentsC = sc.nextInt();
		for (int i = 0; i < studentsC; i++) {
			int studentCode = sc.nextInt();
			set.add(studentCode);
		}
		
		System.out.print("Total students: " + set.size());
				
		sc.close();
	}
	/*
	Set<Integer> a = new HashSet<>();
	Set<Integer> b = new HashSet<>();
	Set<Integer> c = new HashSet<>();
	
	System.out.print("How many students for course A? ");
	int n = sc.nextInt();
	for (int i=0; i<n; i++) {
		int number = sc.nextInt();
		a.add(number);
	}

	System.out.print("How many students for course B? ");
	n = sc.nextInt();
	for (int i=0; i<n; i++) {
		int number = sc.nextInt();
		b.add(number);
	}

	System.out.print("How many students for course C? ");
	n = sc.nextInt();
	for (int i=0; i<n; i++) {
		int number = sc.nextInt();
		c.add(number);
	}
	
	Set<Integer> total = new HashSet<>(a);
	total.addAll(b);
	total.addAll(c);

	System.out.println("Total students: " + total.size());
	*/
}
