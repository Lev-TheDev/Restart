package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramA104 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("\nPosition " + i + "," + j + ":");
					if (j-1 >= 0) {
						System.out.print("Left: " + mat[i][j-1]);
					}
					if (j+1 <= n-1){
						System.out.print("\nRight: " + mat[i][j+1]);
					}
					if (i-1 >= 0){
						System.out.print("\nUp: " + mat[i-1][j]);						
					}
					if (i+1 <= mat.length){
						System.out.print("\nDown: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
		sc.close();
	}

}
