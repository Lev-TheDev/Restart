package entities;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	public double area() {
		// como está usando parâmetros da própria classe, não é preciso escrever o (double a, double b, double c)
		double p = (a + b + c)/2;
		double result = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return result;
		// ou já faz direto = return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}

}
