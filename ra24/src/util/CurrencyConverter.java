package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double total(double dollar, double amount) {
		double total_money = dollar * amount;
		return total_money + (total_money * IOF);
	}

}
