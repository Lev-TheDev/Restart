package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class ProgramA170 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter the contract data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate contractDate = LocalDate.parse(sc.nextLine(), fmt1);
		System.out.print("Contract value: ");
		double amount = sc.nextDouble();
		Contract contract = new Contract(number, contractDate, amount);
		
		System.out.print("Enter the number of installments: ");
		int installments = sc.nextInt();
		
	
		ContractService service = new ContractService(new PaypalService());
		service.processContract(contract, installments);
		
		System.out.println("Installments:");
		for (Installment inst : contract.getListInstallments() ) {
			System.out.println(inst);
		}
		
		sc.close();
	}

}
