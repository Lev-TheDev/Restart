package application;

import java.util.Scanner;

public class ProgramA27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		// o ENTER gera uma quebra de linha que fica pendente
		// o nextLine vai consumir a quebra de linha pendente
		// resolver: um nextLine() extra após nextInt()
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
