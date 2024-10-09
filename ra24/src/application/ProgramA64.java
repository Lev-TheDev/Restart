package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramA64 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measure of triangle X:");
		double xa = sc.nextDouble();
		double xb = sc.nextDouble();
		double xc = sc.nextDouble();
		
		System.out.println("Enter the measure of triangle Y:");
		double ya = sc.nextDouble();
		double yb = sc.nextDouble();
		double yc = sc.nextDouble();
		
		double ax = xarea(xa, xb, xc);
		double ay = yarea(ya, yb, yc);
		
		System.out.printf("Triangle X area: %.4f%n", ax);
		System.out.printf("Triangle Y area: %.4f%n", ay);
		
		System.out.println("Larger area: " + larger_area(ax, ay));
		
		sc.close();
	}
	
	public static double xarea(double xa, double xb, double xc) {
		double p = (xa + xb + xc)/2;
		double area = Math.sqrt(p*(p-xa)*(p-xb)*(p-xc));
		
		return area;
	}
	
	public static double yarea(double ya, double yb, double yc) {
		double p = (ya + yb + yc)/2;
		double area = Math.sqrt(p*(p-ya)*(p-yb)*(p-yc));
		
		return area;
	}
	
	public static String larger_area(double xarea, double yarea) {
		if (xarea > yarea) {
			return "X";
		} else {
		return "Y";
		}
	}

}
