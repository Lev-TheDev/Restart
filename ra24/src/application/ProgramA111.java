package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
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
		
		LocalDate r1 = LocalDate.ofInstant(d07, ZoneId.systemDefault());
		System.out.println("R1 = " + r1);
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d07, ZoneId.of("Portugal"));
		System.out.println("R3 = " + r3);
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		
		LocalDate pastWeekLD = d04.minusDays(7);
		System.out.println("Past week: " + pastWeekLD);
		
		LocalDateTime pastWeekLDT = d05.minusDays(7);
		System.out.println("Past week LDT: " + pastWeekLDT);
		
		Instant pastWeekI = d06.minus(7, ChronoUnit.DAYS);
		System.out.println("Past week instant: " + pastWeekI);
		
		Duration t1 = Duration.between(pastWeekLDT, d05);
		System.out.println("Duration (days) between past week LDT and d05: " + t1.toDays());
		// duration considera os minutos para calcular, então precisa converter LocalDate em LocalDateTime
		Duration t2 = Duration.between(pastWeekLD.atTime(0, 0), d04.atStartOfDay());
		System.out.println("Duration (days) between past week LD and d04: " + t2.toDays());
		
		
		
		sc.close();
	}
}
