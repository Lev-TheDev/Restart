package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramA103 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i=0; i<mat.length; i++) {
			// para linhas se usa length, para colunas usa o tamanho do vetor correspondente àquela linha
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		for (int i=0; i<n; i++) {
			System.out.println(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers: " + count);
		
		sc.close();
	}

}
