package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramA144try {

	public static void main(String[] args) {
		method1();
		System.out.println("End of program!");
				
	}
	
	public static void method1() {
		System.out.println("-----METHOD1 STARTS-----");
		method2();
		System.out.println("-----METHOD1 ENDS-----");
	}
	
	public static void method2() {
		System.out.println("-----METHOD2 STARTS-----");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next();
		}
		catch (InputMismatchException f) {
			System.out.println("Input error!");
		}
		
		sc.close();
		System.out.println("-----METHOD2 ENDS-----");
	}

}
