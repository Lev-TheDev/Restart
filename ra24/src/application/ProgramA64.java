package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class ProgramA64 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		
		System.out.println("Enter the measure of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measure of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		System.out.println("Larger area: " + larger_area(areaX, areaY));
		
		sc.close();
	}
	
	public static String larger_area(double xarea, double yarea) {
		if (xarea > yarea) {
			return "X";
		} else {
		return "Y";
		}
	}

}
