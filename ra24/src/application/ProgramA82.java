package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramA82 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Would you like to realize an initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
			if (Character.toUpperCase(resp) == 'Y') {
				System.out.print("Enter initial deposit value: ");
				double initialDeposit = sc.nextDouble();
				account = new Account(number, holder, initialDeposit);
				System.out.println();
			} else {
				account = new Account(number, holder);
				System.out.println();
			}
		
		System.out.println("Account data:");
		System.out.println(account);
		System.out.println();

		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.addValue(deposit);
		System.out.println("Updated account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double wd = sc.nextDouble();
		account.withdrawValue(wd);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}

}
