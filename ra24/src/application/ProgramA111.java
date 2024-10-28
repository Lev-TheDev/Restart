package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProgramA111 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LocalDate d01 = LocalDate.now();
		System.out.println("d01 = " + d01);
		
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("d02 = " + d02);
		
		Instant d03 = Instant.now();
		System.out.println("d03 = " + d03);
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		System.out.println("d04 = " + d04);
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		System.out.println("d05 = " + d05.toString());
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		System.out.println("d06 = " + d06);
		Instant d07 = Instant.parse("2022-07-20T01:30:26-04:00");
		System.out.println("d07 = " + d07);
		
		//LocalDate d08 = LocalDate.parse("2022/07/20");
		// ou se usa a data exatamente com hífen, no padrão, ou usa DateTimeFormatter
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d09 = LocalDate.parse("20/07/2020", fmt1);
		
		//System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d10 = LocalDateTime.parse("20/07/2020 13:51", fmt2);
		System.out.println("d10 = " + d10);
		
		LocalDate d11 = LocalDate.of(2022, 7, 20);
		System.out.println("d11 = " + d11);
		
		
		
		sc.close();
	}
}
