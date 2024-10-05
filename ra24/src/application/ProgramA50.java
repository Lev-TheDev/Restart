package application;

import java.util.Scanner;

public class ProgramA50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i < n; i++) {
			// for (int i = 4; i >= 0; i--)  [contagem regressiva]
			int number = sc.nextInt();
			soma += number;
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
